package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> ints = new HashMap<Integer, String>();
	
	public static void main(String[] args) {
 
		new LogSearch();
	
	}

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();

	public LogSearch() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setSize(400, 400);
		JPanel panel = new JPanel();
		panel.setVisible(true);
		frame.add(panel);

		button1.setVisible(true);
		button1.addActionListener(this);
		button1.setText("button 1");
		button2.setVisible(true);
		button2.addActionListener(this);
		button2.setText("button 2");
		button3.setVisible(true);
		button3.addActionListener(this);
		button3.setText("button 3");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.pack();

	}
	/*
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Button 1 task >>
	 * 
	 * Create a GUI with three buttons. Button 1: Add Entry When this button is
	 * clicked, use an input dialog to ask the user to enter an ID number. After an
	 * ID is entered, use another input dialog to ask the user to enter a name. Add
	 * this information as a new entry to your HashMap.
	 * 
	 * button 2 task>>
	 *
	 * Button 2: Search by ID When this button is clicked, use an input dialog to
	 * ask the user to enter an ID number. If that ID exists, display that name to
	 * the user. Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List When this button is clicked, display the entire list in a
	 * message dialog in the following format: ID: 123 Name: Harry Howard ID: 245
	 * Name: Polly Powers ID: 433 Name: Oliver Ortega etc...
	 * 
	 * When this is complete, add a fourth button to your window. Button 4: Remove
	 * Entry When this button is clicked, prompt the user to enter an ID using an
	 * input dialog. If this ID exists in the HashMap, remove it. Otherwise, notify
	 * the user that the ID is not in the list.
	 *
	 */

	@Override
	// button 1 task
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			String userID = JOptionPane.showInputDialog("Enter ID number");
			int ID = Integer.parseInt(userID);
			String userName = JOptionPane.showInputDialog("Enter Name");
			ints.put(ID, userName);
		}
		if(e.getSource().equals(button2)) {
			String userid= JOptionPane.showInputDialog("Enter ID number");
			int ID2 = Integer.parseInt(userid);
			ints.containsKey(userid))
		}

	}
}
