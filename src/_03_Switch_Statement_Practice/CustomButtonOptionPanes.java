package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "We go to church today");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null, "Start of school :(");
		case "Tuesday": 
			JOptionPane.showMessageDialog(null, "STEAM+");
		case "Wednesday":
			JOptionPane.showMessageDialog(null, "Early release!");
		case "Thursday":
			
		}
	}
}
