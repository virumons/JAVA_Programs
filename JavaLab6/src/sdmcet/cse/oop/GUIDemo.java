package sdmcet.cse.oop;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Form extends JFrame implements ActionListener {
	JFrame f;
	JButton b;
	Container contentPane;
	JPanel p;
	JLabel l,txtLbl;
	JTextField t;

	Form(String title) {
		super(title);

		b = new JButton("print");
		b.addActionListener(this);



		txtLbl=new JLabel("enter the ia marks");
		t=new JTextField(4);
		p = new JPanel();

		p.add(txtLbl);
		p.add(t);
		p.add(b);

		l=new JLabel();
		contentPane = this.getContentPane();
		contentPane.add(p, BorderLayout.CENTER);
		contentPane.add(l,BorderLayout.SOUTH);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		l.setText("entered ia marks are: " +t.getText());
	}
}

public class GUIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method sub
		JFrame f = new Form("my first frame");

		// f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// f.setSize(300, 300);
		f.setBounds(100, 100, 500, 300);

		f.setVisible(true);

	}

}
