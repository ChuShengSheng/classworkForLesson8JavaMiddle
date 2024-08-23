package oopDesignConceptsL8;

public class Employee {
    String name;
    Department department;

    public Department getDepartment(){
        return department;
    }

    public String getCompanyName(){
        return department.getCompanyName();
    }

   // public String getCompanyName(){
   //      return this.department.getCompany().getName();
   // }
}
