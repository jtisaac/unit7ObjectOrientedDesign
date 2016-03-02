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
        Color c = this.canvas.getColor();//Color.WHITE; 
        //this.canvas.pickColor(c);
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
            //if (event == "Pick Color")
            //{
                
            }
        
        }
    public class MouseClickListener implements MouseListener
    {
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
    }
}
