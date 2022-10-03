package it.hillel.hw11;

import java.util.Random;

public class HW11Main {

    public static void main(String[] args) {

        Random random = new Random();
        int [] arr = new int[25];
        int team1 = 0;
        int team2 =0;
        int  age1 = 0;
        int age2 = 0;
        for (int i = 0; i<arr.length;i++){

            team1 += arr[i]  = random.nextInt(22)+18;
            team2 += arr[i] =  random.nextInt(22)+18;

            age1 = team1/25;
            age2 = team2/25;

        }

        System.out.println("Team1 "+team1+ " " + "Age1 "+ age1);
        System.out.println("Team2 "+team2+ " " + "Age2 "+ age2);


    }
}
