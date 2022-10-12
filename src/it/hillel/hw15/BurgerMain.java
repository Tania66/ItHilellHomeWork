package it.hillel.hw15;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger = new Burger("bun","greens","cheese","meat","mayonnaise");
        burger.getBurger();
        System.out.println("");

        dietBurger burger1 = new dietBurger("bun","greens","cheese","meat");
        burger1.getBurger();
        System.out.println("");

        DoubleMeat burger2 = new DoubleMeat("bun","greens","cheese","meat","mayonnaise","meat");
        burger2.getBurger();

    }
}
