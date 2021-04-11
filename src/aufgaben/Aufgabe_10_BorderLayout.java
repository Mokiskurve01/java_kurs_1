package aufgaben;

/***
 * Aufgabe 10 Methode, return-Typ, BorderLayout
 * In dieser Aufgabe geht es um einen weiteren wichtigen Layout-Manager: BorderLayout.
 * Ein BorderLayout unterteilt ein Panel in die fünf Bereiche NORTH, WEST, CENTER, EAST und SOUTH.
 */

import tools.StandardAnwendung;
import javax.swing.*;
import java.awt.*;

import static java.awt.Color.*;

public class Aufgabe_10_BorderLayout extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_10_BorderLayout() {
        super("Aufgabe 10", 500, 300);
        this.setLayout(new BorderLayout());
        this.add(farbigesPanel(RED, "NORTH"), BorderLayout.NORTH);
        this.add(farbigesPanel(GREEN, "CENTER"), BorderLayout.CENTER);
        this.add(farbigesPanel(ORANGE, "SOUTH"), BorderLayout.SOUTH);
        this.add(farbigesPanel(YELLOW, "WEST"), BorderLayout.WEST);
        this.add(farbigesPanel(MAGENTA, "EAST"), BorderLayout.EAST);
    }
    private JPanel farbigesPanel(Color farbe, String text) {
        JPanel container = new JPanel();
        container.setBackground(farbe);
        container.add(new JLabel(text));
        return container;
    }
}
