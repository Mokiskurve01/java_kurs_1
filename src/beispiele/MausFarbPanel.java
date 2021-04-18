package beispiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class MausFarbPanel extends JPanel implements MouseListener, MouseMotionListener {

    private Random z = new Random();

    public MausFarbPanel() {
        Color farbe = new Color(z.nextInt(256), z.nextInt(256), z.nextInt(256));
        this.setBackground(farbe);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        Color farbe = this.getBackground();
        farbe = farbe.brighter();
        this.setBackground(farbe);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Color farbe = this.getBackground();
        farbe = farbe.darker();
        this.setBackground(farbe);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Color farbe = new Color(z.nextInt(256), z.nextInt(256), z.nextInt(256));
        this.setBackground(farbe);
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        Color farbe = new Color(z.nextInt(256), z.nextInt(256), z.nextInt(256));
        this.setBackground(farbe);
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
