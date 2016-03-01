import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton pickcolor;
    private JButton addcircle;
    private JButton addsquare;
    private JPanel color;
    private DrawingPanel canvas;
    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.canvas = canvas;
        this.pickcolor = new JButton( "Pick Color" );
        this.add( pickcolor );
        this.addcircle = new JButton( "Add Circle" );
        this.add( addcircle );
        addsquare = new JButton( " Add Square" );
        this.add( addsquare );
        color = new JPanel();
        this.add(color);
        ClickListener listener = new ClickListener();
        this.pickcolor.addActionListener( listener );
        
        this.addcircle.addActionListener( listener );
        
        this.addsquare.addActionListener( listener );
    }
    public class ClickListener implements ActionListener
    {
        //private String name;

        //public ClickListener(String buttonName)
        //{
        //  this.name = buttonName;
        //}

        public void actionPerformed( ActionEvent event )
        {
            //label.setText("Button" + event.getActionCommand()+ "Was clicked");
            
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
    public void sampleMethod(int y)
    {
        // put your code here

    }

}
