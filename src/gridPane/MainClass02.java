package gridPane;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass02 extends Application {

	@Override
	public void start(Stage primaryStage) {
		GridPane gp = new GridPane();
		Button bt = new Button("Button");
		
		Label lb = new Label("Label");
		
		gp.setConstraints(bt, 0, 0 );
		GridPane.setConstraints(lb, 1, 1);
		
		gp.getChildren().addAll(bt, lb);
		gp.add(new Button("B1, B0") , 1, 0);
		gp.add(new Label("L0, L1") , 0, 1);
		
		gp.setPadding(new Insets(20));
		//gp.setHgap(50);
		gp.setVgap(50);
		
		primaryStage.setScene(new Scene(gp, 300, 300));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
