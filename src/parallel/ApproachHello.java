package parallel;

import javafx.animation.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.util.Duration;

public class ApproachHello extends Application {

    @Override
    public void start(Stage primaryStage) {
        //テキストの設定
        Text text = new Text("Hello, world! Java is God.");
        text.setFill(Color.DARKMAGENTA);
        text.setFont(Font.font("Serif", FontWeight.SEMI_BOLD, 40));
        //テキストのサイズ取得
        double textWidth = text.getLayoutBounds().getWidth();
        double textHeight = text.getLayoutBounds().getHeight();

        //Fade
        FadeTransition transition = new FadeTransition(Duration.seconds(4));
        transition.setFromValue(0.5);
        transition.setToValue(1);
        //Scale
        ScaleTransition scale = new ScaleTransition(Duration.seconds(4));
        scale.setFromX(1);
        scale.setFromY(1);
        scale.setToX(4);
        scale.setToY(4);
        //Rotate
        RotateTransition rotate = new RotateTransition(Duration.seconds(4));
        rotate.setToAngle(240);
        //Sum
        ParallelTransition parallelTransition = new ParallelTransition(text, transition, scale, rotate);
        parallelTransition.setCycleCount(Animation.INDEFINITE);
        parallelTransition.setInterpolator(Interpolator.LINEAR);
        parallelTransition.setAutoReverse(true);
        parallelTransition.play();

        //レンダリング
        Group group = new Group(text);
        group.setLayoutY(300);
        group.setLayoutX(400 - textWidth / 2);
        Scene scene = new Scene(group, 800, 600); // (8)
        primaryStage.setScene(scene);
        primaryStage.setTitle("Approach Hello Java");
        primaryStage.show();
    }

}