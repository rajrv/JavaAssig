import java.util.*;
import java.lang.*;
/*Q1) Write a class with FirstName, LastName & age field.
Print Firstname, LastName & age
using static block, static method & static variable respectively.*/
public class Person {
    static String FirstName;
    static String LastName;
    static int age =24;

    Person(){}
    Person(String LastName)
    {
        this.LastName =LastName;

    }
    //static block to print the FirstName
    static{
        FirstName="Raj";
        System.out.println(FirstName);
    }
    static void displayLastName()
    {
        System.out.println(LastName);
    }
    public static void main(String args[]){

       /* Person p1 = new Person("Vaibhav");//Creating object to invoke method

        p1.displayLastName(); // Printing LastName using static method

        System.out.println(Person.age);//Printing static variable
        System.out.println(LastName);*/
        System.out.println(LastName);


    }
}
