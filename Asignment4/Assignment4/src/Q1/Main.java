package Q1;


public class Main {
    public static void main(String[] args) {
        GreaterThan greaterThan =  (int a,int b) -> a>b;
        System.out.println(greaterThan.Greater(5,2));

        Increment increment = (a) -> a+1;
        System.out.println(increment.incrementNum(5));

        ConcatenationString concatenationString = (s1, s2) ->  s1 + s2;
        System.out.println(concatenationString.concatenate("Hello","World"));

        UpperCaseString upperCaseString = (s) -> s.toUpperCase();
        System.out.println(upperCaseString.upper("helloo"));


    }
}
