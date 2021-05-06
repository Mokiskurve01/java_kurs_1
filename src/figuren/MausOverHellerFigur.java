package figuren;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

import tools.Spiel;

public class MausOverHellerFigur extends SpielFigur {

    private Color farbeHell, farbeDunkel;

    public MausOverHellerFigur(double xC, double yC, Color farbe, Spiel spiel) {
        super(xC, yC, 40, 40, spiel);
        this.setBewegung(1, 0);
        this.farbeDunkel = farbe.darker();
        this.farbeHell = farbe.brighter().brighter();
    }


    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(this.farbeDunkel);
        Point mausPos = spiel.getMousePosition();

        if(mausPos!=null && this.contains(mausPos)) {
            g.setColor(this.farbeHell);
        }
        g.fill(this);
    }

}
