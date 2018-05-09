package eachAnimation;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class FadeHello extends Application {

    @Override
    public void start(Stage primaryStage) {
        //テキストの設定
        Text text = new Text("Hello, world! Java is God.");
        text.setFill(Color.DARKMAGENTA);
        text.setFont(Font.font("Serif", FontWeight.SEMI_BOLD, 32));
        //テキストのサイズ取得
        double textWidth = text.getLayoutBounds().getWidth();
        double textHeight = text.getLayoutBounds().getHeight();

        //アニメーション
        javafx.animation.FadeTransition transition = new javafx.animation.FadeTransition(Duration.seconds(4), text);
        transition.setFromValue(0);
        transition.setToValue(1);
        transition.setAutoReverse(true);
        transition.setCycleCount(Animation.INDEFINITE);

        //レンダリング
        Group group = new Group(text);
        group.setLayoutY(300);
        group.setLayoutX(400 - textWidth / 2);
        Scene scene = new Scene(group, 800, 600); // (8)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fade Hello Java");
        primaryStage.show();

        transition.play();
    }

}