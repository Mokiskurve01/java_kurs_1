package aufgaben;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import figuren.GehZurMausFigur;
import figuren.FolgeDerMausFigur;
import tools.StandardAnwendung;

public class Aufgabe_20 extends StandardAnwendung implements ActionListener {

    public static void main(String[] args) {
        starteAnwendung();
    }

    private FolgeDerMausFigur figur1;
    private GehZurMausFigur figur2;

    public Aufgabe_20() {
        super("Aufgabe 20", 500,500);
        this.setBackground(Color.BLACK);
        Timer tick= new Timer(10,this);
        figur1=new FolgeDerMausFigur(this);
        figur2=new GehZurMausFigur(this);
        tick.start();
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        figur1.bewege();
        figur2.bewege();
        this.repaint();
    }

    @Override
    public void zeichne(Graphics2D g) {
        figur1.zeichne(g);
        figur2.zeichne(g);
    }
}
