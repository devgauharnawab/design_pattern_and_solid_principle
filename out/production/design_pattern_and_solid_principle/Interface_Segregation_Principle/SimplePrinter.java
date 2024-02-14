package out.production.design_pattern_and_solid_principle.Interface_Segregation_Principle;

public class SimplePrinter implements  Printer {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document);
    }
}
