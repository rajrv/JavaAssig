sealed class Base permits Child1, Child2 {}

final class Child1 extends Base{}
sealed class Child2 extends Base permits GrandChild3{}

non-sealed class GrandChild3 extends Child2{}


public class Question12 extends GrandChild3{

    public static void main(String[] args) {

    }

}