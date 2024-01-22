
//Author: Jay Patel, 000881881

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Door {
    public final double x;
    public final double y;
    public final double height;

    //constructor for door
    public Door (double x, double y, double height) {
        this.x=x;
        this.y=y;
        this.height=height;
    }

    //Method to draw Door
    public void draw(GraphicsContext gc) {
        gc.setFill(Color.WHITE);
        gc.fillRect(x,y,height/2,height);
    }
}
