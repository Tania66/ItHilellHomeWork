package it.hillel.hw18;

public class HW18 {
    public static void main(String[] args) {


        MusicStyles[] musicStyles = new MusicStyles[] {new PopMusic("Beatles"),
                new RockMusic("Rammstein"), new ClassicMusic("Two steps from hell")};

        for (MusicStyles x : musicStyles) {
            x.playMusic();

        }




    }
}
