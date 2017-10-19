package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		// 1. Create a Stack of Doubles
		Stack<Double> numbers = new Stack<Double>();
		// Don't forget to import the Stack class
		Random k = new Random();
		// 2. Use a loop to push 100 random doubles between 0 and 100 to the
		// Stack.
		for (int i = 0; i < 100; i++) {
			numbers.push(k.nextDouble() * 100);

		}
		// 3. Ask the user to enter in two numbers between 0 and 100, inclusive.
		String numb1 = JOptionPane.showInputDialog(null, "enter a number 0-100");
		int num = Integer.parseInt(numb1);
		String numb2 = JOptionPane.showInputDialog(null, "enter a number 0-100");
		int numb = Integer.parseInt(numb2);
		// 4. Pop all the elements off of the Stack. Every time a double is
		// popped that is between the two numbers entered by the user, print it
		// to the screen.
		int size = numbers.size();
		for (int i = 0; i < size; i++) {
			double d = numbers.pop();

			if (num < d && numb > d) {

				System.out.println(d);

			}

		}

		// EXAMPLE:
		// NUM 1: 65
		// NUM 2: 75

		// Popping elements off stack...
		// Elements between 65 and 75:
		// 66.66876846
		// 74.51651681
		// 70.05110654
		// 69.21350456
		// 71.54506465
		// 66.47984807
		// 74.12121224
	}
}
