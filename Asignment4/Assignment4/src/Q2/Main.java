package Q2;

@FunctionalInterface
interface MyReferenceInterface{

    public int operation(int num1,int num2);
}

public class Main {
    public static void main(String[] args) {

        MyReferenceInterface myReferenceInterface = MethodReference::multiply;
        System.out.println(myReferenceInterface.operation(2,9));

        myReferenceInterface = new MethodReference()::add;
        System.out.println(myReferenceInterface.operation(2,9));

        myReferenceInterface = new MethodReference()::subtract;
        System.out.println(myReferenceInterface.operation(15,5));

    }

}
