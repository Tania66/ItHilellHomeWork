package it.hillel.hw12;

import java.util.Arrays;
import java.util.Random;
public class HW12Main {
    public static void main(String[] args) {


        Random random = new Random();

        int [] company = new int[7];
        for (int i =0; i<company.length;i++) {
            company[i] = random.nextInt(9);
        }
        Arrays.sort(company);


        int [] player = new int[7];
        for (int r = 0; r<player.length;r++){
            player[r] = random.nextInt(9);
        }
        Arrays.sort(player);

        System.out.print("Numbers that are matched: ");
        int count = 0;
        for (int r = 0; r < player.length; r++) {
            if (company[r] == player[r]){
                System.out.print(player[r] + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number company: ");
        System.out.println( Arrays.toString(player));
        System.out.println(" ");
        System.out.println("Number player: ");
        System.out.println( Arrays.toString(company));
        System.out.println("Count of matched numbers: " + count );
    }
}





