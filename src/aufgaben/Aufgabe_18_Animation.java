package aufgaben;

import figuren.PlaySymbol;
import komponenten.TimerStartKnopf;
import komponenten.TimerStopKnopf;
import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe_18_Animation extends StandardAnwendung implements ActionListener {

    public static void main(String[] args) {
        starteAnwendung();
    }

    private int xPos = 10, yPos = 20;
    private PlaySymbol play = new PlaySymbol();

    public Aufgabe_18_Animation() {
        super("Aufgabe 18", 500, 500);
        this.setBackground(Color.YELLOW);
        Timer tick = new Timer(40, this);
        this.add(new TimerStartKnopf(tick));
        this.add(new TimerStopKnopf(tick));
        tick.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xPos = (xPos + 1) % this.getWidth();
        yPos = (yPos + 1) % this.getWidth();
        this.repaint();
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.fillOval(xPos, 40, 30, 30);
        play.zeichne(g, xPos, yPos);
    }
}
