package eachAnimation;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class PlainHello extends Application {

    @Override
    public void start(Stage primaryStage) {
        //テキストの設定
        Text text = new Text("Hello, world! Java is God.");
        text.setFill(Color.DARKMAGENTA);
        text.setFont(Font.font("Serif", FontWeight.SEMI_BOLD, 50));
        //テキストのサイズ取得
        double textWidth = text.getLayoutBounds().getWidth();
        double textHeight = text.getLayoutBounds().getHeight();


        //レンダリング
        Group group = new Group(text);
        group.setLayoutY(300);
        group.setLayoutX(400-textWidth/2);
        Scene scene = new Scene(group, 800, 600); // (8)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Plain Hello Java");
        primaryStage.show();
    }

}