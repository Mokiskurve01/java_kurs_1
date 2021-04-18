package aufgaben;

import figuren.PlaySymbol;
import tools.StandardAnwendung;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;


public class Aufgabe_16 extends StandardAnwendung implements MouseMotionListener {
    public static void main(String[] args) {
        starteAnwendung();
    }

    private int xPos = 10, yPos = 10;
    private PlaySymbol play = new PlaySymbol();

    public Aufgabe_16() {
        super("Aufgabe 16", 600, 600);
        this.setBackground(Color.RED);
        this.addMouseMotionListener(this);
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.fillOval(xPos, 40, 30, 30);
        xPos = (xPos + 1) % this.getWidth();
        yPos = (yPos + 1) % this.getHeight();
        play.zeichne(g, xPos, yPos);
    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        xPos = xPos + 1;
        this.repaint();

    }
}
