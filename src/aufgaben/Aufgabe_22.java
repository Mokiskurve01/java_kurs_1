package aufgaben;

import figuren.DragAndDropFigur;
import figuren.MausOverFarbeFigur;
import figuren.MausOverHellerFigur;
import figuren.SpielFigur;
import tools.Spiel;

import java.awt.*;

public class Aufgabe_22 extends Spiel {

    private SpielFigur figur;
    private MausOverFarbeFigur figur2;
    private MausOverHellerFigur figur3;
    private DragAndDropFigur figur4;

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_22() {
        super("Aufgabe 22", 800, 700);
    }

    @Override
    protected void initialisiere() {
        this.figur = new SpielFigur(20, 20, 40, 40, this);
        this.figur.setBewegung(0.9, 0.5);
        this.figur2 = new MausOverFarbeFigur(30, 40, this);
        this.figur3 = new MausOverHellerFigur(60, 90, Color.RED, this);
        this.figur4 = new DragAndDropFigur(260, 290, this);
    }

    @Override
    protected void neuerSpielstand() {
        this.figur.bewege();
        this.figur2.bewege();
        this.figur3.bewege();
        this.figur4.bewege();
    }

    @Override
    protected void zeichneSpielstand(Graphics2D g) {
        this.figur.zeichne(g);
        this.figur2.zeichne(g);
        this.figur3.zeichne(g);
        this.figur4.zeichne(g);
    }
}
