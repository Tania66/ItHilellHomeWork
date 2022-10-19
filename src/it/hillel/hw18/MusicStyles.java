package it.hillel.hw18;

public class MusicStyles {

    private String group;

    public MusicStyles(String group) {
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void playMusic(){
        System.out.println(group);
    }





}
