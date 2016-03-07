import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */

    private Rectangle2D.Double rect;
    /**
     * Default constructor for objects of class Circle
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        // initialize instance variables
        super( center, radius, color);
        rect = new Rectangle2D.Double(center.getX()-radius,center.getY()-radius,radius*2, radius*2);
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
        //rect = new Rectangle2D.Double(this.getCenter().getX() - this.getRadius(), this.getCenter().getY() - this.getRadius(), 2*this.getRadius(), 2*this.getRadius());
        return rect.contains(point);
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
        rect = new Rectangle2D.Double(this.getCenter().getX() , this.getCenter().getY() , 2*this.getRadius(), 2*this.getRadius());
        //Double dist = new Double(Math.pow(Math.pow((this.getCenter().getX()-point.getX()),2)+Math.pow((this.getCenter().getY()-point.getY()),2),0.5));
        //if (dist > getRadius()-5 && dist < getRadius() + 3)
        //{
        //    return true;
        //}
        //return false;
        Rectangle2D.Double rekt = new Rectangle2D.Double(point.getX()-15,point.getY()-15,15,15);
        return rect.intersects(rekt);
    }

    //public void move(double x , double y)
    //{
    //    rect = new Rectangle2D.Double(x-this.getRadius(),y-this.getRadius(),this.getRadius()*2, this.getRadius()*2);

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
    {   rect = new Rectangle2D.Double(this.getCenter().getX(),this.getCenter().getY(),this.getRadius()*2,this.getRadius()*2);
        g2.setColor(this.getColor());
        g2.draw(rect);
        if(filled == true)
        {
            g2.fill(rect);
        }

    }
}
