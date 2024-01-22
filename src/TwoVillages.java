//Author: Jay Patel, 000881881

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;

    public class TwoVillages extends Application {

        public void start(Stage stage) throws Exception
        {
            //to draw canvas
            Group root = new Group();
            Scene scene = new Scene(root);
            Canvas canvas = new Canvas(1000, 650); //parameters for canvas
            stage.setTitle("The World of 'Two Villages'"); //title of window
            root.getChildren().add(canvas);
            stage.setScene(scene);
            GraphicsContext gc = canvas.getGraphicsContext2D();

            gc.setFill(Color.BLACK); //canvas background color
            gc.fillRect(0, 0, 1000, 650); //background color size

            gc.setFill(Color.WHITE);
            gc.fillText( "\u00a9 Jay Patel, \n 000881881", 920 , 620); // u00a9 for copyright symbol

            Village v1 = new Village(); //creates new village as an object
            v1.Village("Oakville", 20, (int) (100 + (Math.random() * 100)), Color.BLUE);
            v1.draw(gc); //to draw village 1

            Village v2 = new Village(); //creates Second village as an object
            v2.Village("Burlington", 300, (int) (400 + (Math.random() * 100)), Color.GREEN);
            v2.draw(gc); //to draw village 2

            House kinghouse = new House(400 +(Math.random() * 250),10+ (Math.random() * 100) ); //creates king's house
            kinghouse.draw(gc); //to draw king's house


            stage.show();
        }
        public static void main(String[] args){
            launch(args);
        }

    }

