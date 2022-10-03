package it.hillel.hw14;

public class HW14Main {
    public static void main(String[] args) {

        Person person = new Person("Will ", "Simson","California","59386629");
        Person person1 = new Person("Petter ","Holmes", "New York","56100573" );
        Person person2 = new Person("Jeck ", "Sparow", "London", "22288561");

        person.personInfo();
        person1.personInfo();
        person2.personInfo();


    }
}
