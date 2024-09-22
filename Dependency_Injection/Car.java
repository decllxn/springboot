package Dependency_Injection;

// Car Class that depends on Engine
public class Car {
    private Engine engine;

    // Constructor Injection
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Driving...");
    }
}
