package beispiele;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelRotButton extends JButton implements ActionListener {

    //ein JButton , der bei Klick ein JPanel rot färbt

    private JPanel panel;//instanzVariable

    public PanelRotButton(JPanel panel) {//Konstruktor
        super("Rot");
        this.panel = panel;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {//instanzMethode
        panel.setBackground(Color.RED);
    }
}
