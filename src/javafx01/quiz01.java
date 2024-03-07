package javafx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class quiz01 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane();
		fp.setVgap(10);
		fp.setHgap(10);
		for (int i = 1; i <= 10; i++) {
			Button bt = new Button("버튼" + i);
			fp.getChildren().add(bt);
		}
//		Button bt1 = new Button("버튼1");
//		Button bt2 = new Button("버튼2");
//		Button bt3 = new Button("버튼3");
//		Button bt4 = new Button("버튼4");
//		Button bt5 = new Button("버튼5");
//		Button bt6 = new Button("버튼6");
//		Button bt7 = new Button("버튼7");
//		Button bt8 = new Button("버튼8");
//		Button bt9 = new Button("버튼9");
//		Button bt10 = new Button("버튼10");
//		fp.getChildren().add(bt1);
//		fp.getChildren().add(bt2);
//		fp.getChildren().add(bt3);
//		fp.getChildren().add(bt4);
//		fp.getChildren().add(bt5);
//		fp.getChildren().add(bt6);
//		fp.getChildren().add(bt7);
//		fp.getChildren().add(bt8);
//		fp.getChildren().add(bt9);
//		fp.getChildren().add(bt10);
		
		Scene sc = new Scene(fp, 250, 70);
		arg0.setTitle("FlowPaneEX");
		arg0.setScene(sc);
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}

}
