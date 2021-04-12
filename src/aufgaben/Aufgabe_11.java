package aufgaben;

import tools.StandardAnwendung;
import javax.swing.*;

public class Aufgabe_11 extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_11() {
        super("Aufgabe 11", 300, 150);
        JButton knopf = new JButton("Nicht Klicken");
        this.add(knopf);
        knopf.addActionListener(new Aufgabe_11_KlickReaktion());
    }
}
