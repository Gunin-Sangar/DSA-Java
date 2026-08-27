package OOPS.interfaces;

public class ElectricEngine implements Engine, Brake{
    final int PRICE = 90000;
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
            System.out.println("Electric engine already Started");
        }else {
            System.out.println("Electric engine Started [Silent]");
            status.isStarted = true;
        }
    }

    @Override
    public void stop() {
        if(status.isStarted){
            System.out.println("Electric engine Stopped");
            status.isStarted = false;
        }else {
            System.out.println("Electric engine already Stopped");
        }
    }

    @Override
    public void brake() {
        System.out.println("Electric Brakes applied");
    }

    @Override
    public void acc() {
        System.out.println("Electric Acceleration [going fast]");
    }
}