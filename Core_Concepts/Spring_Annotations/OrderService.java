package Core_Concepts.Spring_Annotations;

@Service
public class OrderService {

    @Autowired
    private UserRepository UserRepository; // Field injection
    private Core_Concepts.Spring_Annotations.UserRepository userRepository;

    @Autowired
    public OrderService(UserRepository userRepository) {
        // Constructor injection
        this.userRepository = userRepository;
    }
}