package it.hillel.hw14;

public class Person {


    public String firstName;
    public String lastName;
    public String city;
    public String phoneNumber;


    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    public Person(String firstName, String lastName, String city, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.phoneNumber = phoneNumber;
    }

    public void  personInfo(){
        System.out.println("Call to person "+ firstName + lastName+ " from " + city +
                " the phone number "+ phoneNumber);
    }

}
