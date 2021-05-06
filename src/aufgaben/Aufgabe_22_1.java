package aufgaben;

import figuren.DragAndDropFigur;
import figuren.MausOverFarbeFigur;
import figuren.MausOverHellerFigur;
import figuren.SpielFigur;
import tools.Spiel;

import java.awt.*;
import java.util.LinkedList;

public class Aufgabe_22_1 extends Spiel {

    private LinkedList<SpielFigur> figuren;

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_22_1() {
        super("Aufgabe 22", 800, 700);
    }

    @Override
    protected void initialisiere() {

        this.figuren = new LinkedList<SpielFigur>();
        this.figuren.add(new SpielFigur(20, 20, 40, 40, this));
        this.figuren.add(new MausOverFarbeFigur(30, 40, this));
        this.figuren.add(new MausOverHellerFigur(60, 90, Color.RED, this));
        this.figuren.add(new DragAndDropFigur(260, 290, this));
    }

    @Override
    protected void neuerSpielstand() {
        for (SpielFigur f : figuren) {
            f.bewege();
        }
    }

    @Override
    protected void zeichneSpielstand(Graphics2D g) {
        for (SpielFigur f : figuren) {
            f.zeichne(g);
        }
    }
}
