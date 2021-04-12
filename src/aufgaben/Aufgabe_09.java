package aufgaben;

/***
 * Aufgabe 9 GridLayout, pack
 * Schreiben Sie die gezeigte Java Anwendung, die das Tastenfeld eines Telefons nachempfindet.
 * Aufgabe9 wird wie gewohnt von StandardAnwendung abgeleitet. Im Konstruktor
 * von Aufgabe9 legen Sie zunächst einen neuen Layout-Manager fest:
 * this.setLayout(new GridLayout(4,3));
 * der die Elemente in einem Raster von 4 Zeilen und 3 Spalten anordnet.
 * Dann legen Sie nacheinander mit this.add(…) 12 JButton-Objekte mit der
 * Aufschrift "1"," 2", "3" u.s.w. auf die Oberfläche.
 * Anschließend rufen Sie this.fenster.pack();
 * Das Fenster wird jetzt auf die minimale Größe reduziert. Der abschließende Aufruf
 * this.fenster.setResizable(false);
 * verhindert, dass die Größe vom Anwender verändert wird
 */

import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_09 extends StandardAnwendung {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public Aufgabe_09() {
        super("Aufgabe 9 ", 300, 200);
        this.setLayout(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("" + i);
            this.add(button);
        }

        this.add(new JButton("*"));
        this.add(new JButton("0"));
        this.add(new JButton("#"));
        this.fenster.pack();//Das Fenster wird jetzt auf die minimale Größe reduziert. Der abschließende Aufruf
        this.fenster.setResizable(false);//verhindert, dass die Größe vom Anwender verändert wird
    }
}


