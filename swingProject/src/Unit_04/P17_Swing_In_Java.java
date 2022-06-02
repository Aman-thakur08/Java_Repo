package Unit_04;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
//create template
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class P17_Swing_In_Java {

	public static void main(String[] args) {
		SwingInJava name=new SwingInJava();

	}

}
class SwingInJava extends JFrame{
	JTable jt1;
	JList list;
	JComboBox jb1;
	JTextArea ta1;
	JRadioButton r1;
	JRadioButton r2;
	JTextField t1;
	JTextField t2;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	
	JLabel l1;
	
	SwingInJava(){
		String data[][]= { {"101","Amit","67000"},{"102","Mehul","70000"}};
		String column[]= {"ID","NAME","SALARY"};
		ta1 = new JTextArea(10,30); 
		r1=new JRadioButton("Male");
		r2=new JRadioButton("Female");
		t1=new JTextField(20);
		t2=new JTextField(20);
		b1=new JButton("Add");
		b2=new JButton("Subtract");
		b3=new JButton("Multiply");
		b4=new JButton("Divide");
		l1=new JLabel("Res");
		add(ta1);
		add(r1);
		add(r2);
		add(t1);
		add(t2);
		System.out.println();
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(l1);
		ActionListener al =new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String s1=t1.getText();
				String s2=t2.getText();
				int a1=Integer.parseInt(s1);
				int a2=Integer.parseInt(s2);
				if(e.getSource()==b1)
				{
					Integer sum=a1+a2;
					l1.setText(sum.toString());
				}
				if(e.getSource()==b2)
				{
					Integer diff=a1-a2;
					l1.setText(diff.toString());
				}
				if(e.getSource()==b3)
				{
					Integer prod=a1*a2;
					l1.setText(prod.toString());
				}
				if(e.getSource()==b4)
				{
					Integer div=a1/a2;
					l1.setText(div.toString());
				}
				if(r1.isSelected()) {
					l1.setText("is a Male");
				}
				
			}
		};
		b1.addActionListener(al);
		b2.addActionListener(al);
		b3.addActionListener(al);
		b4.addActionListener(al);
		setLayout(new FlowLayout());
		setVisible(true);
		setSize(400,400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}