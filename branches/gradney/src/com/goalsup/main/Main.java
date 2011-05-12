package com.goalsup.main;

// Java extension packages
import javax.swing.JOptionPane;

public class Main {

	// main method starting the Java application
	public static void main( String args[] ){
		
		// declare, initialize local variables
		String strApplicationName = "GoalsUp!";		// general local Name for within main
		String strEmail;
		String strPassword;
		String strConfirmationMessage;
		
		// Ask user for Email Address, Password
		strEmail = JOptionPane.showInputDialog("Hello, please tell me your email address: ");
		strPassword = JOptionPane.showInputDialog("Okay, please tell me your password to access your account: ");

		// Build String with user's information
		strConfirmationMessage = "Welcome to " + strApplicationName + " " + strEmail + ". We hope you're performing well!";
		
		// Display confirmation message to user
		JOptionPane.showMessageDialog(null, strConfirmationMessage, "GoalsUp! - going above and beyond schooling!", JOptionPane.PLAIN_MESSAGE);

		System.exit(0);		// terminate application
		
	}// end main()
	
}// end class Main
