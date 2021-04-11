package beispiele;

import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class KickBeispiel2 extends StandardAnwendung implements ActionListener {

    public static void main(String[] args) {
        starteAnwendung();
    }

    public KickBeispiel2() {
        super("Klick Beispiel 2", 600, 300);
        JButton klick = new JButton("Klick mal");
        this.add(klick);
        klick.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Klick, Zeit=" + e.getWhen()+" Millisek. seit dem 1.1.1970");
        System.out.println("Klick, Zeit=" + new Date(e.getWhen()));
    }
}
