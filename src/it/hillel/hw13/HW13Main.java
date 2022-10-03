package it.hillel.hw13;

import java.util.Scanner;

public class HW13Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n =console.nextInt();
        int m = console.nextInt();
        int[][] transposition = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transposition[i][j] = n*i + j;
            }
        }


        System.out.println("Start matrix");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%4d",  transposition[i][j]);
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < m; j++) {
                int temp =  transposition[i][j];
                transposition[i][j] =  transposition[j][i];
                transposition[j][i] = temp;
            }
        }


        System.out.println();
        System.out.println("New matrix");
        System.out.println("------");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%3d",  transposition[i][j]);
            }
            System.out.println();
        }



    }
}
