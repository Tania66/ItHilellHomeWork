package it.hillel.hw16;

public class GettersandSettersMain {
    public static void main(String[] args) {

        Human human = new Human("David","Depp",3,5,
                1976,66,200,7500,"davidDepp@space.com",76543);
        System.out.println(human.getLastName());
        human.setLastName("Grey");
        System.out.println(human.getLastName());
        System.out.println(human.getStepsTheDay());
        human.setStepsTheDay(40000);
        System.out.println(human.getStepsTheDay());
        human.printAccountInfo();
        System.out.println("");



        Human human1 = new Human("John","Snow",12,6,
                1988,95,179,10000,"DragoSnow@space.com", 348573);
        human1.printAccountInfo();
        System.out.println("");


        Human human2 = new Human("Robert","lock",22,3,
                1999,88,180,20000,"RoberLokki@space.com",3561278);
        System.out.println(human2.getStepsTheDay());
        human2.setStepsTheDay(25000);
        System.out.println(human2.getStepsTheDay());
        System.out.println(human2.getWeight());
        human2.setWeight(95);
        System.out.println(human2.getWeight());
        human2.printAccountInfo();
        System.out.println("");


        Human human3 = new Human("Ariel","Smith",15,3,
                2000,47,160,30000,"AriaPrinces@space.com",4812993);
        human3.printAccountInfo();
        System.out.println("");


    }
}
