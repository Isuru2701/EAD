package FirstGUI;

import javax.swing.*;

public class Simple {
	
	public static void main(String[] args){
		new View();
	}

}

class View {

	private JFrame f;
	private JButton b;
	private JTextField t;

	View() {
		f = new JFrame();
		b = new JButton("Click");
		t = new JTextField(20);
		
		t.setBounds(5, 100, 300, 40);
		b.setBounds(310,100,100,40);
		f.add(t);
		f.add(b);


		f.setSize(440,500);
		f.setLayout(null);
		f.setVisible(true);

		
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
}
