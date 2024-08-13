

import java.awt.*;

import javax.swing.*;

class MyFrame1 extends JDialog{
	 JLabel en,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	 JTextField t1,t2,t3,t4,t5;
	 JTextArea add;
	 JComboBox e1,e2,e3,e4,e5,e6;
	 JList f;
	 JPanel p,p1,p2;
	 MyFrame1(){
		super(new JFrame(),"degree");
		 setSize(600,400);
		 setLayout(new FlowLayout());
		 String s1[]= {"PG","UG","Docrate"};
		 e1=new JComboBox(s1);
		 
		 String s2[]={"BSC","BCOM","BA","BBA","BE","BHMS","Btech","MSC","MA","MBA","Mtech","ME"};
		 e2=new JComboBox(s2);
		 
		 String s3[]= {"1st","2st","3rd","4th"};
		 e3=new JComboBox(s3);
		 
		 p=new JPanel(new GridLayout(10,2,15,20));
		 p1=new JPanel(new GridLayout(20,9,16,20));
		 p1.setPreferredSize(new Dimension());
		 p1.setPreferredSize(new Dimension());
		 add(p,BorderLayout.CENTER);
		 //add(p1,BorderLayout.CENTER);
		 
		 en=new JLabel("Enrollment");
		 t1=new JTextField(10);
		 p.add(en);
		 t1.setBounds(10,20,80,40);
		 p.add(t1);
		 
		 l1=new JLabel("Name");
		 t2=new JTextField(10);
		 t2.setBounds(10,20,80,40);
		 p.add(l1);
		 p.add(t2);
		 
		 l2=new JLabel("email");
		 t3=new JTextField(10);
		 t3.setBounds(10,20,80,40);
		 p1.add(l2);
		 p1.add(t3);
		 
		 l3=new JLabel("Mobile");
		 t4=new JTextField(10);
		 t4.setBounds(10,20,80,40);
		 p1.add( l3);
		 p1.add(t4);
		 
		 l4=new JLabel("Course");
	
		 p1.add(e1);
		 p1.add(e2);
		 p1.add(e3);
		 
		 
		 l5=new JLabel("DOb");
		 String s4[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25",
				 "26","27","28","29","30","31"};
		 l8=new JLabel("Date:");
		 String s5[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		 l9=new JLabel("Month:");
		 String s6[]= {"1999","2000","2001","2002","2002"};
		 e4=new JComboBox(s4);
		 e5=new JComboBox(s5);
		 e6=new JComboBox(s6);
		 p1.add(l8.add(e4));
		 p1.add(l9.add(e5));
		 p1.add(l10.add(e6));
		 
		 l6=new JLabel("Previous year marks");
		 t5=new JTextField(10);
		 t5.setBounds(10,20,50,50);
		 p1.add(l6.add(t5));
		 add(p.add(p1));
		 
		
	 }
 }
public class Degree {
	public static void main(String[] args) {
		MyFrame1 dl=new MyFrame1();
		dl.setLocation(500,500);
		dl.setVisible(true);
	}
}
