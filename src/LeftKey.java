import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LeftKey extends JFrame {
	JLabel label;
	String loveJava;

	LeftKey () {
			setTitle("LeftKey");
			setSize(400, 200);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setLayout(new FlowLayout());

			loveJava = "Love Java";
			label = new JLabel(loveJava);
			label.setSize(80, 20);
			label.addKeyListener(new KeyAdapter() {
				
		public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			String moveString = loveJava.substring(1) + loveJava.substring(0, 1);
			loveJava = new String(moveString);
			label.setText(moveString);
			}
			}
			}
					);
			add(label);

			setVisible(true);
			label.requestFocus();
	}

	public static void main(String[] args) {
		new LeftKey();
	}
}