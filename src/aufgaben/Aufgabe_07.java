package aufgaben;

import tools.StandardAnwendung;

import javax.swing.*;

/***
 * Aufgabe 7 Struktur, Vererbung, JTextField
 * Schreiben Sie nebenstehende Java Anwendung der Größe 200*150 Pixel, die einen Jlabel, ein
 * JTextField mit Platz für 12 Zeichen und einen JButton zeigt. Geben Sie Ihren Variablen verständliche
 * Namen, z.B. eingabeFeld für das JTextField.
 * Strukturieren Sie Ihr Programm wie in Aufgabe 6 indem Sie Aufgabe7
 * von StandardAnwendung ableiten.
 */

public class Aufgabe_07 extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_07() {
        super("Aufgabe 7", 200, 150);
        JLabel label = new JLabel("Reiseziel");
        this.add(label);
        JTextField eingabeFeld = new JTextField(12);
        this.add(eingabeFeld);
        JButton knopf = new JButton("Anfrage abschicken");
        this.add(knopf);
    }
}
