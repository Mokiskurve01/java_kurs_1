package beispiele;

public class Bank {
    public static void main(String[] args) {
        Konto k1, k2;
        k1 = new Konto(101);
        k2 = new Konto(102);

        k1.einzahlen(3000);
        k2.einzahlen(2000);

        System.out.println("Konto 101 hat " + k1.getSaldo() + " Cent Guthaben");
        System.out.println("Konto 102 hat " + k2.getSaldo() + " Cent Guthaben");

        GiroKonto k3 = new GiroKonto(103);
        GiroKonto k4 = new GiroKonto(104, 50000);

        System.out.println("Konto 103 hat Guthaben: " +k3.getSaldo()+ " Limit= " + k3.getLimit());
        System.out.println("Konto 104 hat Guthaben: " +k4.getSaldo() + " Limit= " + k4.getLimit());
    }
}
