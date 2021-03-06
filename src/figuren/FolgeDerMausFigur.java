package figuren;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

public class FolgeDerMausFigur extends Ellipse2D.Double implements MouseMotionListener{

    public FolgeDerMausFigur(JPanel panel) {
        this.height = this.width = 40;
        panel.addMouseMotionListener(this);
    }

    public void zeichne(Graphics2D g) {
        g.setColor(Color.YELLOW);
        g.fill(this);
    }

    public void bewege() {
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.x = e.getX()-width/2;
        this.y = e.getY()-height/2;
    }

}