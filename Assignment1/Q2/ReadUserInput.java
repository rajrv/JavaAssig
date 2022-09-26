import java.util.ArrayList;
import java.util.Scanner;

public class ReadUserInput {
    public static void main(String args[])
    {
        ArrayList<String> inputs = new ArrayList<String>();
        Scanner S = new Scanner(System.in);
        String text="";
        while(true){
            text=S.nextLine();
            if(text.equals("XDONE"))
                break;
            inputs.add(text);
        }
        S.close();
        for(String txt:inputs)
            System.out.println(txt);
    }
}
