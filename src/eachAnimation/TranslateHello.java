package eachAnimation;

import javafx.animation.Animation;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TranslateHello extends Application {

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
        TranslateTransition transition = new TranslateTransition(Duration.seconds(4), text);
        transition.setFromX(0);
        transition.setFromY(textHeight);
        transition.setToX(800-textWidth);
        transition.setToY(600);
        transition.setAutoReverse(true);
        transition.setInterpolator(Interpolator.LINEAR);
        transition.setCycleCount(Animation.INDEFINITE);

        //レンダリング
        Group group = new Group(text);
        Scene scene = new Scene(group, 800, 600); // (8)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Translate Hello Java");
        primaryStage.show();

        transition.play();
    }

}