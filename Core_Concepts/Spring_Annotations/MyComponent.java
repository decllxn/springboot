package Core_Concepts.Spring_Annotations;


// Here MyCOmponent will be detected as a Spring component and available,
// dependency injection in other classes

@Component
public class MyComponent {
    public void doSomething() {
        System.out.println("Doing Something");
    }
}

