package Sesson2_HW;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(101, "Hyundai", "Solaris", 2021, 50, 20);
        Aircraft aircraft1 = new Aircraft(201, "Airbus", "A333-300", 1992, 12500, true);
        Boat boat1 = new Boat(301, "Quantum of the Seas", "Harmony of the Seas", 2016, 25, true);
     
        car1.displayInfo();
        car1.startEngine();
        car1.accelerate(20);
        car1.brake();
        car1.stopEngine();
        System.out.println("Сейчас в баке автомобиля " + car1.getCurrentFuelLevel() + " литров топлива. Заправим его.");
        car1.refuel(15);
        System.out.println("Теперь в баке автомобиля " + car1.getCurrentFuelLevel() + " литров топлива.\n");

        aircraft1.displayInfo();
        aircraft1.land();
        aircraft1.brake();
        aircraft1.stopEngine();
        aircraft1.startEngine();
        aircraft1.takeOff();
        aircraft1.accelerate(800);
        System.out.println();

        boat1.displayInfo();
        boat1.stopSwimming();
        boat1.brake();
        boat1.stopEngine();
        boat1.startEngine();
        boat1.startSwimming();
        boat1.accelerate(10);
    }
}