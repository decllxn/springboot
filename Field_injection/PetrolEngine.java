package Field_injection;

@Component
@Qualifier("petrolEngine")
public class PetrolEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Petrol Engine started");
    }
}
