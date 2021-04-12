package komponenten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class KlickKnopf extends JButton  implements ActionListener{

    public KlickKnopf() {
        super("Klick");
        this.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        JOptionPane.showMessageDialog( this,
                "Das war falsch", "FEHLER", JOptionPane.ERROR_MESSAGE);

    }
}