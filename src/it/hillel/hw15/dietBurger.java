package it.hillel.hw15;

public class dietBurger {

    public String bun;
    public  String greens;
    public String cheese;
    public String meat;

    public dietBurger(String bun, String greens, String cheese, String meat) {
        this.bun = bun;
        this.greens = greens;
        this.cheese = cheese;
        this.meat = meat;
    }

    public void getBurger() {
        System.out.println("Diet Burger: " + this.bun + " "+ this.cheese +" "+ this.greens +" "+this.meat);



    }

}
