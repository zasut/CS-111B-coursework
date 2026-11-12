package PokerHands;
import java.util.Scanner;

public class PokerHands {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] cards = new int[5];

        System.out.println("Enter five numeric cards between 2 and 9.");

        for (int i = 0; i < 5; i++) {
            System.out.print("Card " + (i + 1) + ": ");
            cards[i] = input.nextInt();
        }

        boolean pair = false;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (cards[i] == cards[j]) {
                    pair = true;
                }
            }
        }

        int min = cards[0];
        int max = cards[0];
        for (int i = 1; i < 5; i++) {
            if (cards[i] < min) {
                min = cards[i];
            }
            if (cards[i] > max) {
                max = cards[i];
            }
        }

        if (pair) {
            System.out.println("Pair!");
        } else if (max - min == 4) {
            System.out.println("Straight!");
        } else {
            System.out.println("High Card!");
        }

        input.close();
    }
}