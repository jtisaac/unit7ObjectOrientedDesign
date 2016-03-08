import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * For circles
 * 
 * @author (Joseph Isaac) 
 * @version (FINAL)
 */
public class Circle extends Shape
{
    /** the circle */

    private Ellipse2D.Double circle;
    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super( center, radius, color);
        circle = new Ellipse2D.Double(center.getX()-radius,center.getY()-radius,radius*2, radius*2);
    }

    /**
     * @return    if the point is inside the shape or not
     */
    public boolean isInside(Point2D.Double point)
    {
        return circle.contains(point);
    }

    /**
     * If the point is on the border or not
     */
    public boolean isOnBorder(Point2D.Double point)
    {   
        Rectangle2D.Double rekt = new Rectangle2D.Double(point.getX()-15,point.getY()-15,15,15);
        return circle.intersects(rekt);
    }

    /**
     * Draws the circle
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