package beispiele;

import tools.StandardAnwendung;

public class KlickBeispiel3 extends StandardAnwendung {

    public static void main(String[] args) {
        starteAnwendung();
    }
    public KlickBeispiel3(){
        super("Klick Beispiel 3",300,300);
        this.add(new PanelRotButton(this));
    }
}
