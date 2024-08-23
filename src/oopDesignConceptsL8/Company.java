package oopDesignConceptsL8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Company {
    String name;
    List<Department> departments = new ArrayList<>();

    public List<Department> getDepartments(){
        return departments;
    }

    public String getName(){
        return name;
    }

    public List<Department> getUnmodifiableDepartments(){
        return Collections.unmodifiableList(departments);
    }

    public Iterable<Department> getDepartmentsIterable(){
        return departments;
    }
}
