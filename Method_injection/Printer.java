package Method_injection;

// import org.springframework.beans.factory.annotation.Lookup;
// import org.springframework.stereotype.Component;

public class Printer {
    
    // The method will be overriden by spring to return,
    // a prototype ben

    @Lookup
    public Document createDocument() {
        // This method will be overriden,
        // so actual implementation is not necessary
        return null;
    }

    public void print() {
        // A new prototype instance each time
        Document doc = createDocument();
        System.out.println("Printing: " + doc.getContent());
    }
}

// In the above, printer is a singleton bean that calls the createDocument()
// method to get a prototype instance of Document.

// The method createDocument() is overriden by Spring to return a,
// new Document instance each time