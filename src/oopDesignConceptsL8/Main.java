package oopDesignConceptsL8;

// Employee -> Department <-> Company
public class Main {
    public static void main(String[] args) {

        //Есть сотрудник, нужно получить название организации в которой он работает
        Employee employee = new Employee();

        String companyName1 = employee.department.company.name;

        String companyName2 = employee.getDepartment().getCompany().getName();

        String companyName3 = employee.getCompanyName();
    }
}
