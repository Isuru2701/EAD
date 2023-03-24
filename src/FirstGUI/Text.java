package FirstGUI;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Text {
    public static void main(String[] args) {
        new TextForm();
    }
}

class TextForm implements KeyListener {

    public TextForm() {
        JFrame frame = new JFrame();
        JTextField field = new JTextField();
        frame.setSize(300, 300);
        frame.setLayout(null);

        field.addKeyListener(this);

        field.setBounds(100,50, 100, 50);

        frame.add(field);


        frame.setLocation(750, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //if key is escape, show a dialog box
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            JOptionPane.showMessageDialog(null, "You pressed escape");
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
