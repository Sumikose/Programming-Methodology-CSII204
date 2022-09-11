import java.awt.Color;
import acm.graphics.*;
import acm.program.*;

public class mashin extends GraphicsProgram  {
	GRect body, cabin, w1, w2, a1, a2,lo;
	GOval t1, t2, g1, t11, t12, t3, LI, t4, t5, t6, LI1, lo1; 
	GRoundRect k1, k2, y1;
	
public void run() {
    cabin = new GRoundRect(155, 60);
    body = new GRect(220, 80);
    w1 = new GRoundRect(60, 40);
    w2 = new GRoundRect(70, 40);
    t1 = new GOval(50, 50);
    t2 = new GOval(50, 50);	
    a1 = new GRect(0, 45);
    a2 = new GRect(0, 45);
    g1 = new GOval(10, 80);
    y1 = new GRoundRect(25, 10);
    t11 = new GOval(23, 23);
    t12 = new GOval(23, 23);
    t3 = new GOval(10, 50);
    k1 = new GRoundRect(7, 5);
    k2 = new GRoundRect(7, 5);
    LI = new GOval(8, 15);
    t4 = new GOval(5, 20);
    t5 = new GOval(16, 16);
    t6 = new GOval(16, 16);
    LI1 = new GOval(5, 10);
    lo = new GRect(0, 5);
    lo1 = new GOval(3, 3);
	      
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
	g1.setFilled(true);
	g1.setColor(Color.RED);
	y1.setFilled(true);
	y1.setColor(Color.RED);
	t11.setFilled(true);
	t11.setColor(Color.RED);
	t12.setFilled(true);
	t12.setColor(Color.RED);
	t3.setFilled(true);
	t3.setColor(Color.black);
	k1.setFilled(true);
	k1.setColor(Color.black);
	k2.setFilled(true);
	k2.setColor(Color.black);
	LI.setFilled(true);
	LI.setColor(Color.BLACK);
	t4.setFilled(true);
	t4.setColor(Color.GRAY);
	t5.setFilled(true);
	t5.setColor(Color.white);
	t6.setFilled(true);
	t6.setColor(Color.white);
	LI1.setFilled(true);
	LI1.setColor(Color.pink);
	lo1.setFilled(true);
	lo1.setColor(Color.LIGHT_GRAY);

	
	add(cabin,100,50);
	add(body,100,100);
	add(t1,125,155);
	add(t2,250,155);
	add(w1,110,55);
	add(w2,180,55);
	add(a1,145,50);
	add(a2,225,50);
	add(g1,315,100);
	add(y1,95,170);
	add(t11,140,169);
	add(t12,264,169);
	add(t3,90,90);
	add(k1,190,120);
	add(k2,145,120);
	add(LI,316,99);
	add(t4,92,108);
	add(t5,143,173);
	add(t6,267,173);
	add(LI1,317,101);
	add(lo,313,94);
	add(lo1,312,94);

 }	   
}