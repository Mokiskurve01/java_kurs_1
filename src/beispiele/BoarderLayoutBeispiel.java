package beispiele;

import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;

public class BoarderLayoutBeispiel extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public BoarderLayoutBeispiel() {
        super("Border-Layout Beispiel", 800, 700);
        this.setLayout(new BorderLayout());

        JPanel oben = new JPanel();
        oben.setBackground(Color.RED);
        oben.add(new JLabel("NORTH"));

        JPanel links = new JPanel();
        links.setBackground(Color.GREEN);
        links.add(new JLabel("WEST"));

        JPanel center = new JPanel();
        center.setBackground(Color.BLUE);
        //center.add(new JLabel("CENTER"));

        this.add(oben, BorderLayout.NORTH);
        this.add(links, BorderLayout.WEST);
        this.add(center, BorderLayout.CENTER);
        center.setLayout(new BorderLayout());
        JTextArea eingabe = new JTextArea(20,40);
        JScrollPane sp = new JScrollPane(eingabe);
        center.add(sp);
    }

}
