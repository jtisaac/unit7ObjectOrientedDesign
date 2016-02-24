import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        JButton pickcolor = new JButton( "Pick Color" );
        this.add( pickcolor );
        JButton addcircle = new JButton( "Add Circle" );
        this.add( addcircle );
        JButton addsquare = new JButton( " Add Square" );
        this.add( addsquare );
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
    public void sampleMethod(int y)
    {
        // put your code here
        
    }

}
