package aufgaben;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_04_JPanel extends JPanel {

    public static void main(String[] args) {
        JFrame fenster = new JFrame("Aufgabe 4");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(500, 400);
        Aufgabe_04_JPanel panel = new Aufgabe_04_JPanel();
        fenster.add(panel);
        fenster.setVisible(true);
    }

    public Aufgabe_04_JPanel() {
        this.setBackground(Color.GREEN);
        JButton knopf = new JButton("Do not push!");
        this.add(knopf);
    }
}
