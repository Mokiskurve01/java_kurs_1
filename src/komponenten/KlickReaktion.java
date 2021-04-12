package komponenten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class KlickReaktion implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent arg0) {
        JOptionPane.showMessageDialog( null, "Das war falsch", "FEHLER", JOptionPane.ERROR_MESSAGE);
    }

}