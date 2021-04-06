package beispiele;

public class Konto {
    protected int saldoCent, kontoNummer;

    public Konto(int kontoNummer) {
        this.kontoNummer = kontoNummer;
        this.saldoCent = 500;
    }

    public void einzahlen(int einzahlen) {
        this.saldoCent = this.saldoCent + einzahlen;
        //this zeigt auf das Objekt, für welches eine Instanzmethode arbeitet
    }

    public void auszahlen(int auszahlung) {
        this.saldoCent = this.saldoCent - auszahlung;
    }

    public int getSaldo() {
        return saldoCent;
    }
    @Override       //signalisiert dem Compiler, dass eine geerbte Methode ersetzt wird
    public String  toString(){
        return "Konto Nr."+kontoNummer+ " aktueller Saldo= "+saldoCent+" Ct";
    }
}
