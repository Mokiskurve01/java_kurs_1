package aufgaben;

import figuren.GehZurMausFigur;
import tools.Spiel;

import java.awt.*;

public class Aufgabe_21 extends Spiel {

    private GehZurMausFigur figur;

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_21() {
        super("Aufgabe 21", 800, 600);
    }

    @Override
    protected void initialisiere() {
        figur = new GehZurMausFigur(this);
    }

    @Override
    protected void neuerSpielstand() {
        figur.bewege();
    }

    @Override
    protected void zeichneSpielstand(Graphics2D g) {
        figur.zeichne(g);
    }
}
