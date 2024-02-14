package out.production.design_pattern_and_solid_principle.Interface_Segregation_Principle;

// Class representing a simple scanner which implements only the Scanner interface
class SimpleScanner implements Scanner {
    @Override
    public void scan(Document document) {
        System.out.println("Scanning document: " + document);
    }
}