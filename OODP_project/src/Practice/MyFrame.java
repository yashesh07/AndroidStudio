package Practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField field;
    JButton button;
    String str;
    MyFrame(){
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        field = new JTextField();
        field.setPreferredSize(new Dimension(300, 40));

        button = new JButton("Submit");
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(button);
        this.add(field);

        this.setVisible(true);
        this.pack();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            str = field.getText();
            System.out.println(str);
        }
    }
}
