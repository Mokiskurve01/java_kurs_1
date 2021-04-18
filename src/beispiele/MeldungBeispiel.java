package beispiele;

import tools.StandardAnwendung;

import javax.swing.*;

public class MeldungBeispiel extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public MeldungBeispiel() {
        super("Meldungen", 400, 500);
        //JOptionPane.showMessageDialog(this, "Hallo");

        //Überladene Methode
        //JOptionPane.showMessageDialog(this, "Warnung", "Bitte aufpassen", JOptionPane.WARNING_MESSAGE);
        String meldung = "<html> <strong> Schön das Sie da sind!</strong>"
                + "<br>Wir haben uns lange nicht gesehen"
                + "<br>aber jetzt geht es weiter!";
        JOptionPane.showMessageDialog(this, meldung);

    }
}
