package oopDesignConceptsL8.badDepartmentExample;

import oopDesignConceptsL8.BadDepartment;
import oopDesignConceptsL8.Company;

public class BadDepartmentExample {
    public static void main(String[] args) {
        Company company = new Company();
        BadDepartment badDepartment = new BadDepartment(company);
  //      badDepartment.setCompany(company);
    }
}
