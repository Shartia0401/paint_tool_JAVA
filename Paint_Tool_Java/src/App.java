import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class App extends JFrame
{

    JPanel p1, p2;
    Canvas can;

    public App()
    {
        super("그림판");

        ImageIcon image = new ImageIcon("C:\\Users\\Deepvisions\\Desktop\\MicroSoft-Paint.png");
        
    }

    public static void main(String []args)
    {

    }
      
      
}

class MouseMove implements MouseMotionListener
{

    public void mouseDragged(MouseEvent e)
    {
        int x = e.getX();
        int y = e.getY();

        System.out.println(x+","+ y);

    }

    public void mouseMoved(MouseEvent e)
    {

    }

}

class SwingGUI extends JFrame
{
    JPanel p;

    public SwingGUI()
    {
        super("그림판");
        Container c = getContentPane();

        p = new JPanel();
        c.add(p, "Center");
    }
}
