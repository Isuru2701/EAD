package FirstGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo extends JFrame {
    private JPanel panelMain;
    private JTextField txt_name;
    private JButton btn_click;
    public Demo() {
        btn_click.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(btn_click, "Hello " + txt_name.getText());
            }
        });
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.setContentPane(demo.panelMain);
        demo.setTitle("Test GUI");
        demo.setSize(400, 300);
        demo.setVisible(true);

        demo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
