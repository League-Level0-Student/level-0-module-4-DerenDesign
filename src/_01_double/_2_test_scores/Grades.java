package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Grades {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What is your test score");
		double x = Double.parseDouble(answer);
		if (x > 90 ) {
			System.out.print("Nice job!");
		}
		else {
			if (x < 90) {
				System.out.print("Keep trying!");
			}
		}
	}
}
