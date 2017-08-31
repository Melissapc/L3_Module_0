package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {

	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names".
	public static void main(String[] args) {
		new GuestBook();
	}

	ArrayList<String> names=new ArrayList();
	JButton addname = new JButton();
	JButton viewname = new JButton();

	public GuestBook() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(600, 500);
		JPanel panel = new JPanel();
		frame.add(panel);

		panel.add(addname);
		panel.add(viewname);

		addname.setText("Add Name");
		viewname.setText("View Name");
		addname.addActionListener(this);
		viewname.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();
	}
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addname) {
			String name = JOptionPane.showInputDialog(null, "Enter a Name");
			names.add(name);
		}

		if (e.getSource() == viewname) {
			int totalguests=0;
			String finalList = "";
			for (String s : names) {
				totalguests++;
				finalList += "guest # " + totalguests+":" +s + "\n";
			}
			JOptionPane.showMessageDialog(null, finalList);

		}

		// When the "View Names" button is clicked, display a message dialog that displays
		// all the names added to the list. Format the list as follows:
		// Guest #1: Bob Banders
		// Guest #2: Sandy Summers
		// Guest #3: Greg Ganders
		// Guest #4: Donny Doners
	}

}