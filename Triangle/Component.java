import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 * Write a description of class Component here.
 * Where yo type most of the code.
 * @author (Joseph Isaac)
 * @version (2/17)
 */
public class Component extends JComponent
{
    /** description of instance variable x (add comment for each instance variable) */
    private int point1x = 0;
    private int point2x = 0;
    private int point3x = 0;
    private int point1y = 0;
    private int point2y = 0;
    private int point3y = 0;
    private Line2D.Double line1;
    private Line2D.Double line2;
    private Line2D.Double line3;
    /**
     * Default constructor for objects of class Component
     */
    public Component()
    {
        point1x = 0;
        point2x = 0;
        point3x = 0;
        point1y = 0;
        point2y = 0;
        point3y = 0;

    }
    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            points are given
     * @post    postconditions for the method
     *            points are drawn
     * @param    y    description of parameter y
     * @return    list of points
     */
    public void makeLine(int point1x,int point2x,int point3x,int point1y,int point2y,int point3y)
    {
        
        if (point3x == 0)
        {
        }
        else if (point2x == 0)
        {
        }
        else if (point1x == 0)
        {
        }
        else
        {
            point1x = 0;
            point2x = 0;
            point3y = 0;
            point1y = 0;
            point2y = 0;
            point3y = 0;
        }
        line1 = new Line2D.Double(0, 0, 30, 40);
        line2 = new Line2D.Double(0, 0, 30, 40);
        line3 = new Line2D.Double(0, 0, 30, 40);
    }
    
    public void drawLine(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(line1,line2,line3);
    }
}
