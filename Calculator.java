import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class calculator extends Application {
	private TextField n1 = new TextField();
	private TextField n2 = new TextField();
	private TextField res = new TextField();
	private Button add = new Button("Add");
	private Button subtract = new Button("Subtract");
	private Button mult = new Button("Multiply");
	private Button div =  new Button("Divide");

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		Text num1 = new Text("Number 1: ");
		Text num2 = new Text("Number 2: ");
		Text result = new Text("Result: ");
		
		HBox h = new HBox(10);
		h.getChildren().add(num1);
		h.getChildren().add(n1);
		h.getChildren().add(num2);
		h.getChildren().add(n2);
		h.getChildren().add(result);
		h.getChildren().add(res);
		h.setAlignment(Pos.TOP_CENTER);
		h.setPadding(new Insets(5,5,0,5));
		
		HBox h2 = new HBox(20);
		h2.getChildren().add(add);
		h2.getChildren().add(subtract);
		h2.getChildren().add(mult);
		h2.getChildren().add(div);
		h2.setAlignment(Pos.BOTTOM_CENTER);
		
		
		BorderPane pane = new BorderPane();
		
		pane.setTop(h);
		pane.setBottom(h2);
		
		
		
	  
		res.setEditable(false);
		
		add.setOnAction(e ->{
			double number1 = Double.valueOf(n1.getText());
		double number2 = Double.valueOf(n2.getText());
			
			res.setText(String.valueOf(number1 + number2));
			
		});
		
		subtract.setOnAction(x ->{
			double z1 = Double.valueOf(n1.getText());
			double z2 = Double.valueOf(n2.getText());
			res.setText(String.valueOf(z1-z2));
		});
		
		mult.setOnAction(y ->{
			double x1 = Double.valueOf(n1.getText());
			double x2 = Double.valueOf(n2.getText());
			
			res.setText(String.valueOf(x1*x2));
		});
		
		div.setOnAction(z ->{
			double c1 = Double.valueOf(n1.getText());
			double c2 = Double.valueOf(n2.getText());
			
			res.setText(String.valueOf(c1/c2));
		});
		
		
		
		arg0.setScene(new Scene(pane,500,80));
		arg0.setTitle("Calculator");
		arg0.show();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}

}
