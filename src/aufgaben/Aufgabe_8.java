package aufgaben;
/***
 * Aufgabe 8 Anordnung verschiedener Swing-Objekte
 * Schreiben Sie nebenstehende Java Anwendung der Größe 300*150
 * Pixel, die folgende Objekte darstellt:
 * 1. Einen Jlabel mit der Aufschrift „Name“.
 * 2. Ein JTextField der Breite 12 Zeichen.
 * 3. Eine JCheckBox mit der Aufschrift „Bitte senden Sie mir
 * Informationen zu“.
 * 4. Einen JButon mit der Aufschrift „Anfrage
 * abschicken“.
 * Das Programm hat die gleiche Struktur wie die
 * Aufgaben 6 und 7. Das nebenstehende UML Diagramm
 * zeigt die Hierarchie der Klassen.
 * Dabei steht + für public und # für protected. Der Pfeil
 * zeigt jeweils auf die Basisklasse. Unterstrichene
 * Methoden sind static.
 * Denken Sie daran, dass der Konstruktor von Aufgabe8
 * mit der Anweisung
 *  super("Aufgabe 8", 300, 150);
 * beginnen muss.
 */

import tools.StandardAnwendung;

import javax.swing.*;

public class Aufgabe_8 extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_8() {
        super("Aufgabe 8", 300, 150);
        JLabel label = new JLabel("Name");
        this.add(label);
        JTextField eingabeFeld = new JTextField(12);
        this.add(eingabeFeld);
        JCheckBox checkBox = new JCheckBox("Bitte senden Sie mir Informationen zu");
        this.add(checkBox);
        JButton button = new JButton("Anfrage abschicken");
        this.add(button);
    }


}
