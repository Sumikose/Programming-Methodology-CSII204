

import javax.swing.*;

import javax.swing.table.DefaultTableModel;

import java.awt.Color;

import java.awt.GridLayout;

public class lab12 extends JFrame {

	JLabel title, idLabel,  genderLabel, nameLabel, AddressLabel, ContactLabel;
		
	JTextField     idField, genderField, nameField, AddressField, ContactField;

	 

	JButton registerButton, ExitButton;

	 

	JRadioButton male, female;

	 

	ButtonGroup bg;

	 

	JPanel panel;

	 

	JTable table; 

	 

	 

	// Table bolon panel helberjuulelt hiihed hereglene

	DefaultTableModel model;

	JScrollPane scrollpane;

	 

	                

	// Baiguulagch

	              

	lab12() {

	                               

	setSize(700, 360);

	                              

	setLayout(null);

	 

	             //Hayag todorhoiloh  

	 

	title = new JLabel("Registration Form"); 

	 

	title.setBounds(60, 7, 200, 30);

	 

	idLabel = new JLabel("ID");

	 

	idLabel.setBounds(30,50, 60, 30);  
	
	nameLabel = new JLabel("Name");	
	nameLabel.setBounds(30,85, 95, 30); 
	AddressLabel = new JLabel("Address");	
	AddressLabel.setBounds(30,155, 165, 30);
	ContactLabel = new JLabel("Contact");	
	ContactLabel.setBounds(30,190, 200, 30); 

	genderLabel = new JLabel("Gender");
	genderLabel.setBounds(30, 120, 60, 30); 
	 	                         
	// Text avah talbar uusgeh

	idField = new JTextField(); 

	 

	idField.setBounds(95, 50, 100, 30);

	 nameField = new JTextField();
	 nameField.setBounds(95, 90, 100, 30);
	 AddressField = new JTextField();
	 AddressField.setBounds(95, 155, 100, 30);                              
	 ContactField = new JTextField();
	 ContactField.setBounds(95, 195, 100, 30);
	// Radio bottons uusgeh

	 

	male = new JRadioButton("Male");

	 

	male.setBounds(95, 120, 60, 30);

	 

	female = new JRadioButton("Female");

	 

	female.setBounds(155, 120, 70, 30);

	 

	 

	 bg = new ButtonGroup();

	 

	   bg.add(male);

	   bg.add(female);

	   

	   

	//Tovch uusgeh 

	 

	 registerButton = new JButton("Register");

	 

	 registerButton.setBounds(110, 240, 100, 30);

	 ExitButton = new JButton("Exit");
	 ExitButton.setBounds(10, 240, 90, 30);
	 

	 

	 // Frame dee nemj oruulah 

	 

	 

	    add(title);

	 

	    add(idLabel);

	 

	    add(genderLabel);

	 

	    add(idField);

	 

	    add(male);

	 

	    add(female);

	 

	    add(registerButton);

	    add(nameLabel);
	    add(nameField);
	    add(AddressLabel);
	    add(AddressField);
	    add(ContactLabel);
	    add(ContactField);
	    add(ExitButton);
	 

	          // Havtan uusgeh 

	   panel = new JPanel();

	 

	   panel.setLayout(new GridLayout());

	 

	   panel.setBounds(250, 10, 400, 300);

	 

	   panel.setBorder(BorderFactory.createDashedBorder(Color.blue));

	 

	 

	   add(panel);

	 

	 

	 

	      // Husnegt uusgeh bas tiinii helberjuulelt hiih todorhoiloh 

	 

	model = new DefaultTableModel();

	 

	table = new JTable(model); 

	 

	table.setEnabled(false);

	 

	 

	                          // helberjuuleltendee husnegtiin bagana uusgeh 

	 

	model.addColumn("ID");

	 

	model.addColumn("Name");
	
	model.addColumn("Gender");
	model.addColumn("Address");
	model.addColumn("Contact");
	

	 

	 

	 

	              // Husnegtend scroll nemeh 

	 

	scrollpane = new JScrollPane (table, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

	 

	    panel.add(scrollpane);

	 

	 

	    setResizable(false); 

	 

	    setVisible(true);

}
	
	public static void main(String[] args) {       

		 

		new lab12(); 

		 

		                      }

		 

		}