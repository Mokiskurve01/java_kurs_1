package figuren;

/*import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import tools.Klang;
import tools.Spiel;

public class KlangFigur extends SpielFigur {
    private Klang klang;
    private boolean halbton;
    public KlangFigur(double f, boolean halbton, String soundDatei, double xC, double yC, Spiel spiel) {
        super(xC, yC, 30, 60, spiel);
        this.klang = new Klang(soundDatei);
        this.halbton = halbton;
        klang.setRate(f);
        if(halbton) {
            klang.setRate(f*16.0/15.0);
            this.width = 20;
            this.height= 80;
        }
    }

    public void play() {
        klang.play();
    }

    @Override
    public void mousePressed(MouseEvent e) {
        if(this.contains(e.getPoint())) klang.play();
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(Color.WHITE);
        if(this.halbton) g.setColor(Color.BLACK);
        g.fill(this);

    }
}

 */
