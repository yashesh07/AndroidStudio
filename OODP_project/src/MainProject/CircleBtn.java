package MainProject;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.io.Serial;

import javax.swing.JButton;

public class CircleBtn extends JButton{
	
	@Serial
	private static final long serialVersionUID = 3005032288682177388L;
	Color fore;
	Color back;
	int radius;

	public CircleBtn(String text, Color back, Color fore, int radius) {
	        super(text);
	        this.back = back;
	        this.fore = fore;
	        this.radius = radius;
	        Dimension size = getPreferredSize();
	        size.width = size.height = Math.max(size.width, size.height);
	        setPreferredSize(size);

	        setContentAreaFilled(false);
	    }

	    @Override
	    protected void paintComponent(Graphics g) {
	        if (getModel().isArmed()) {
	            g.setColor(back);
	            setForeground(fore);
	        } else {
	            g.setColor(getBackground());
	            setForeground(Color.BLACK);
	        }
	        g.fillRoundRect(0, 0, getSize().width - 1, getSize().height - 1, radius, radius);

	        super.paintComponent(g);
	    }

	    @Override
	    protected void paintBorder(Graphics g) {
	        g.setColor(getForeground());
	        g.drawRoundRect(0, 0, getSize().width - 1, getSize().height - 1, radius,radius);
	    }
}
