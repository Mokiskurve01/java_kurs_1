package figuren;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class GehZurMausFigur extends Rectangle2D.Double implements MouseListener{
    private Point zielPunkt;

    public GehZurMausFigur(JPanel panel) {
        zielPunkt = new Point(200,200);
        this.height = this.width = 40;
        panel.addMouseListener(this);
    }

    public void zeichne(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fill(this);
    }

    public void bewege() {
        this.x = this.x+(zielPunkt.getX()-this.width/2-this.x)/10;
        this.y = this.y+(zielPunkt.getY()-this.height/2-this.y)/10;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.zielPunkt = e.getPoint();
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {	}
    @Override
    public void mouseEntered(MouseEvent arg0) {	}
    @Override
    public void mouseExited(MouseEvent arg0) {	}
    @Override
    public void mouseReleased(MouseEvent arg0) {	}
}
