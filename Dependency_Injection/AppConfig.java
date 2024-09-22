package Dependency_Injection;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// The above would be imported inside Spring framework

@Configuration
public class AppConfig {

    @Bean
    public Engine petrolEngine() {
        return new PetrolEngine(); // Inject Petrol Engine
    }

    @Bean
    public Car car() {
        return new Car(petrolEngine()); // Inject Car with Petrol Engine
    }
}
