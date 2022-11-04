package it.hillel.hw17;

public class SmartMain {
    public static void main(String[] args) {

        Androids androids = new Androids("Asus","duo");
        androids.phoneInfo();
        androids.LinuxOS();

        iPhone iPhones = new iPhone("iPhone 12", "Pro");
        iPhones.phoneInfo1();
        iPhones.ios();
    }
}

