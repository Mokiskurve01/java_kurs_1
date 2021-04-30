package tools;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Spiel extends StandardAnwendung implements ActionListener {

    protected Timer timer;

    protected Spiel(String titel, int breite, int hoehe) {
        super(titel, breite, hoehe);
        this.setBackground(Color.BLACK);
        timer =new Timer(40,this);
        this.initialisiere();
        timer.start();
    }

    @Override
    public final void actionPerformed(ActionEvent e) {
        this.neuerSpielstand();
        this.repaint();
    }

    @Override
    public final void zeichne(Graphics2D g) {
        if(timer.isRunning()) this.zeichneSpielstand(g);
    }

    /**
     * Gibt den Spielfeldrand zurÜck, wird von abgeleiteten Klassen Überschrieben,
     * falls die Begrenzung des Spielfeldes nicht mit dem Rand des Panels Übereinstimmt.
     *
     * @return Rand des Spielfeldes
     */
    public Rectangle getRand() {
        return this.getBounds();
    }

    protected abstract void initialisiere();
    protected abstract void neuerSpielstand();
    protected abstract void zeichneSpielstand(Graphics2D g);

}
