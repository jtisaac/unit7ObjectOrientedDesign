import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */

    private Ellipse2D.Double circle;
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        // initialize instance variables
        super( center, radius, color);
        circle = new Ellipse2D.Double(center.getX(),center.getY(),radius*2, radius*2);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public boolean isInside(Point2D.Double point)
    {
        //Double dist = new Double(Math.pow(Math.pow((this.getCenter().getX()-point.getX()),2)+Math.pow((this.getCenter().getY()-point.getY()),2),0.5));
        //if (dist < this.getRadius()-5)
        //{
            //return true; 
        //}
        //circle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        return circle.contains(point.getX(),point.getY());//false;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public boolean isOnBorder(Point2D.Double point)
    {   
        circle = new Ellipse2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        //Double dist = new Double(Math.pow(Math.pow((this.getCenter().getX()-point.getX()),2)+Math.pow((this.getCenter().getY()-point.getY()),2),0.5));
        //if (dist > getRadius()-5 && dist < getRadius() + 3)
        //{
        //    return true;
        //}
        //return false;
        Double semi = new Double(Math.pow(this.getCenter().getX()-point.getX(),2)+Math.pow(this.getCenter().getY()-point.getY(),2));
        Double ptrad = new Double(Math.pow(semi,0.5));
        Double diff = Math.abs(this.getRadius()-ptrad);
        if ( diff < 5 )
        {
            return true;
        }
        return false;
    }
    //public void move(double x , double y)
    //{
    //    circle = new Ellipse2D.Double(x-this.getRadius(),y-this.getRadius(),this.getRadius()*2, this.getRadius()*2);
    //    System.out.println(x);
    //}
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void draw(Graphics2D g2, boolean filled)
    {   circle = new Ellipse2D.Double(this.getCenter().getX(),this.getCenter().getY(),this.getRadius()*2,this.getRadius()*2);
        g2.setColor(this.getColor());
        g2.draw(circle);
        if(filled == true)
        {
            g2.fill(circle);
        }

    }
}
