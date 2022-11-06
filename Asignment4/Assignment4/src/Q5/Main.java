package Q5;

interface MyInterface1 {
    default void display() {
        System.out.println("Inside my MyInterface1");
    }
}

interface MyInterface2 {
    default void display() {
        System.out.println("Inside my MyInterface2");
    }
}
 class MyClass implements MyInterface1, MyInterface2 {
     public void display() {
        MyInterface1.super.display();
        MyInterface2.super.display();
        System.out.println("Inside My Class");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        obj.display();
    }
}
