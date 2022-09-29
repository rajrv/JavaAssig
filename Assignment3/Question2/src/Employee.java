class Employee implements Comparable<Employee>{
    private Double age;
    private Double salary;
    private String firstName;
    private String lastName;
    Employee(String firstName, String lastName, Double salary, Double age)
    {
        this.age=age;
        this.firstName=firstName;
        this.lastName = lastName;
        this.salary=salary;
    }

    public Double getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }


    @Override
    public int compareTo(Employee employee)
    {
        if(this.firstName.equalsIgnoreCase(employee.getFirstName()))
            return (this.lastName.compareToIgnoreCase(employee.getLastName()));

        return (this.firstName.compareToIgnoreCase(employee.getFirstName()));
    }

    public String toString(){
        return("First Name: "+firstName+" |Last Name: "+lastName+" |Salary: "+salary+" |Age: "+age+"\n");
    }
}
