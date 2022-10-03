
//Use ifPresentOrElse, or, orElseThrow Operations with Optional
import java.util.stream.IntStream;

public class Question5 {

    public static void main(String[] args) {
        IntStream.rangeClosed(1,10).filter(e->e>5).findFirst().ifPresentOrElse(
                (e)-> System.out.println("The value "+e+" is present."),
                ()->System.out.println("No value fond!"));

        IntStream.rangeClosed(-10,10)
                .filter(e->e>8)
                .findFirst().orElseThrow();

    }
}

