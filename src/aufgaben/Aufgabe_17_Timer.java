package aufgaben;

import komponenten.TimerStartKnopf;
import komponenten.TimerStopKnopf;
import tools.StandardAnwendung;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Aufgabe_17_Timer extends StandardAnwendung implements ActionListener {
    public static void main(String[] args) {
        starteAnwendung();
    }

    private Random random;

    public Aufgabe_17_Timer() {
        super("Aufgabe 17", 500, 450);
        random = new Random();
        Timer tick = new Timer(1000, this);
        this.add(new TimerStartKnopf(tick));
        this.add(new TimerStopKnopf(tick));
        // tick.start();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Color farbe = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        this.setBackground(farbe);
    }
}
