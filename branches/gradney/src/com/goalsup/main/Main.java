package com.goalsup.main;

// Java core packages
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Java extension packages
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Main extends JApplet implements ActionListener {
	
	// declare global (instance) variables
	String g_strApplicationName = "GoalsUp!";		// initialize the value of the Application Name
	JLabel g_lblEmail, g_lblPassword;
	JTextField g_fldEmail;
	JPasswordField g_fldPassword;
	JButton g_btnSignIn;
	
	// initializing the applet (for browser use, which will eventually become better UI)
	public void init(){

		Container appContainer = getContentPane();
		appContainer.setLayout( new FlowLayout() );
		
		// create the Email label, text field and add both to applet
		g_lblEmail = new JLabel( "Email: " );
		g_fldEmail = new JTextField( 20 );
		appContainer.add( g_lblEmail );
		appContainer.add( g_fldEmail );
		
		// create the Password label, password field and add both to applet
		g_lblPassword = new JLabel( "Password: " );
		g_fldPassword = new JPasswordField( 20 );
		appContainer.add( g_lblPassword );
		appContainer.add( g_fldPassword );
		
		// create the Sign In button and add to applet
		g_btnSignIn = new JButton( "Sign In" );
		g_btnSignIn.addActionListener( this );
		appContainer.add( g_btnSignIn );		
		
	}// end init()

	// action to perform when Sign In button is pressed by user
	public void actionPerformed( ActionEvent actionEvent ){

		// declare/instantiate local variables
		String strEmail = g_fldEmail.getText();
		String strPassword = g_fldPassword.getText();		// this is ONLY for testing and should be removed.
		
		// display confirmation message
		JOptionPane.showMessageDialog( null 
				, "Welcome " + strEmail + " to " + g_strApplicationName 
				+ "\nWe recommend a stronger password than *" + strPassword 
				+ "* to increase your security."
				, "GoalsUp! - going above and beyond schooling!"
				, JOptionPane.PLAIN_MESSAGE );

	}// end actionPerformed()
	
}// end class Main
