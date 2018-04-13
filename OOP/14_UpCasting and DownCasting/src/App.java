class Machine {
	
	public void start() {
		System.out.println("Machine Started.");
	}
}

class Camera extends Machine {
	
	@Override
	public void start() {
		System.out.println("Camera Started.");
	}
	
	public void snap() {
		System.out.println("Snapshot Taken.");
	}
	
}

public class App {
	
	public static void main(String[] args) {
		
		Machine mac1 = new Machine();
		mac1.start();
		
		Camera cam1 = new Camera();
		cam1.start();
		cam1.snap();
		
		Machine mac2 = cam1; // UpCasting
		mac2.start();
		//mac2.snap(); 
		
		Camera cam2 = (Camera) mac2; // DownCasting
		cam2.start();
		cam2.snap();
		
		// Be Careful //
		//Camera cam3 = (Camera) mac1;
		//cam3.start();
		//cam3.snap();
	}

}
