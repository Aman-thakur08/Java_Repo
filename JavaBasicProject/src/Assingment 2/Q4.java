import javax.swing.*;
import java.awt.*;
class AB extends Canvas
{ 
	
	public void paint(Graphics g)
	{

		 g.setColor(Color.blue);
     		 g.drawLine(0, 0, 400, 400);
		 g.setColor(Color.black);
		 g.drawOval(50,18,50,50);
		 g.setColor(Color.blue);
		 g.fillOval(50,18,50,50);

	} 
	public static void main(String args[])
	{
		AB a=new AB();
		JFrame f=new JFrame();  
        	f.add(a);  
        	f.setSize(400,400);  
        	f.setVisible(true);  
	}
}
