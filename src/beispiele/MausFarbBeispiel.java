package beispiele;

import tools.StandardAnwendung;

import java.awt.*;

public class MausFarbBeispiel extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public MausFarbBeispiel() {
        super("Maus und Farbe", 700, 800);
        this.setLayout(new GridLayout(2, 2));
        this.add(new MausFarbPanel());
        this.add(new MausFarbPanel());
        this.add(new MausFarbPanel());
        this.add(new MausFarbPanel());
    }
}
