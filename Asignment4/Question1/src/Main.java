import java.util.Scanner;

interface GreaterBetweenTwo
{
    boolean greaterValue(int a,int b);
}
interface Increment{
    int incrementByOne(int value);
}
interface ToUpperCase{
    String toUpperCase(String a);
}

interface Concatenate{
    String concantenateTwoString(String a,String b);
}
public abstract class Main implements GreaterBetweenTwo
{
    public static void main(String[] args)
    {
            GreaterBetweenTwo comparision = (a,b)->{return a>b?true:false;};
            Scanner S = new Scanner(System.in);
            System.out.println("Enter two numbers to check which one is greater");

            int a=S.nextInt();
            int b=S.nextInt();

            System.out.println("Is "+a+" greater than " +b+": "+comparision.greaterValue(a,b));

            Increment increase = (c)-> {return (c+1);};
            System.out.println("Enter an Integer to increment its value by one");
            int c = S.nextInt();
            System.out.println("Increasing value by one "+increase.incrementByOne(c));

            Concatenate concatenate = (s1,s2)->{return(s1+s2);};
            System.out.println("Enter two Strings");
            String s1 = S.next();
            String s2 = S.next();
            System.out.println("Concatenation of two Strings "+concatenate.concantenateTwoString(s1,s2));


            ToUpperCase upperCase = (s3)->{return(s3.toUpperCase());};
            System.out.println("Enter a string to make it upper Case");
            String s3 = S.nextLine();
            S.close();
            System.out.println("Upper case of "+s3+" "+upperCase.toUpperCase(s3));


    }


}