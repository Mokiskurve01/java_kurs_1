package beispiele;

import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;

public class SwingBeispiel extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public SwingBeispiel() {
        super("Titel", 500, 400);
        this.setLayout(new GridLayout(4,3));
        this.setBackground(Color.YELLOW);
        this.add(new JLabel("Hallo Welt wie geht es denn heute!!!!!!!!!!!"));
        JButton knopf = new JButton("Klick mich");
        this.add(knopf);
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
        this.add(new JButton("Klick"));
    }
}
