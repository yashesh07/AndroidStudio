package Practice;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutttttt {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(new BorderLayout(15, 15));
        frame.getContentPane().setBackground(new Color(0x222831));

        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();

        panel1.setBackground(new Color(0xFFD369));
        panel2.setBackground(new Color(0x393E46));
        panel3.setBackground(new Color(0x393E46));
        panel4.setBackground(new Color(0xFFD369));
        panel5.setBackground(new Color(0x222831));

        panel1.setPreferredSize(new Dimension(100, 100));
        panel2.setPreferredSize(new Dimension(100, 100));
        panel3.setPreferredSize(new Dimension(100, 100));
        panel4.setPreferredSize(new Dimension(100, 100));
        panel5.setPreferredSize(new Dimension(100, 100));

        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.EAST);
        frame.add(panel3, BorderLayout.WEST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);

        panel5.setLayout(new BorderLayout(15, 15));

        JPanel panel11 = new JPanel();
        JPanel panel21 = new JPanel();
        JPanel panel31 = new JPanel();
        JPanel panel41 = new JPanel();
        JPanel panel51 = new JPanel();

        panel11.setBackground(new Color(0x393E46));
        panel21.setBackground(new Color(0xFFD369));
        panel31.setBackground(new Color(0xFFD369));
        panel41.setBackground(new Color(0x393E46));
        panel51.setBackground(new Color(0x222831));

        panel11.setPreferredSize(new Dimension(100, 100));
        panel21.setPreferredSize(new Dimension(100, 100));
        panel31.setPreferredSize(new Dimension(100, 100));
        panel41.setPreferredSize(new Dimension(100, 100));
        panel51.setPreferredSize(new Dimension(100, 100));

        panel5.add(panel11, BorderLayout.NORTH);
        panel5.add(panel21, BorderLayout.EAST);
        panel5.add(panel31, BorderLayout.WEST);
        panel5.add(panel41, BorderLayout.SOUTH);
        panel5.add(panel51, BorderLayout.CENTER);

        panel51.setLayout(new BorderLayout(15, 15));

        JPanel panel111 = new JPanel();
        JPanel panel211 = new JPanel();
        JPanel panel311 = new JPanel();
        JPanel panel411 = new JPanel();
        JPanel panel511 = new JPanel();

        panel111.setBackground(new Color(0xFFD369));
        panel211.setBackground(new Color(0x393E46));
        panel311.setBackground(new Color(0x393E46));
        panel411.setBackground(new Color(0xFFD369));
        panel511.setBackground(new Color(0x222831));

        panel111.setPreferredSize(new Dimension(100, 100));
        panel211.setPreferredSize(new Dimension(100, 100));
        panel311.setPreferredSize(new Dimension(100, 100));
        panel411.setPreferredSize(new Dimension(100, 100));
        panel511.setPreferredSize(new Dimension(100, 100));

        panel51.add(panel111, BorderLayout.NORTH);
        panel51.add(panel211, BorderLayout.EAST);
        panel51.add(panel311, BorderLayout.WEST);
        panel51.add(panel411, BorderLayout.SOUTH);
        panel51.add(panel511, BorderLayout.CENTER);

        frame.pack();
    }
}
