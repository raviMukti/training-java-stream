package training.javastream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class LazyEvaluationTest {
    
    @Test
    void testIntermediateOperation()
    {
        List<String> name = List.of("Ravi", "Mukti", "Hartadi");
        Stream<String> upper = name.stream()
                                    .map(n -> {
                                        System.out.println("Changes " + n + " To UpperCase");
                                        return n.toUpperCase();
                                    }); // Because map return a stream, so it is lazy evaluation
    }

    @Test
    void testTerminalOperation()
    {
        List<String> name = List.of("Ravi", "Mukti", "Hartadi");
        name.stream()
                .map(n -> {
                    System.out.println("Changes " + n + " To UpperCase");
                    return n.toUpperCase();
                })
                .forEach(upper  -> {
                    System.out.println(upper);
                }); // It will trigger a stream to run
    }

}
