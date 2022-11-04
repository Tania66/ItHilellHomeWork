package it.hillel.hw17;

public class iPhone implements Smartphone,IOS {
    public String namePhone;
    public String model;
    public final String systemType = "IPhone";

    public iPhone(String namePhone, String model) {
        this.namePhone = namePhone;
        this.model = model;
    }

    public void ios() {
        IOS.super.ios();
    }

    @Override
    public void call(){
    }

    @Override
    public void sms() {

    }

    @Override
    public void internet() {

    }
    public void phoneInfo1(){
        System.out.println("iPhone: " +
                "Name Phone:" + namePhone  +
                ", model:" + model +
                ", systemVersion:" + systemType);
    }


}
