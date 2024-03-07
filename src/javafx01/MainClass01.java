package javafx01;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class MainClass01 extends Application{
	@Override
	public void start(Stage arg0) throws Exception {
		System.out.println("start 실행");
		Label lb = new Label();
		lb.setFont(new Font(30)); // 글자 크기
		lb.setText("안녕하세요"); // 글자 입력
		
		Scene scane = new Scene(lb, 300, 300);
		arg0.setScene(scane);
		
		arg0.setTitle("제목을 설정합니다");
		arg0.show();
	}
	public static void main(String[] args) {
		launch(args); 
	}
}
