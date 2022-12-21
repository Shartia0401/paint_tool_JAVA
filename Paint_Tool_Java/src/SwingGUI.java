import java.awt.*;
import javax.swing.*;

public class SwingGUI {

	public static void GUI() {
		System.out.println("Created GUI on EDT?" + SwingUtilities.isEventDispatchThread());
		JFrame f = new JFrame("Swing Paint Demo");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		RectPanel rectPanel = new RectPanel();
		f.add(rectPanel, BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);
	}
}
