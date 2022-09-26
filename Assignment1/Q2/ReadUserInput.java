/*Q2) Write a program to read user input until user writes XDONE
and then show the entered text by the user on commandline*/
import java.util.ArrayList;
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String args[])
    {
        ArrayList<String> inputs = new ArrayList<String>();//Array list to store inputs
        Scanner S = new Scanner(System.in);
        String text="";

        //loop to add inputs to arrayList from user until XDONE condition is met
        while(true){
            text=S.nextLine();
            if(text.equals("XDONE"))
                break;
            inputs.add(text);
        }
        S.close();//closing scanner class
        for(String txt:inputs)
            System.out.println(txt);
    }
}
