import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("John","Doe",10.0,22.0);
        Employee e2 = new Employee("Claire","Rex",30.0,25.0);
        Employee e3 = new Employee("Harvy","Spector",18.0,25.0);
        Employee e4 = new Employee("Mike","Ross",40.0,26.0);
        Employee e5 = new Employee("rachel","Greene",15.0,25.0);
        Employee e6 = new Employee("Claire","Doe",15.0,25.0);

        List<Employee> empList= new ArrayList<Employee>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
        empList.add(e4);
        empList.add(e5);
        empList.add(e6);


        Collections.sort(empList);
        System.out.println(empList);

        empList.sort((t1, t2) -> ((int)(t1.getAge()-t2.getAge())));
        System.out.println("\n"+empList);





    }
}