package figuren;

import tools.Spiel;

import java.awt.*;
import java.awt.event.MouseEvent;

public class DragAndDropFigur extends SpielFigur {

    private boolean wirdGezogen;

    public DragAndDropFigur(double xC, double yC, Spiel spiel) {
        super(xC, yC, 25, 25, spiel);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        this.wirdGezogen = this.contains(e.getPoint());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        this.wirdGezogen = false;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (this.wirdGezogen) {
            this.x = e.getPoint().x - this.width / 2;
            this.y = e.getPoint().y - this.width / 2;
        }
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(Color.RED);
        if (this.wirdGezogen) {
            g.setColor(Color.ORANGE);
        }
        g.fill(this);
    }
}
