package FirstGUI;
import javax.swing.*;
import java.awt.event.*;

public class Event {
public static void main(String[] args) {
        new Form();
    }
}

class Form implements ActionListener {
    public Form() {
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        JButton button = new JButton("Click me");

        button.setBounds(100, 100, 100, 50);
        button.addActionListener(this);
        frame.add(button);

        frame.setLayout(null);
        frame.setLocation(750, 300);
        frame.setVisible(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Hello World");
    }
}
