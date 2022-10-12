package it.hillel.hw15;

public class DoubleMeat extends Burger {

    public String doubleMeat;

    public DoubleMeat(String bun, String greens, String cheese, String meat, String mayonnaise, String doubleMeat) {
        super(bun, greens, cheese, meat, mayonnaise);
        this.doubleMeat = doubleMeat;
    }

    @Override
    public void getBurger() {
        System.out.println("Double Burger: "  + this.bun + " " + this.cheese  + " " + this.greens  + " " + this.meat
                +" "+ this.mayonnaise
                + " "+ this.doubleMeat);


    }
}
