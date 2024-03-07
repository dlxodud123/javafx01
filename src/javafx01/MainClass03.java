package javafx01;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class MainClass03 extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		FlowPane fp = new FlowPane(Orientation.VERTICAL); // 세로 배치
		fp.setColumnHalignment(HPos.RIGHT); // 순차적으로 정렬
		fp.setPadding(new Insets(10,10,10,10)); // 위, 오른쪽, 아래, 왼쪽으로 밀어냄 (여백을 준다)
		for (int i = 0; i < 10; i++) {
			fp.getChildren().add(new Button("btn" + (i*i*i*i*10)));
		}
		arg0.setScene(new Scene(fp, 300, 250));
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args);
	}
}
