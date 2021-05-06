package beispiele;

import java.awt.*;

public class Ei {
    protected int groesse;

    public Ei(int groesse) {
        this.groesse = groesse;
    }
}

class OsterEi extends Ei {
    private Color farbe;

    public OsterEi(int groesse, Color farbe) {
        super(groesse);
        this.farbe = farbe;
    }

}
