/*Q5) Create a class named Employee with fields firstname,lastname,age and designation.
The class should:

    have all types of constructors to initialize the object
    class should also have setter methods to update a particular field
    Override its toString method to display a meaningful message using all these fields.
*/

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private String designation;

    //No argument constructor
    Employee(){
        System.out.println("Not Initialsed");
    }
    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String toString(){//overriding the toString() method
        return ("Detail of the Employee(Name,age,Designation): "+firstName+" "+lastName+" "+age+" "+designation);
    }

    //Parameterized constructor
    Employee(String firstName, String lastName, int age, String designation){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age = age;
        this.designation = designation;


    }
    public static void main(String[] args){
        Employee e1=new Employee();
        Employee e2=new Employee("Raj","Vaibhav",24,"Software Engineer");

        System.out.println(e2);
        e2.setFirstName("Abc");
        e2.setLastName("PQR");
        e2.setAge(23);
        e2.setDesignation("SE");
        System.out.println(e2);
    }
}
