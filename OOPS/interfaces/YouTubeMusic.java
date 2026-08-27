package OOPS.interfaces;

public class YouTubeMusic implements Media{
    @Override
    public void start() {
        System.out.println("Music started [Not Sure] on yt");
    }

    @Override
    public void stop() {
        System.out.println("Music stopped on yt");
    }
}
