package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	Stack<Character> deleted = new Stack<Character>();

	TextUndoRedo() {

		frame.setVisible(true);
		frame.setSize(600, 600);

		frame.add(panel);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		panel.add(label);

	}

	public static void main(String[] args) {
		TextUndoRedo mel = new TextUndoRedo();
		/*
		 * Create a JFrame with a JPanel and a JLabel.
		 * 
		 * Every time a key is pressed, add that character to the JLabel. It should look
		 * like a basic text editor.
		 * 
		 * Make it so that every time the BACKSPACE key is pressed, the last character
		 * is erased from the JLabel. Save that deleted character onto a Stack of
		 * Characters.
		 * 
		 * Choose a key to be the Undo key. Make it so that when that key is pressed,
		 * the top Character is popped off the Stack and added back to the JLabel.
		 * 
		 */

	}
	// insta-@mewesaa

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			if (label.getText().length() > 0) {

				String s = label.getText();
				char c = s.charAt(s.length() - 1);
				deleted.push(c);
				s = s.substring(0, s.length() - 1);
				label.setText(s);
			}
		} else if (e.getKeyCode() == KeyEvent.VK_UP) {
			String s = label.getText();
			char c = deleted.pop();
			s += c;
			label.setText(s);

		} else {
			String s = label.getText();
			char c = e.getKeyChar();
			s += c;
			label.setText(s);

		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
