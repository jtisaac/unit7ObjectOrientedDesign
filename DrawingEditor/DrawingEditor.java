import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
/**
 * Write a description of class DrawingEditor here.
 * border layout class
 * @author (Joseph Isaac) 
 * @version (2/29/15)
 */
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    
    
    
    private static final int FRAMEHEIGHT = 800;
    private static final int FRAMEWIDTH = 1000;
    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        
        //set size
        //default close
        //set visible
        String title = "Drawing Editor";
        this.setTitle(title);
        DrawingPanel canvas = new DrawingPanel();
        ControlPanel controls = new ControlPanel(canvas);
        this.add(canvas, BorderLayout.CENTER);
        this.add(controls, BorderLayout.SOUTH);
        this.setSize(1000,500);
        this.setVisible(true);
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
    public static void main()
    {
        DrawingEditor cool = new DrawingEditor();
        
    }

}
