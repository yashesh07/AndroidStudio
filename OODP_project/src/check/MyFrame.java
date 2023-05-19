package check;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MyFrame extends JFrame {

    JPanel panel;

    MyFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);

        panel = new JPanel();
        panel.setBorder(BorderFactory.createLineBorder(new Color(0x2E4C6D), 5));
        panel.setBackground(new Color(0x396EB0));
        panel.setLayout(new FlowLayout());

        JLabel loginLabel = new JLabel("LOGIN");
        loginLabel.setFont(new Font("Bernard", Font.PLAIN, 45));
        loginLabel.setForeground(Color.white);
        loginLabel.setVerticalAlignment(JLabel.CENTER);
        loginLabel.setBorder(BorderFactory.createLineBorder(Color.white, 2));
        loginLabel.setBorder(new EmptyBorder(100, 4500, 50, 4500));

        JPanel panelBox = new JPanel();
        panelBox.setPreferredSize(new Dimension(450, 450));

        panel.add(loginLabel);
        panel.add(panelBox);



        this.add(panel, BorderLayout.CENTER);
        this.setVisible(true);
    }

}
