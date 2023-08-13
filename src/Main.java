import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 50; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));

        }
        ArrayList<Integer> integers1 = new ArrayList<>();
        for (int j = 0; j <= 50; j++) {
            integers1.add(random.nextInt(100));
            if (integers1.get(j) % 2 == 0) {
                System.out.println("Целое число : " + integers1.get(j));

            }
            ArrayList<Integer> integers2 = new ArrayList<>();
            for (int k = 0; k <= 50; k++) {
                integers2.add(random.nextInt(100));
                if (integers2.get(k) % 2 == 1) {
                    System.out.println("Дробное число : " + integers2.get(k));

                }

            }
        }
    }
}
