package sdmcet.cse.oop;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Area extends JFrame implements ActionListener {
	JFrame f;
	JButton b;

	Container contentPane;
	JPanel p;
	JLabel l,txtLbl;
	JLabel j,txtLbl2;
	JTextField t;
	JTextField t1;
	

	Area(String title) {
		super(title);

		b = new JButton("calculate");
		b.addActionListener(this);

       

		txtLbl=new JLabel("enter the height");
		t=new JTextField(4);
		
		txtLbl2=new JLabel("enter the base");
		t1=new JTextField(4);

		p = new JPanel();
	    p.add(txtLbl);
	    p.add(t);
	    p.add(txtLbl2);
		
		
        p.add(t1);
        p.add(b);
		l=new JLabel();
	
		contentPane = this.getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		contentPane.add(l,BorderLayout.SOUTH);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	//	l.setText("entered height is: " +t.getText());
		//l.setText("entered base is:" +t1.getText());
		
		double base=Double.parseDouble(t.getText());
		double height=Double. parseDouble(t1.getText());
		double area=0.5*base*height;
		l.setText("area of the triangle is : "+ area);
	
	}
}

public class GUIareaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		JFrame f = new Area("my first frame");

		// f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// f.setSize(300, 300);
		f.setBounds(100, 100, 500, 300);

		f.setVisible(true);

	}

}

	
