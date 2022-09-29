import java.util.Objects;

public class Employee {
    private String name;
    private int age;

//      @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Employee employee)) return false;
//        return getAge() == employee.getAge() && Objects.equals(getName(), employee.getName()) && Objects.equals(getDesignation(), employee.getDesignation()) && Objects.equals(getSalary(), employee.getSalary());
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getDesignation(), getSalary());
    }

    private String designation;

    private Double salary;

    Employee(String name, int age, String designation, Double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;

    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getDesignation() {

        return designation;
    }

    public Double getSalary() {

        return salary;
    }


}


