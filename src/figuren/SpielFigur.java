package figuren;

import tools.Spiel;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.Stroke;

public class SpielFigur extends Rectangle2D.Double implements MouseListener, MouseMotionListener {

    protected static final Stroke STRICH5 = new BasicStroke(5);

    protected Point2D.Double bewegung;
    protected Spiel spiel;

    public SpielFigur(double xC, double yC, double breite, double hoehe, Spiel spiel) {
        super(xC - breite / 2, yC - hoehe / 2, breite, hoehe);
        this.spiel = spiel;
        bewegung = new Point2D.Double();
        spiel.addMouseListener(this);
        spiel.addMouseMotionListener(this);
    }

    public void setBewegung(double vx, double vy) {
        this.bewegung.x = vx;
        this.bewegung.y = vy;
    }

    public void bewege() {
        this.x = this.x + this.bewegung.x;
        this.y = this.y + this.bewegung.y;
    }

    public Point2D.Double getBewegung() {
        return this.bewegung;
    }

    public void zeichne(Graphics2D g) {
        g.setStroke(STRICH5);
        g.setColor(Color.GREEN);
        g.draw(this);
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
    }

    @Override
    public void mouseDragged(MouseEvent arg0) {
    }

    @Override
    public void mouseMoved(MouseEvent arg0) {
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
    }
}

