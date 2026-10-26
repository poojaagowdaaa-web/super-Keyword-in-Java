package Basics;

class Vehicle {
    String brand = "Toyota";

    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Car extends Vehicle {
    String brand = "BMW";

    void display() {
        System.out.println("Car brand: " + brand);
        System.out.println("Parent brand: " + super.brand);

        super.start();
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.display();
    }
}