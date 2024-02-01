// Martin Lorenz S. Fajardo
// ACT122L-OAaL
// 01, February 2024

import java.util.Random;

public class Rando {
    private static final int ARRAY_LENGTH = 10;
    private static final int RANDOM_MAX = 100;

    private int[] array;

    public Rando() {
        array = new int[ARRAY_LENGTH];
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            array[i] = 0;
        }
    }

    public void randomizer() {
        Random rand = new Random();
        int randomValue = rand.nextInt(RANDOM_MAX) + 1;
        int randomIndex = rand.nextInt(ARRAY_LENGTH);
        array[randomIndex] = randomValue;
        printArray();
    }

    public void getSum() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        System.out.println("The sum is: " + sum);
    }

    public void getAverage() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        double average = (double) sum / ARRAY_LENGTH;
        System.out.println("The average is: " + average);
    }

    public void findTheHighestValue() {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < ARRAY_LENGTH; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }
        System.out.println("The highest value is: " + max);
        System.out.println("Location: index " + maxIndex);
    }

    private void printArray() {
        System.out.println("Randomizing a value..");
        System.out.println("===================================================");
        System.out.print("| ");
        for (int value : array) {
            System.out.print(value + "  | ");
        }
        System.out.println("\n===================================================");
    }

    public static void main(String[] args) {
        Rando arrayOps = new Rando();
        arrayOps.randomizer();
        arrayOps.getSum();
        arrayOps.getAverage();
        arrayOps.findTheHighestValue();
        System.out.println("\nThank you for using my Program!");
    }
}