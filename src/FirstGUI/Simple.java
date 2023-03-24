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
		
		t.setBounds(50, 25, 300, 40);
		b.setBounds(130,100,100,40);

		f.add(t);
		f.add(b);


		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);

		
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	}
	
}
