import java.util.ArrayList;
import java.util.List;

public class Work {

	private List<Integer> list1 = new ArrayList<>();
	private List<Integer> list2 = new ArrayList<>();
	Object lock1 = new Object();
	Object lock2 = new Object();

	public void addListOne() {

		synchronized (lock1) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

			list1.add(1);
		}

	}

	public void addListTwo() {

		synchronized (lock2) {

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}

			list2.add(1);
		}
	}

	public void process() {

		for (int i = 0; i < 1000; i++) {
			addListOne();
			addListTwo();
		}

	}

	public void main() {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {

				process();

			}

		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {

				process();

			}

		});

		long start = System.currentTimeMillis();

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		long end = System.currentTimeMillis();

		System.out.println("List One : " + list1.size() + " List Two : " + list2.size());
		System.out.println("Time Taken : " + (end - start));

	}

}
