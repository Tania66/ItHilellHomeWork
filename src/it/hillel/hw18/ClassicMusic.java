package it.hillel.hw18;

public class ClassicMusic extends MusicStyles{

    public ClassicMusic(String group) {
        super(group);
    }

    @Override

    public void playMusic(){
        System.out.println("Classic Music : " + getGroup());
    }
}
