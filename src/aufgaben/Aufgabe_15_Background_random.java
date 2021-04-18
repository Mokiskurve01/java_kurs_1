package aufgaben;

import tools.StandardAnwendung;
import komponenten.ZufallsFarbKnopf;

public class Aufgabe_15_Background_random extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_15_Background_random() {
        super("Aufgabe 15", 600, 300);
        this.add(new ZufallsFarbKnopf(this));

    }
}
