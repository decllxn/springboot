package Method_injection;

import Core_Concepts.Spring_Annotations.Component;

// import org.springframework.context.annotation.Scope;
// import org.springframework.stereotype.Component;

// Below, the MaintenanceService method performMaintenance() requires an,
// Engine to function, but does not need to keep the Engine as a field

@Component
public class MaintenanceService {
    public void performMaintenance(Engine engine) {
        engine.start();
        System.out.println("Maintenance performed on the Engine");
    }
}
