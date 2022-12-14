import java.awt.Color;

import acm.graphics.GCompound;
import acm.graphics.GOval;
import acm.graphics.GPolygon;
import acm.graphics.GRect;
import acm.graphics.GRoundRect;
 
public class car1 extends GCompound {
 
 private 	GRect  body, cabin, w1, w2, a1, a2, b1;
 private GOval t1, t2, t11, t12, t3, t5, r8, t6; 
 private 	GRoundRect j1, j2, y1;
 
public car1 (double width, double height){
 
	cabin = new GRect(155, 60);
    body = new GRect(220, 80);
    w1 = new GRect(60, 40);
    w2 = new GRect(70, 40);
    t1 = new GOval(50, 50);
    t2 = new GOval(50, 50);	
    a1 = new GRect(3, 45);
    a2 = new GRect(3, 45);
    y1 = new GRoundRect(25, 10);
    t11 = new GOval(23, 23);
    t12 = new GOval(23, 23);
    t3 = new GOval(10, 50);
    j1 = new GRoundRect(7, 5);
    j2 = new GRoundRect(7, 5);
    t5 = new GOval(16, 16);
    t6 = new GOval(16, 16);
    r8 = new GOval(50,50);
    b1 = new GRect(10,10);
	      
	body.setFilled(true);
	body.setColor(Color.PINK);
	cabin.setFilled(true);
	cabin.setColor(Color.black);
	t1.setFilled(true);
	t1.setColor(Color.black);
	t2.setFilled(true);
	t2.setColor(Color.black);
	a1.setFilled(true);
	a1.setColor(Color.DARK_GRAY);
	a2.setFilled(true);
	a2.setColor(Color.DARK_GRAY);
	w1.setFilled(true);
	w1.setColor(Color.white);
	w2.setFilled(true);
	w2.setColor(Color.white);
	y1.setFilled(true);
	y1.setColor(Color.orange);
	t11.setFilled(true);
	t11.setColor(Color.RED);
	t12.setFilled(true);
	t12.setColor(Color.RED);
	t3.setFilled(true);
	t3.setColor(Color.black);
	j1.setFilled(true);
	j1.setColor(Color.black);
	j2.setFilled(true);
	
	
	j2.setColor(Color.black);
	t5.setFilled(true);
	t5.setColor(Color.orange);
	t6.setFilled(true);
	t6.setColor(Color.orange);
	r8.setFilled(true);
	r8.setColor(Color.yellow);
	b1.setFilled(true);
	b1.setColor(Color.black);

	
	add(cabin,100,50);
	add(body,100,100);
	add(t1,125,155);
	add(t2,250,155);
	add(w1,110,55);
	add(w2,180,55);
	add(a1,145,50);
	add(a2,225,50);
	add(y1,95,170);
	add(t11,140,169);
	add(t12,264,169);
	add(t3,90,90);
	add(j1,190,120);
	add(j2,145,120);
	add(t5,143,173);
	add(t6,267,173);
	add(r8,20,28);
	add(b1,310,99);
 
} }
