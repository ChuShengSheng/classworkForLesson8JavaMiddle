package oopDesignConceptsL8;

public class BadDepartment {

    private final Company company;

    public BadDepartment(Company company) {
        if (company == null) {
            throw new NullPointerException("company is null");
        }
        this.company = company;
    }

    public Company getCompany() {
        return this.company;
    }
}
