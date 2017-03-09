package pl.bobinicz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input a word to encrypt: ");
        String toEncrypt = userInput.nextLine();

        System.out.println("Please input a key (choose from range 0-25): ");
        int key = userInput.nextInt();

        System.out.println("You choose a word: " + toEncrypt + " with key: " + key);

        char[] toEncArr = toEncrypt.toCharArray();

        for (int i = 0; i < toEncArr.length; i++) {

        }
    }

}
