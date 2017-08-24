package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {


	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	public static void main(String[] args) {
		new GuestBook();
	}

	public GuestBook() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 500);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton addname = new JButton();

		JButton viewname = new JButton();
		panel.add(addname);
		panel.add(viewname);

		
		
		
		
		addname.setText("Add Name");
		viewname.setText("View Name");
		addname.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		

	}

	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
