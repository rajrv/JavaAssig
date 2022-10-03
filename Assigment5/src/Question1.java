import java.awt.geom.Area;
//Demonstrate the use of private methods in interfaces
interface ShapeArea{

    private static double square(double length,double breadth){
        return length*breadth;
    }

    static double areaCircle(double r){
        return Math.PI*square(r,r);
    }

    static double areaRectangle(double l,double b){
        return square(l,b);
    }
    static double areaTriangle(double base,double height){
        return (0.5 * square(base,height));
    }
    static  double areaTrapezium(double base1,double base2,double height){
        return(0.5 *square((base1+base2),height));
    }


}
public class Question1 implements ShapeArea{
    public static void main(String[] args) {
        System.out.println("Area of rectangle: "+ShapeArea.areaRectangle(2.5,8));
        System.out.println("Area of circle: "+ShapeArea.areaCircle(5.5));
        System.out.println("Area of Trapezium: "+ShapeArea.areaTrapezium(10,8,2));
        System.out.println("Area of Triangle: "+ShapeArea.areaTriangle(9.5,4));

    }

}
