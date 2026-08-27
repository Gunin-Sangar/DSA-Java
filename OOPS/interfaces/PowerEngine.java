package OOPS.interfaces;

public class PowerEngine implements Engine, Brake{
    final int PRICE = 100000;
    EngineStatus status = new EngineStatus();

    @Override
    public void showStatus() {
        status.showStatus();
    }

    @Override
    public int getPrice() {
        return PRICE;
    }

    @Override
    public void start() {
        if(status.isStarted){
            System.out.println("Power engine already Started");
        }else {
            System.out.println("Power engine Started");
            status.isStarted = true;
        }
    }

    @Override
    public void stop() {
        if(status.isStarted){
            System.out.println("Power engine Stopped");
            status.isStarted = false;
        }else {
            System.out.println("Power engine already Stopped");
        }
    }

    @Override
    public void brake() {
        System.out.println("Power Brakes applied");
    }

    @Override
    public void acc() {
        System.out.println("Power Acceleration [going faster]");
    }
}
