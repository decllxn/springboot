package Field_injection;

@Component
@Qualifier("dieselEngine")
public class DieselEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Diesel Engine started");
    }
}
