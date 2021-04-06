package beispiele;

public class GiroKonto extends Konto{
    private int limit;

    public GiroKonto(int kontoNummer) {
        super(kontoNummer);// ruft den Konstruktor der Basisklasse
        this.limit = 0;
    }

    public GiroKonto(int kontoNummer, int limit) {  // Konto mit Überziehungskredit
        super(kontoNummer);
        this.limit = limit;
    }

    public int getLimit() {
        return this.limit;
    }
}
