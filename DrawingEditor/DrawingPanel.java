import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Graphics;
import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
<<<<<<< HEAD
import java.util.ArrayList;
//import java.util.ArrayList.Size;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.Math;
=======
>>>>>>> parent of d3635bc... Almost done
/**
 * Write a description of class DrawingPaneel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class DrawingPaneel
     */
    public DrawingPanel()
    {
        // initialise instance variables
        x = 0;
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
    public Color getColor()
    {
        // put your code here
        return Color.white;
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
    public void pickColor()
    {
        // put your code here
        
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
    public void addCircle()
    {
        // put your code here
        
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
    public void addSquare()
    {
        // put your code here
        
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
    public void paintComponent(Graphics g)
    {
<<<<<<< HEAD
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for(int x = shapes.size()-1; x >= 0; x--)
        {
            Shape ape = shapes.get(x);
            if (currShape == null)
            {
                ape.draw(g2, true);
            }
            else if (currShape == ape)
            {
                ape.draw(g2, false);//, currShape
            }
            else
            {
                ape.draw(g2, true);
            }
        }

=======
        // put your code here
        
>>>>>>> parent of d3635bc... Almost done
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
    public Dimension getPreferredSize()
    {
        Dimension dim = new Dimension(100,100);// put your code here
        return dim;
    }
    public class ClickListener implements MouseListener, MouseMotionListener
    {
        //private String name;

        //public ClickListener(String buttonName)
        //{
        //  this.name = buttonName;
        //}
        
        public void mouseClicked( MouseEvent event )
        {
            //setPoint( event.getX(), event.getY() );
        }
        public void mouseEntered( MouseEvent event )
        {
        }
        
        public void mouseExited( MouseEvent event )
        {
        }
        
        public void mousePressed( MouseEvent event )
        {
        }
        
        public void mouseReleased( MouseEvent event )
        {
        }
        public void mouseDragged(MouseEvent e)
        {
<<<<<<< HEAD
            int x = event.getX();
            int y = event.getY();
            Point2D.Double coord = new Point2D.Double(x,y);
            for (Shape ape: shapes)
            {
                if (ape.isInside(coord))
                {
                    currShape = ape;
                    currShape.move(x,y);
                    System.out.println("The cursor is inside the shape!");
                }
                else if (ape.isOnBorder(coord))
                {
                    System.out.println("The cursor is on the border!");
                    Double semi = new Double(Math.pow(currShape.getCenter().getX()-x,2)+Math.pow(currShape.getCenter().getY()-y,2));
                    currShape.setRadius(Math.pow(semi,0.5));
                }
                else
                {
                }
                
            }
            repaint();
=======
            
>>>>>>> parent of d3635bc... Almost done
        }
        public void mouseMoved(MouseEvent e)
        {
        }
        }
}
