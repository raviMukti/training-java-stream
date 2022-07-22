package training.javastream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class StreamPipeLineTest {
    
    @Test
    void testCreateWithOutStreamPipeline()
    {
        // Oldways
        List<String> list = List.of("Ravi", "Mukti", "Hartadi");
        Stream<String> stream = list.stream();
        Stream<String> streamUpper = stream.map(name -> name.toUpperCase());
        Stream<String> streamMr = streamUpper.map(upper -> "Mr. " + upper);
        streamMr.forEach(System.out::println);        
    }


    @Test
    void testCreateWithStreamPipeline()
    {
        List<String> list = List.of("Ravi", "Mukti", "Hartadi");
        // Stream Pipeline
        list.stream()
            .map(name -> name.toUpperCase()) // Operation 1
            .map(upper -> "Mr. " + upper) // Operation 2
            .forEach(System.out::println); // Termination
    }

}
