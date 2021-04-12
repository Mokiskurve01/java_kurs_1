package aufgaben;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KlickReaktion implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,
                "Du solltest doch nicht Klicken!", "Fehler",
                JOptionPane.ERROR_MESSAGE);
    }
}
