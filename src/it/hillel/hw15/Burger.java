package it.hillel.hw15;

public class Burger extends dietBurger{

    public String mayonnaise;

    public Burger(String bun, String greens, String cheese, String meat, String mayonnaise) {
        super(bun, greens, cheese, meat);
        this.mayonnaise = mayonnaise;
    }


    @Override
    public void getBurger() {
        System.out.println("Burger: " + this.bun+" " + this.cheese+ " " + this.greens +" "+ this.meat+" "  + this.mayonnaise);


    }
}
