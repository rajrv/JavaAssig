package Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        System.out.println("Part 1 answer");

        System.out.println(Arrays.asList(1, 2, 3, 4, 5, 6,7,8,9,10).stream()
                        .filter(e -> e%2==0)
                        .collect(Collectors.toList()));
//                .forEach(System.out::println);
        System.out.println("---------------------");


        Employee e1 = new Employee("Adam B C",6000L,"Noida");
        Employee e2 = new Employee("Ajay E F",4000L,"Delhi");
        Employee e3 = new Employee("Kamal I J",30000L,"Gurgaon");
        Employee e4 = new Employee("Karan L M",2000L,"Delhi");
        Employee e5 = new Employee("Ajay Z M",3400L,"Delhi");
        Employee e6 = new Employee("Kunal I J",300000L,"Gurgaon");
        Employee e7 = new Employee("Fred L M",4900L,"Delhi");

        List<Employee> employeeList =  new ArrayList<>();

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);
        employeeList.add(e7);



        employeeList
                .stream()
                .filter(employee -> employee.getSalary() < 5000L && employee.getCity().equals("Delhi"))
                .map(Employee::getFirstName)
                .distinct()
                .forEach(System.out::println);



    }


}
