package beispiele;

import tools.StandardAnwendung;

import java.awt.*;

public class GrafikBeispiel extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    private MannSymbol
            m1 = new MannSymbol(0, 0),
            m2 = new MannSymbol(100, 0),
            m3 = new MannSymbol(200, 0);

    public GrafikBeispiel() {
        super("Grafik Beispiel", 500, 300);
        this.setBackground(Color.YELLOW);
    }

    @Override
    public void zeichne(Graphics2D g) {
        m1.zeichne(g);
        m2.zeichne(g);
        m3.zeichne(g);
    }

    private void mannSymbol(Graphics2D g, int x, int y) {
    }
}

class MannSymbol {
    private int x, y;

    public MannSymbol(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void zeichne(Graphics2D g) {
        g.translate(x, y);
        g.fillOval(60, 30, 40, 40);
        g.fillRoundRect(50, 75, 60, 70, 20, 20);
        g.fillRoundRect(65, 120, 30, 70, 20, 20);
        g.translate(-x, -y);
    }
}
