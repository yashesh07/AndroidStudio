package Practice;

import javax.swing.*;
import java.awt.*;

public class Demo {
    public static void main(String[] args) {

        // Jframe
        JFrame frame = new JFrame();
        frame.setTitle("HelloWorld");
        frame.setSize(450, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon img = new ImageIcon("C:\\Users\\yashe\\Downloads\\hacker.jpg");
        frame.setIconImage(img.getImage());
        frame.getContentPane().setBackground(new Color(255,255,255));
//        frame.setLayout(null);
//        frame.pack();


        //Jlabel
        JLabel label = new JLabel();
        label.setText("Hello Hacker!!....lol");
        ImageIcon img2 = new ImageIcon("C:\\Users\\yashe\\Downloads\\hacker.jpg");
        label.setIcon(img2);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setForeground(Color.red);
        label.setFont(new Font("MV Boli", Font.ITALIC, 20));
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setBorder(BorderFactory.createLineBorder(Color.red, 5));
//        label.setBounds(10, 10, 300, 300);
        frame.add(label);




        frame.pack();
        frame.setVisible(true);
    }
}
