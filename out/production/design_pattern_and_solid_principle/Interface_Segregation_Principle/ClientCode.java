package out.production.design_pattern_and_solid_principle.Interface_Segregation_Principle;

// Client code
public class ClientCode {
    public static void main(String[] args) {
        Document document = new Document() {
            @Override
            public void open() {
                System.out.println("Opening document");
            }

            @Override
            public void save() {
                System.out.println("Saving document");
            }

            @Override
            public void close() {
                System.out.println("Closing document");
            }
        };

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.print(document);
        multiFunctionPrinter.scan(document);

        SimplePrinter simplePrinter = new SimplePrinter();
        simplePrinter.print(document);

        SimpleScanner simpleScanner = new SimpleScanner();
        simpleScanner.scan(document);
    }
}