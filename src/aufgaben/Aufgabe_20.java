package aufgaben;

import figuren.FolgeDerMausFigur;
import figuren.GehZurMausFigur;
import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aufgabe_20 extends StandardAnwendung implements ActionListener {
    public static void main(String[] args) {
        starteAnwendung();
    }

    private GehZurMausFigur figur1;
    private FolgeDerMausFigur figur2;

    public Aufgabe_20 () {
        super("Aufgabe 20", 400,400);
        figur1 = new GehZurMausFigur(this);
        Timer tick = new Timer(40,this);
        tick.start();
        this.setBackground(Color.BLACK);
        figur2 = new FolgeDerMausFigur(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        figur1.bewege();
        figur2.bewege();
        this.repaint();
    }

    @Override
    public void zeichne (Graphics2D g){
        figur1.zeichne(g);
        figur2.zeichne(g);
    }
}
