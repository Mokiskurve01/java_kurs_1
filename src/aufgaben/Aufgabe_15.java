package aufgaben;

import tools.StandardAnwendung;
import komponenten.ZufallsFarbKnopf;

public class Aufgabe_15 extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_15() {
        super("Aufgabe 15", 600, 300);
        this.add(new ZufallsFarbKnopf(this));

    }
}
