package out.production.design_pattern_and_solid_principle.Interface_Segregation_Principle;

public interface Machine {
    void print(Document document);
    void fax(Document document);
    void scan(Document document);
}
