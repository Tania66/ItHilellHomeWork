package it.hillel.hw17;

public class Androids implements Smartphone,LinuxOS {

    public String namePhone;
    public String model;

    public final String systemType = "Android";

    public Androids(String namePhone, String model) {
        this.namePhone = namePhone;
        this.model = model;

    }

    @Override
    public void LinuxOS() {
        LinuxOS.super.LinuxOS();
    }

    @Override
    public void call() {
        System.out.println();
    }

    @Override
    public void sms() {
        System.out.println();
    }

    @Override
    public void internet() {
        System.out.println();
    }
    public void phoneInfo(){
        System.out.println("Android: " +
                "Name Phone:" + namePhone  +
                ", model:" + model +
                ", systemVersion:" + systemType );
    }
}
