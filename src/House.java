
//Author: Jay Patel, 000881881

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class House
{
    private double x;
    private final double y;
    private final double size;
    private int occupants;
    private final Color color;
    private final String title; //only for king's house
    private Door door;
    private  Window window;

    //constructor for Normal house
    public House(double x,double y,double size,Color color)
    {
        this.x=x;
        this.y=y;
        this.size=size;
        this.color=color;
        this.title="";
        this.occupants=(int) (1000+(Math.random()*3000));
        this.door = new Door(x + (size / 2),  y+ (size /2.5 ), (size / 3.75 ));
        this.window = new Window(x + (size / 2.5) , y + (size / 5) + ((size - (size / 6)) / 8), size / 8);

    }


    //constructor for King's house
    public House(double x, double y)
    {
        this.size=300;
        this.x=x;
        this.y=y;
        this.color=Color.ORANGE;
        this.title="King’s house";
        this.door = new Door(x + (size / 2),  y+ (size / 3), size / 3);
        this.window = new Window(x + (size / 2.75) , y + (size / 5) + ((size - (size / 6)) / 8), size / 8);


    }
    public double getSize()
    {
        return size;
    }
    public int getOccupants()
    {
        return occupants;
    }

    //Method to draw House
    public void draw(GraphicsContext gc)
    {
        gc.setFill(color);
        gc.fillRect(x+(size/4),y+(size/6),size/2,size/2);

        this.door.draw(gc);
        this.window.draw(gc);

        gc.setStroke(Color.WHITE);
        gc.fillText(title, x+(size/4), y+10);
    }
}