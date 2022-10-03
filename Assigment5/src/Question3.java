//Use rangeClosed to create a  Stream
import java.util.stream.IntStream;
public class Question3 {

        public static void main(String[] args)
        {
            IntStream stream1 = IntStream.rangeClosed(25, 30);
            IntStream stream2 = IntStream.range(25,30);
            System.out.println("Demonstrating range:");
            stream2.forEach(System.out::println);
            System.out.println("Demonstrating rangeClosed:");
            stream1.forEach(System.out::println);
        }

}
