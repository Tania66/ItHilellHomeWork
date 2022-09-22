package it.hillel.hw9;


import java.util.Random;
import java.util.Scanner;


public class hw9main {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10) + 1;

        while (true) {
            System.out.println("Write number 0 to 10");
            int count = scanner.nextInt();
            if (count > randomNumber) {
                System.out.println("Try again");
            } else if (count < randomNumber) {
                System.out.println("Try again");
            } else if (count == randomNumber) {
                System.out.println("You win");
                break;
            }
        }
    }
}