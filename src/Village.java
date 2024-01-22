
//Author: Jay Patel, 000881881

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;


public class Village {
    private double x;
    private double y;
    private double size;
    private String name;
    private Color color;
    private House h1;
    private House h2;
    private House h3;

    //constructor for village which has 3 house
    public void Village(String name, int x,int y,Color color)
    {
        this.x=x;
        this.y=y;
        this.name=name;
        this.size =(Math.random()*5000+3000);

        this.h1=new House(x,y-100,200,color); //house 1
        this.h2=new House(x+140,y-90,180,color); //house 2
        this.h3=new House(x+280,y-80,160,color); //house 3
    }

    //Method to draw Village (3 house)
    public void draw(GraphicsContext gc)
    {
        h1.draw(gc); //to draw house 1
        h2.draw(gc); //to draw house 2
        h3.draw(gc); //to draw house 3
        gc.setFill(Color.WHITE);
        gc.fillText(name+" (Size:"+ size +" m, Population:"+h1.getOccupants()+")", x+50 , y+60);

    }
}
