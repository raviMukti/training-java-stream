package training.javastream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {
    
    @Test
    void testCreateEmptyOrSingleStream()
    {
        Stream<String> emptyStream = Stream.empty();
        emptyStream.forEach(v -> {
            System.out.println(v);
        });

        Stream<String> singleStream = Stream.of("Ravi");
        singleStream.forEach(v -> {
            System.out.println(v);
        });

        Stream<String> emptyOrNotStream = Stream.ofNullable(null);
        emptyOrNotStream.forEach(v -> {
            System.out.println(v);
        });
    }

    @Test
    void testCreateStreamFromArray()
    {
        Stream<String> arrayStream = Stream.of("Ravi", "Mukti", "Hartadi");
        arrayStream.forEach(System.out::println);

        Stream<Integer> arrayIntStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        arrayIntStream.forEach(System.out::println);

        Stream<String> arrayFromString = Arrays.stream(new String[]{"Ravi", "Mukti", "Hartadi"});
        arrayFromString.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection()
    {
        Collection<String> collection = List.of("Ravi", "Mukti", "Hartadi");
        Stream<String> stringStream = collection.stream();
        stringStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream()
    {
        Stream<String> stream = Stream.generate(() -> "Ravi");
        // stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // iterate.forEach(System.out::println);
    }


}
