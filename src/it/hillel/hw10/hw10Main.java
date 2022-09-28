package it.hillel.hw10;

public class hw10Main {
    public static void main(String[] args) {
        int n = 0, i = 0;
        while (n <= 100) {
            if (!String.valueOf( i ).contains( "4" ) && !String.valueOf( i ).contains( "9" )) {
                System.out.println(i);
                n++;
            }
            i++;
        }
    }
}
