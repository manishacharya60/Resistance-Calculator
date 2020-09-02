import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.*;

class xyz extends JFrame implements ActionListener {
	JButton b;
	JLabel title, design;
	JProgressBar p;
	int i = 0;
	
	public xyz() {
	title = new JLabel("Welcome to Resistance Calculator!");
	design = new JLabel("Designed and created by: Manish Acharya");
	b= new JButton("Start!");
	p = new JProgressBar(0, 20);
	Timer t = new Timer(200, this);
	
	b.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			t.start();
		}
	});
	
	add(title);
	add(b);
	add(p);
	add(design);

//	basic
	setVisible(true);
	setSize(300,300);
	setLayout(new FlowLayout());
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if (i==20) {
			new res();
			dispose();
		}
		p.setValue(i);
		i++;
	}
}

public class caller {

	public static void main(String[] args) {
		xyz obj1 = new xyz();
	}

}
