import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Click extends JFrame {
	JLabel label;
	int x, y;

	Click () {
		setTitle("Chapter 10. Exercise 6");
		setSize(450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
// x, y
		x = 100;
		y = 100;
//label
		label = new JLabel("C");
		label.setSize(50, 50);
		label.setLocation(x, y);
//MouseListener Clicked
		label.addMouseListener(new MouseAdapter () {
			public void mouseClicked (MouseEvent e) {
				Random ran = new Random();
				x = ran.nextInt(400);
				y = ran.nextInt(400);
				label.setLocation(x, y);
			}
		}
				);
//add
		add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Click();
	}
}