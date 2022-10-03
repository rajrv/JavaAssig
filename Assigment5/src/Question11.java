//use record to create an immutable represent of student(name, id, age) and use its  constructor for initialization, equals to compare 2 students methods. Also keep a static counter to keep the count of objects created.
import java.util.Objects;

record Student(String name, Integer id, Integer age){

    static int counter =0;
    static void incrementCounter()
    {
        counter++;
    }
    Student{
        Objects.requireNonNull(id);
        incrementCounter();
    }

}
public class Question11{
    public static void main(String args[]){
        Student s1 = new Student("ABC",1,20);
        Student s2 = new Student("ABC",1,20);
        Student s3 = new Student("PQR",2,22);
        System.out.println("Details of s1: "+s1);
        System.out.println("Details of s2: "+s2);
        System.out.println("Details of s3: "+s3);
        System.out.println("Is s1 equals s2: "+s1.equals(s2));
        System.out.println("Number of students objects created "+Student.counter);

    }
}