package training.javastream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationTest {
    
    @Test
    void testMapOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .map(name -> name.toUpperCase()) // String
            .map(upper -> upper.length()) // To Integer
            .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMapOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .map(name -> name.toUpperCase())
            .flatMap(upper -> Stream.of(upper, upper.length()))
            .forEach(length -> System.out.println(length));
    }

}
