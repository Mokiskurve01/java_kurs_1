package komponenten;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class FarbKnopf extends JButton implements ActionListener {
    private Color farbe;
    private JPanel panel;

    public FarbKnopf(String titel, Color farbe, JPanel panel) {
        super(titel);
        this.farbe = farbe;
        this.panel = panel;
        this.addActionListener(this);
        this.setBackground(farbe);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        panel.setBackground(farbe);
    }
}