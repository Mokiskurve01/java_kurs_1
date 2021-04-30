package beispiele;

import figuren.GehZurMausFigur;
import tools.Spiel;

import java.awt.*;

public class BeispielSpiel extends Spiel {

    public static void main(String[] args) {
        starteAnwendung();
    }

    private GehZurMausFigur figur;

    public BeispielSpiel() {
        super("Beispiel Spiel ", 800, 600);
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
