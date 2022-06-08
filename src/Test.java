import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test implements ActionListener  {

    int num = 0;
    JLabel label = new JLabel();

    public void tt() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("RigaCoding");
        frame.setVisible(true);

        panel.setLayout(null);


        label.setBounds(20, 30, 90, 30);
        panel.add(label);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 30, 170, 30);
        panel.add(nameField);

        JButton btn = new JButton("Click");
        panel.add(btn);
        btn.setBounds(100, 100, 90, 30);

        btn.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        label.setText("I: " + num++);
    }
}
