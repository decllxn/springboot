package Field_injection;

import Core_Concepts.Spring_Annotations.Autowired;

@Component
public class Car {
    private Engine engine;

    @Autowired
    public Car(
        @Qualifier("dieselEngine") Engine engine
    ) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving");
    }
}

// Qualifier("dieselEngine") ensures that dieselEngine bean is injected into
// the car
