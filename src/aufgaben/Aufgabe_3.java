package aufgaben;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_3 {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Aufgabe 3");
        fenster.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fenster.setSize(600, 400);
        JPanel p = new JPanel();
        p.setBackground(Color.GREEN);
        JButton knopf = new JButton("Do not push!");
        p.add(knopf);
        fenster.add(p);
        fenster.setVisible(true);
    }
}
