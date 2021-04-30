package beispiele;

public class Schatz {       //es gibt von dieser Klasse nur ein Objekt
    private static Schatz derSchatz = null;

    private int wert;

    private Schatz() {      //verhindert Instanziieung ( von aussen nicht möglich zum erzeugen)
    }

    public static Schatz getInstanz() {
        if(derSchatz == null){
            derSchatz = new Schatz();
        }
        return derSchatz;
    }

    public int getWert() {
        return wert;
    }

    public void setWert(int wert) {
        this.wert = wert;
    }
}
