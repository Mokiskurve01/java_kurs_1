package beispiele;

import java.util.Random;

public class RandomBeispiel {
    public static void main(String[] args) {
        Random zufall = new Random(1);
        System.out.println(zufall.nextInt(100));
        System.out.println(zufall.nextInt(100));
        System.out.println(zufall.nextInt(100));
        System.out.println(zufall.nextInt(100));
        System.out.println(zufall.nextInt(100));

    }
}
