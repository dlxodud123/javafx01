package gridPane;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClass01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		GridPane gp = new GridPane();
		Button bt = new Button("Button");
		gp.setRowIndex(bt, 0); // 세로 0번째 배치
		GridPane.setColumnIndex(bt, 0); // 가로 0번째 배치
		
		Label label = new Label("id 입력 : ");
		Label label01 = new Label("label01");
		GridPane.setConstraints(label, 0, 2); // 가로, 세로
		GridPane.setConstraints(label01, 1, 1); // 가로, 세로
		
		//TextArea ta = new TextArea();
		TextField tf = new TextField();
		gp.setConstraints(tf,1,2);
		
		gp.getChildren().addAll(bt, label, label01, tf);
		
		arg0.setScene(new Scene(gp));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
