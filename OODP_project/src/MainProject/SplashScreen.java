package MainProject;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

public class SplashScreen {

    JWindow splashWindow = new JWindow();
    JProgressBar progressBar = new JProgressBar();

    SplashScreen(){

        splashWindow.setSize(450, 450);
        splashWindow.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setBackground(new ColorPallete().getC2cream());
        splashWindow.add(panel);
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel();
        ImageIcon img = new ImageIcon("C:\\Users\\yashe\\Downloads\\Boyo_logo-removebg (1).png");
        label.setBorder(new EmptyBorder(100, 0, 50,0));
        label.setIcon(img);
        panel.add(label, JLabel.CENTER);

        progressBar.setStringPainted(true);
        progressBar.setBackground(Color.white);
        progressBar.setForeground(new ColorPallete().getC9darkBlue());
        progressBar.setPreferredSize(new Dimension(300, 15));
        panel.add(progressBar);

        splashWindow.setVisible(true);

        fill();

        splashWindow.setVisible(false);

        new WelcomePage();

        splashWindow.dispose();
    }

    private void fill(){
        int count = 0;
        while(count<=100){
            progressBar.setValue(count);
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
        }
    }
}
