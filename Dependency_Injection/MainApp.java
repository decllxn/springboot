package Dependency_Injection;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class MainApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Car myCar = context.getBean(Car.class);
        myCar.drive();
    }
}
