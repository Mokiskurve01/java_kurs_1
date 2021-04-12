package aufgaben;

import komponenten.FarbKnopf;
import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Aufgabe_13 extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_13() {
        super("Aufgabe 13", 400 , 200);
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
        } catch (Exception e) {
        }
        Random random = new Random();
        int r, g, b = 0;
        for (int i = 0; i < 6; i++) {
            r = (int) ((Math.random()) * 255 + 1);
            g = (int) ((Math.random()) * 255 + 1);
            b = (int) ((Math.random()) * 255 + 1);
            this.add(new FarbKnopf("Farbe", new Color(r, g, b), this));
        }
    }
}
