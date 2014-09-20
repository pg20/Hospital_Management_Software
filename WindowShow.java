/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

/**
 *
 * @author 007
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class WindowShow { 

	public static void setNativeLookAndFeel() {
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e) {
			System.out.println("Error setting native LAF: " + e);
		}
	}
	
	public static JFrame openInJFrame(Container content, int width, int height, String title, Color bgColor) {
		class ExitListener extends WindowAdapter implements WindowListener{
			public void windowClosing(WindowEvent event) {
				System.exit(0);
			}
		}
		JFrame frame = new JFrame(title);
		frame.setBackground(bgColor);
		content.setBackground(bgColor);
		frame.setSize(width, height);
		frame.setContentPane(content);
		frame.addWindowListener(new ExitListener());
		frame.setVisible(true);
		return(frame);
	}
	
	public static JFrame openInJFrame(Container content, int width, int height, String title) { 
		return(openInJFrame(content, width, height, title, Color.green));
	}
	
	public static JFrame openInJFrame(Container content, int width, int height) {
		return(openInJFrame(content, width, height,content.getClass().getName(), Color.green));
	}
}


