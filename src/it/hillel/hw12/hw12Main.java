package it.hillel.hw12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class hw12Main {
    public static void main(String[] args) {

        Random random = new Random();

        int [] company = new int[7];

        for (int i =0; i<company.length;i++) {
            company[i] = random.nextInt(10);

        }
        Arrays.sort(company);
        System.out.println("Write number 0 to 9");
        Scanner console = new Scanner(System.in);


        int [] player = new int[7];
        for (int i = 0; i<player.length;i++){
            player[i] = console.nextInt();
            Arrays.sort(player);
        }
        int count = 0;
        for (int i = 0; i < 7; i++) {
            if (company[i]==player[i])count++;
        }

        System.out.println( Arrays.toString(player));
        System.out.println(" ");
        System.out.println( Arrays.toString(company));
        System.out.printf("Number of matches: " + count);






    }
}