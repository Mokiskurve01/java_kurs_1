package komponenten;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JPanel;

public class ZufallsFarbKnopf extends JButton implements ActionListener {

    private JPanel panel;
    private Random zufall;

    public ZufallsFarbKnopf(JPanel panel) {
        super("Zufaellige Farbe");
        this.panel = panel;
        this.zufall = new Random();
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        int r = zufall.nextInt(128) + 128;
        int g = zufall.nextInt(128) + 128;
        int b = zufall.nextInt(128) + 128;
        panel.setBackground(new Color(r, g, b));
    }
}

