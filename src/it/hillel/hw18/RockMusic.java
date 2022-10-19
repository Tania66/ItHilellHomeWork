package it.hillel.hw18;

public class RockMusic extends MusicStyles{

    public RockMusic(String group) {
        super(group);
    }

    @Override
    public void playMusic(){
        System.out.println("Rock Music : " + getGroup());
    }

}
