package aufgaben;

import tools.StandardAnwendung;
import komponenten.KlickKnopf;


public class Aufgabe_12 extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_12() {
        super("Aufgabe 12", 300, 150);
        this.add(new KlickKnopf());
    }
}
