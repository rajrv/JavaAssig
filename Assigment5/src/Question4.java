import java.util.stream.IntStream;

public class Question4 {

    public static void main(String args[]) {

        IntStream.iterate(1, i -> i<5, i -> i+1).forEach(System.out::println);
    }
}
