package OOPS.interfaces;

public class Car{
    private Engine engine;
    private Media media;
    private Brake brake;

    public Car(Engine engine, Media media) {
        this.engine = engine;
        this.media = media;
        this.brake = (Brake) engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }

    public void brake() {
        brake.brake();
    }

    public void acc() {
        engine.acc();
    }

    public void startMusic(){
        media.start();
    }

    public void stopMusic(){
        media.stop();
    }

    public void changeEngine(Engine engine) {
        this.engine = engine;
    }

    public void changeBrake(Engine engine) {
        this.brake = (Brake) engine;
    }

    public void changeMedia(Media media) {
        this.media = media;
    }

    public  void price(){
        int price = engine.getPrice() + 100000;
        System.out.println("Car is estimated to be around ₹" + price);
    }

    public  void engineStatus(){
        engine.showStatus();
    }
}
