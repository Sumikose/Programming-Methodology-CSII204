 
import acm.graphics.*;
import acm.program.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
 
public class Dcar1 extends GraphicsProgram {
   
	private GObject gobj; 
	public GRect b,b1;  
	car1 c1=new car1(200,100);  
	int i=10; 
	
	public void run() {
	 
	 
	addMouseListeners();
	 
	b= new GRect(10,10);
	b1= new GRect(10,10);
	 
	 
	add(b,10,10);
	add(b1,30,10);
	add(c1, 10,10);

	}
	 
	public void mousePressed(MouseEvent e) {
	      
	      gobj = getElementAt(e.getX(), e.getY());
	      
	      if( gobj == b)
	          {  i=i+5;
	         c1.setLocation(i, 10); }
	      
	      
	      if( gobj == b1)
	          {   i=i-5;
	      c1.setLocation(i, 10); }
	      
	    }
	 
	}