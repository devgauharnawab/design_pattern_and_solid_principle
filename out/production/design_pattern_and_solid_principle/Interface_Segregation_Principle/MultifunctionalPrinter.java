package out.production.design_pattern_and_solid_principle.Interface_Segregation_Principle;

// Class representing a multifunction printer which implements both Printer and Scanner interfaces
class MultiFunctionPrinter implements Printer, Scanner {
    @Override
    public void print(Document document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document);
    }
}
