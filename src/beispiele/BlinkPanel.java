package beispiele;

import tools.StandardAnwendung;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlinkPanel extends StandardAnwendung implements ActionListener {
    public static void main(String[] args) {
        starteAnwendung();
    }

    public BlinkPanel() {
        super("Blinker", 300, 400);
        Timer tick = new Timer(1000, this);
        tick.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (Color.BLACK.equals(this.getBackground())) {
            this.setBackground(Color.WHITE);
        } else {
            this.setBackground(Color.BLACK);
        }
    }
}
