package aufgaben;

import javax.swing.*;
import java.awt.*;

public class Aufgabe_5 extends JPanel {
    public static void main(String[] args) {
        JFrame fenster = new JFrame("Aufgabe_5");
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setSize(320, 400);
        Aufgabe_5 panel = new Aufgabe_5();
        fenster.add(panel);
        fenster.setVisible(true);
    }

    public Aufgabe_5() {
        this.setBackground(Color.BLUE);
        this.setLayout(new FlowLayout());
        JLabel label = new JLabel("Einstellung");
        JPanel einstellungPanel = new JPanel();
        einstellungPanel.add(label);
        this.add(einstellungPanel);

        JSlider slider = new JSlider();
        this.add(slider);
        JTextArea textArea = new JTextArea(13, 28);
        this.add(textArea);
        for (int i = 0; i < 7; i++) {               //ascii zeichencode erhoehung  ansteigendes alphabet
            int nummber = 65 + i;
            char c = (char) nummber;
            JRadioButton radioButton = new JRadioButton("" + c);
            this.add(radioButton);
        }
        JCheckBox checkBox = new JCheckBox("Rot");
        this.add(checkBox);
        checkBox = new JCheckBox("Grün");
        this.add(checkBox);
        checkBox = new JCheckBox("Blau");
        this.add(checkBox);
        checkBox = new JCheckBox("Gelb");
        this.add(checkBox);
        checkBox = new JCheckBox("Schwarz");
        this.add(checkBox);

        JTextField textField = new JTextField("Eingabe", 10);
        this.add(textField);
    }
}
