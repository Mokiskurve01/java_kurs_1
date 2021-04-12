package figuren;

/*import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import tools.Spiel;

public class MausOverFarbeFigur extends SpielFigur {

    private boolean mausInFigur;

    public MausOverFarbeFigur(double xc, double yc, Spiel spiel) {
        super(xc, yc, 40, 40, spiel);
        this.setBewegung(1, 0);
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        this.mausInFigur = this.contains(e.getPoint());
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(Color.BLUE);
        if(this.mausInFigur) {
            g.setColor(Color.YELLOW);
        }
        g.fill(this);
    }

}

 */