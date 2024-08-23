package oopDesignConceptsL8;

public class ExampleProblem {
    public static void main(String[] args) {
        //Хотим добавить подразделения в организацию
        var company = new Company();
        var departments = company.getDepartments();

        departments.add(new Department());
        departments.add(new Department());
        System.out.println("----------");

        //Подразделения добавились, проверяем кол-во
        System.out.println("company.getDepartments().size(): " + company.getDepartments().size());
        //Департамент не привязан к компании
        System.out.println("departments.get(0).getCompany(): " + departments.get(0).getCompany());
        System.out.println("departments.get(0).getCompany(): " + departments.get(1).getCompany());
    }
}
