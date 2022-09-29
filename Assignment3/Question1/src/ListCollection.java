import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListCollection {
    public static void main(String[] args)
    {
        List<Float> myList = new ArrayList<>();
        System.out.println("Enter 5 floating point number");
        Scanner S = new Scanner(System.in);
        for(int i=0;i<5;i++){
            myList.add(S.nextFloat());
        }
        S.close();

        Float sum= 0.0F;
        ListIterator<Float> itr = myList.listIterator();
        while(itr.hasNext())
        {
                sum+= itr.next();
        }
        System.out.println("Sum of 5 floating point number "+sum);
    }
}
