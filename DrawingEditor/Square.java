import java.awt.*;
import java.awt.geom.*;
import java.lang.Math;
/**
 * For squares
 * 
 * @author (Joseph Isaac) 
 * @version (FINAL)
 */
public class Square extends Shape
{
    /** The square */

    private Rectangle2D.Double rect;
    /**
     * Default constructor for objects of class Circle
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super( center, radius, color);
        rect = new Rectangle2D.Double(center.getX()-radius,center.getY()-radius,radius*2, radius*2);
    }

    /**
     * @return    If the point is inside the square or not
     */
    public boolean isInside(Point2D.Double point)
    {
        return rect.contains(point);
    }

    /**
     * @return    If the point is on the border or not
     */
    public boolean isOnBorder(Point2D.Double point)
    {   
        rect = new Rectangle2D.Double(this.getCenter().getX() , this.getCenter().getY() , 2*this.getRadius(), 2*this.getRadius());
        Rectangle2D.Double rekt = new Rectangle2D.Double(point.getX()-15,point.getY()-15,15,15);
        return rect.intersects(rekt);
    }

    /**
     * Draws the rectangle
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
