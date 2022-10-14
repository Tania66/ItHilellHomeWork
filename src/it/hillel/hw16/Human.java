package it.hillel.hw16;

public class Human {

    private final int YEAR_FROM_COUNT = 2020;

    private final String firstName;
    public String lastName;
    private final int dayOfBirth;
    private final int monthOfBirth;
    private final int yearOfBirth;
    public int weight;
    public   int pressure;
    public int stepsTheDay;
    private final String email;
    private final int phoneNumber;
    public int age;


    public Human(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int yearOfBirth,
                 int weight, int pressure, int stepsTheDay, String email, int phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dayOfBirth = dayOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.yearOfBirth = yearOfBirth;
        this.weight = weight;
        this.pressure = pressure;
        this.stepsTheDay = stepsTheDay;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getDayOfBirth() { return dayOfBirth; }

    public int getMonthOfBirth() { return monthOfBirth; }

    public int getYearOfBirth() { return yearOfBirth; }

    public String getEmail() { return email; }

    public int getPhoneNumber() { return phoneNumber; }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getStepsTheDay() {
        return stepsTheDay;
    }

    public void setStepsTheDay(int stepsTheDay) {
        this.stepsTheDay = stepsTheDay;
    }

    public int getAge(int validateAge) {
        return validateAge;
    }

    public int validateAge(){
        return  age = YEAR_FROM_COUNT - this.yearOfBirth;
    }

    public void  printAccountInfo(){

        System.out.println("First Name: "+ this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Day Of Birth: " + this.dayOfBirth);
        System.out.println("Month Of Birth: " + this.monthOfBirth);
        System.out.println("Year Of Birth: " + this.yearOfBirth);
        System.out.println("Weight: " + this.weight);
        System.out.println("Pressure: " + this.pressure);
        System.out.println("Step the day: " + this.stepsTheDay);
        System.out.println("Email: "+ this.email);
        System.out.println("Phone Number: " + this.phoneNumber);
        System.out.println("Age: " + validateAge());
    }

}
