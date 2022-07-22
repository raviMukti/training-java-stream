package training.javastream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamOperationTest {
    
    @Test
    void testStreamOperation()
    {
        List<String> names = List.of("Ravi", "Mukti", "Hartadi");
        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }

}
