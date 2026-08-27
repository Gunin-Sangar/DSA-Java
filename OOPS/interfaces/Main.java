package OOPS.interfaces;

public class Main {
    public static void main(String[] args) {
        Engine engine = new PowerEngine();
        Media media = new SpotifyMusic();
        Car car = new Car(engine, media);

        car.start();
        car.start();
        car.acc();
        car.brake();
        car.stop();
        System.out.println();
        car.startMusic();
        car.stopMusic();
        car.price();
        car.engineStatus();
        System.out.println();

        car.changeEngine(new ElectricEngine());
        car.changeBrake(new ElectricEngine());
        car.changeMedia(new YouTubeMusic());

        car.start();
        car.start();
        car.acc();
        car.brake();
        car.stop();
        System.out.println();
        car.startMusic();
        car.stopMusic();
        car.price();
        car.engineStatus();
        System.out.println();
    }
}
