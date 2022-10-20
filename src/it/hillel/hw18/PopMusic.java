package it.hillel.hw18;

public class PopMusic extends  MusicStyles{


    public PopMusic(String group) {
        super(group);
    }

    @Override
    public void playMusic() {
        System.out.println("Pop Music: "+ getGroup());
    }
}
