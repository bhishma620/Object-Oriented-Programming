
interface Vehicle {
    void start();
    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    public void drive() {
        System.out.println("Car is moving on the road.");
    }
}

class Motorcycle implements Vehicle {
    @Override
    public void start() {
        System.out.println("Motorcycle is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle is stopping...");
    }

    public void ride() {
        System.out.println("Motorcycle is riding on the street.");
    }
}



public class UsingInterface {

   public static void controlCar(Vehicle vh){
        vh.start();
        vh.stop();
    }

   public static void main(String[] args) {
        Vehicle myCar = new Car();
        controlCar(myCar);

        Vehicle myMotorcycle = new Motorcycle();
        controlCar(myMotorcycle);

    }
}
