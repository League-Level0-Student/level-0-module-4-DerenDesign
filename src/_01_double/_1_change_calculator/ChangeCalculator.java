package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String answer = JOptionPane.showInputDialog("How many nickels do you have?");
		int N = Integer.parseInt(answer);
		String answer2 = JOptionPane.showInputDialog("How many dimes do you have?");
		int D = Integer.parseInt(answer2);
		String answer3 = JOptionPane.showInputDialog("How many quarters do you have?");
		int Q = Integer.parseInt(answer3);
		// Convert their answer to an int.   Hint: Integer.parseInt()  

		// Ask the user how many dimes they have, and convert their answer

		// Ask the user how many quarters they have, and convert their answer

		// Calculate how much money the user has.  Hint: Use a double variable 
		double New = N*0.05;
		double New2 = D*0.10;
		double New3 = Q*0.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "You have $" + (New + New2 + New3));
	}
}

