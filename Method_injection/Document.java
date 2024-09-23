package Method_injection;

import Core_Concepts.Spring_Annotations.Component;

// import org.springframework.context.annotation.Scope;
// import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Document {

    public String getContent() {
        return "This is a document";
    }

}

// Scope("protoype")
// Ensures that a new instance is created each time