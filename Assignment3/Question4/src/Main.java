import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Employee,Double> es =new HashMap<Employee,Double>();

        Employee e1 = new Employee("ABC",24,"Software Engineer",16.0);
        Employee e2 = new Employee("RPX",25,"SDE1",28.0);
        Employee e3 = new Employee("QWERTY",21,"Content Creator",12.0);
        Employee e4 = new Employee("XYZ",30,"Program Manager",50.0);
        Employee e5 = new Employee("XYZ",30,"Program Manager",50.0);
        Employee e6 = new Employee("XYZ",30,"Program Manager",50.0);

       es.put(e1, e1.getSalary());
       es.put(e2, e2.getSalary());
       es.put(e3, e3.getSalary());
       es.put(e4, e4.getSalary());
        es.put(e5,e5.getSalary());
        es.put(e6,e6.getSalary());



        System.out.println(es);
        for (Map.Entry<Employee,Double> entry : es.entrySet())
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    }
}