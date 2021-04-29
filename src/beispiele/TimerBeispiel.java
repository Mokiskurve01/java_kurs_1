package beispiele;

import tools.StandardAnwendung;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class TimerBeispiel extends StandardAnwendung implements ActionListener {
    public static void main(String[] args) {
        starteAnwendung();
    }

    private int xPos = 40;

    public TimerBeispiel() {
        super("Timer Beispiel", 400, 300);
        this.setBackground(Color.BLACK);
        Timer tick = new Timer(1000, this);
        tick.start();
    }

    @Override
    public void zeichne(Graphics2D g) {
        g.setColor(Color.GREEN);
        g.fillOval(xPos, 50, 40, 40);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        xPos = (xPos + 50) % 100;
        this.repaint(); // fordert den Window-Manager das Panel neu zu zeichnen

    }
}
