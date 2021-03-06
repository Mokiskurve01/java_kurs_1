package figuren;

import java.awt.*;

public class PlaySymbol {
        private Polygon dreieck = new Polygon(); // java.awt.Polygon
        public PlaySymbol() {
            dreieck.addPoint(40, 15);
            dreieck.addPoint(60, 25);
            dreieck.addPoint(40, 35);
        }
        public void zeichne(Graphics2D g, int x, int y) {
            g.translate(x,y);
            g.setColor(Color.BLACK);
            g.fillRoundRect(0, 0, 90, 50, 25, 25);
            g.setColor(Color.WHITE);
            g.fillPolygon(dreieck);
        }
}
