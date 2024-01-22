
//Author: Jay Patel, 000881881

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Window {
    private final double x;
    private final double y;
    private final double diameter;

    //constructor for door
    public Window(double x,double y,double diameter)
    {
        this.x=x-(diameter/2);
        this.y=y-(diameter/2);
        this.diameter= diameter;
    }

    //Method to draw Door
    public void draw(GraphicsContext gc)
    {
        gc.setFill(Color.WHITE);
        gc.fillOval(x, y,diameter, diameter);
    }
}