package OOPS.interfaces;

public class SpotifyMusic implements Media{
    @Override
    public void start() {
        System.out.println("Music started [Not Sure]");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped");
    }
}
