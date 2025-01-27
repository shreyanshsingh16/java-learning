
class Vehicle {
    public void start() {
        System.out.println("Vehicle has started");
    }
}


class Car extends Vehicle {
 
    public void start() {
        System.out.println("Car has started");
    }
}

public class main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); 

        Car car = new Car();
        car.start();
    }
}
