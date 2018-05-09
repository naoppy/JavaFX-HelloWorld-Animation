/**
 * Created by wafa on 1/14/17.
 *
 * Improved by naoppy on 5/9/18
 */

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import javafx.scene.text.Text;

import static javafx.scene.paint.Color.ORANGE;

public class Shapes extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //creating path.
        Path path = new Path();

        //1st line.
        MoveTo moveTo = new MoveTo(108, 71);

        //lines
        LineTo line1 = new LineTo(321,161);
        LineTo line2 = new LineTo(126, 232);
        LineTo line3 = new LineTo(232, 52);
        LineTo line4 = new LineTo(269, 250);
        LineTo line5 = new LineTo(108, 71);

        //adding elements to the path.
        path.getElements().add(moveTo);
        path.getElements().addAll(line1,line2,line3,line4,line5);

        //creating a test.
        Text text = new Text("I drew an arc using javaFx.");
        text.setY(50.0);
        text.setX(200.0);

        //creating a scene object.
        Scene scene = new Scene(new Group(path,text), 400,400);
        scene.setFill(ORANGE);

        primaryStage.setTitle("Star With PathElements");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
