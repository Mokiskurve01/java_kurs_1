package komponenten;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.Timer;

public class TimerStopKnopf extends JButton implements ActionListener {

    private Timer tick;

    public TimerStopKnopf(Timer tick){
        super("STOP");
        this.tick = tick;
        this.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        tick.stop();
    }
}