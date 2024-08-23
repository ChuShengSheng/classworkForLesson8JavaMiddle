package oopDesignConceptsL8;

public class Department {
    String name;
    Company company = new Company();

    public Company getCompany() {
            return company;
    }

    public String getCompanyName() {
        return company.getName();
    }
}
