package aufgaben;

import tools.StandardAnwendung;
import javax.swing.*;

public class Aufgabe_11_KlickReaktion extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_11_KlickReaktion() {
        super("Aufgabe 11", 300, 150);
        JButton knopf = new JButton("Nicht Klicken");
        this.add(knopf);
        knopf.addActionListener(new KlickReaktion());
    }
}
