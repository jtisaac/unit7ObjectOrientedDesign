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
import java.util.ArrayList;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.Graphics2D;
import java.lang.Math;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private ArrayList<Shape> shapes;
    private Color currColor;
    private Dimension dim;

    private Shape currShape;
    /**
     * Default constructor for objects of class DrawingPaneel
     */
    public DrawingPanel()
    {
        this.shapes = new ArrayList<Shape>(); 
        //this.currColor = Color.blue;
        this.setBackground(Color.WHITE);
        this.dim = new Dimension(1000, 1000);

        //adds clicking and motion listening
        this.addMouseListener(new ClickListener());
        this.addMouseMotionListener(new ClickListener());
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
        return currColor;
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
        currColor = JColorChooser.showDialog(this, "Pick Color", currColor);
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
        shapes.add(new Circle(new Point2D.Double(100,100), 100, currColor));
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
        shapes.add(new Square(new Point2D.Double(150,150), 100, currColor));
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
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        for (Shape ape : shapes)
        {
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
        public boolean selected;
        public void mouseClicked( MouseEvent event )
        {

        }

        public void mouseEntered( MouseEvent event )
        {
        }

        public void mouseExited( MouseEvent event )
        {
        }

        public void mousePressed( MouseEvent event )
        {   int x = event.getX();
            int y = event.getY();
            Point2D.Double coord = new Point2D.Double(x,y);
            selected = false;
            for (Shape ape: shapes)
            {
                if (ape.isInside(coord))
                {
                    selected = true;
                    currShape = ape;
                }

            }
            if (selected == false)
            {
                currShape = null;
            }
            //g2.unfill(currShape);
            if (selected == true)
            {
                repaint();
            }
        }

        public void mouseReleased( MouseEvent event )
        {
        }

        public void mouseDragged(MouseEvent event)
        {
            int x = event.getX();
            int y = event.getY();
            Point2D.Double coord = new Point2D.Double(x,y);
            for (Shape ape: shapes)
            {
                if (ape.isInside(coord))
                {
                    currShape = ape;
                    currShape.move(x,y);
                    
                }
                else if (ape.isOnBorder(coord))
                {
                    Double semi = new Double(Math.pow(currShape.getCenter().getX()-x,2)+Math.pow(currShape.getCenter().getY()-y,2));
                    currShape.setRadius(Math.pow(semi,0.5));
                }

                repaint();
            }
        }

        public void mouseMoved(MouseEvent event)
        {
        }
    }
}
