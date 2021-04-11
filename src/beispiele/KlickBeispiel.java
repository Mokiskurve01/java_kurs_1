package beispiele;

import tools.StandardAnwendung;

import javax.swing.*;

public class KlickBeispiel extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public KlickBeispiel() {
        super("Klick Beispiel", 400, 500);
        JButton knopf = new JButton("Klick mal wieder");
        this.add(knopf);
        knopf.addActionListener(new Klick()); //Betriebssystem ruft die Methode actionPreformed
    }
}
