public class Main {
    public static void main(String[] args) {

        SpecialStackk ob = new SpecialStackk();
        ob.push(90);
        ob.push(52);
        System.out.println("Min element in stack "+ ob.getMin());
        ob.push(63);
        ob.push(64);
        ob.push(29);
        ob.push(90);
        ob.push(91);

        System.out.println("Minimum element im stack "+ob.getMin());
        ob.pop();
        ob.pop();
        ob.pop();
        System.out.println("Minimum element im stack "+ob.getMin());
    }
}