import java.util.Random;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class PersonUI extends BorderPane {
   private Label msgLabel = new Label();
   private TextField idField = new TextField();
   private TextField fNameField = new TextField();
   private TextField mNameField = new TextField();
   private TextField lNameField = new TextField();
   private TextField emaildField = new TextField();
   private TextField phoneField = new TextField();
   //... mNameField, lNameField, emailField, phoneField

   private Button createButton = new Button("New...");
   private Button updateButton = new Button("New...");
   private Button deleteButton = new Button("New...");
   private Button firstButton = new Button("New...");
   private Button prevButton = new Button("New...");
   private Button nextButton = new Button("New...");
   private Button lastButton = new Button("New...");
   //... updateButton, deleteButton, firstButton, prevButton,
   //... nextButton, lastButton

   private PersonBean bean = new PersonBean();

   public void personUI() {
      setPadding(new Insets(10, 10, 10, 10));
      setTop(msgLabel);
      setCenter(initFields());
      setBottom(initButtons());
      setFieldData(bean.moveFirst());
   }

   private Pane initButtons() {
      HBox box = new HBox();
      box.setAlignment(Pos.CENTER);
      box.setSpacing(5);
      box.getChildren().add(createButton);
      createButton.setOnAction(new ButtonHandler());
      box.getChildren().add(updateButton);
      //...
      box.getChildren().add(lastButton);
      lastButton.setOnAction(new ButtonHandler());
      return box;
   }

   private Pane initFields() {
      GridPane grid = new GridPane();
      grid.setAlignment(Pos.CENTER);
      grid.setPadding(new Insets(10, 10, 10, 10));
      grid.setHgap(20);
      grid.setVgap(2);
      grid.add(new Label("ID"), 1, 0);
      grid.add(idField, 2, 0);
      idField.setEditable(false);
      grid.add(new Label("First Name"), 1, 1);
      grid.add(fNameField, 2, 1);
      //...
      return grid;
   }

   private Person getFieldData() {
      Person p = new Person();
      p.setPersonId(Integer.parseInt(idField.getText()));
      //...
      return p;
   }

   private void setFieldData(Person p) {
      idField.setText(String.valueOf(p.getPersonId()));
      //...
   }

   private boolean isEmptyFieldData() {
      //...
	  return false;
   }

   private class ButtonHandler implements EventHandler<ActionEvent> {
      @Override
      public void handle(ActionEvent e) {
         Person p = getFieldData();
         if (e.getSource().equals(createButton)
         && createButton.getText().equals("Save")) {
            if (isEmptyFieldData()) {
               msgLabel.setText("Cannot create an empty record");
               return;
            }
            if (bean.create(p) != null)
               msgLabel.setText("New person created successfully.");
            createButton.setText("New...");
         } else if (e.getSource().equals(createButton)
            && createButton.getText().equals("New...")) {
            p.setPersonId(new Random().nextInt(Integer.MAX_VALUE) + 1);
            p.setFirstName("");
            //...
            setFieldData(p);
            createButton.setText("Save");
         } else if (e.getSource().equals(updateButton)) {
            if (isEmptyFieldData()) {
            msgLabel.setText("Cannot update an empty record");
            return;
         }
         if (bean.update(p) != null)
            msgLabel.setText("Person with ID:"
            + String.valueOf(p.getPersonId()
            + " is updated successfully"));
         } else if (e.getSource().equals(deleteButton)) {

            if (isEmptyFieldData()) {
               msgLabel.setText("Cannot delete an empty record");
               return;
            }
            p = bean.getCurrent();
            bean.delete();
            msgLabel.setText("Person with ID:"
            + String.valueOf(p.getPersonId()
            + " is deleted successfully"));
         } else if (e.getSource().equals(firstButton)) {
            setFieldData(bean.moveFirst());
         } else if (e.getSource().equals(prevButton)) {
            setFieldData(bean.movePrevious());
         } else if (e.getSource().equals(nextButton)) {
            setFieldData(bean.moveNext());
         } else if (e.getSource().equals(lastButton)) {
            setFieldData(bean.moveLast());
         }
      }
   }
}