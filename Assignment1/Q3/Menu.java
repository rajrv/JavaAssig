import java.util.*;
public class Menu {
    static double areaOfCirle(double r)
    {
        return(Math.PI * r * r );
    }
    static double circumferenceOfCircle(double r)
    {
        return(2 * Math.PI * r);
    }
    public static void main(String[] args){
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the radius of circle");
        double radius=S.nextDouble();
        System.out.println("Enter 1 to calculate Area of Circle \nEnter 2 to calculate circumference of circle\nEnter 3 to exit");
        int n = S.nextInt();
        S.close();
        switch (n){
            case 1:
                System.out.println("Area of circle of radius "+radius+" is: "+Menu.areaOfCirle(radius));
                break;
            case 2:
                System.out.println("Circumference of circle having radius "+radius+" is: "+Menu.circumferenceOfCircle(radius));
                break;
            case 3:
                return;
            default:
                System.out.println("Invalid Input!");
                break;
        }

    }
}
