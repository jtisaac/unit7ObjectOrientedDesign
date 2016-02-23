import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
/**
 * Write a description of class DrawingEditor here.
 * border layout class
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    
    private JFrame daframe;
    private JPanel dapanel;
    private JButton pickcolor;
    private JButton addcircle;
    private JButton addsquare;
    
    private static final int FRAMEHEIGHT = 800;
    private static final int FRAMEWIDTH = 1000;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        String title = "Drawing Editor";
        this.daframe = new JFrame(title);
        this.dapanel = new JPanel();
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel();
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
