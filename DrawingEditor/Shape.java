import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.*;
import java.lang.Math;
import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * Parent class of circle and square.
 * 
 * @author (Joseph Isaac) 
 * @version (FINAL)
 */
abstract public class Shape
{
    /** Variables for the shape */
    private Point2D.Double center;
    private double radius;
    private Color color;

    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double offcenter, double radius,Color color)
    {
        Point2D.Double phemadaour = new Point2D.Double(offcenter.getX()-radius,offcenter.getY()-radius);
        this.center = phemadaour;
        System.out.println(offcenter.getX());
        System.out.println(offcenter.getY());
        System.out.println(radius);
        this.radius = radius;
        this.color = color;
    }

    /**

     * @return    center (or really the upper left-hand corner of the shape)
     */

    public Point2D.Double getCenter()
    {
        return center;
    }

    public Color getColor()
    {
        return color;
    }

    /**
     * @return    radius
     */
    public double getRadius()
    {
        return radius;
    }

    /**
     * Moves the center of the shape
     */
    public void move(double x , double y)
    {
        center = new Point2D.Double(x-radius,y-radius);
        System.out.println(center);
    }

    /**
     * Sets radius of shape
     */
    public void setRadius(double r)
    {
        radius = r;

    }


    abstract public boolean isInside(Point2D.Double point);

    abstract public boolean isOnBorder(Point2D.Double point);

    abstract public void draw(Graphics2D g2, boolean filled);

}
