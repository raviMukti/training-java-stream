package training.javastream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetrievingOperationTest {
    
    @Test
    void testLimitOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .limit(1)
            .forEach(System.out::println);
    }

    @Test
    void testSkipOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .skip(2)
            .forEach(System.out::println);
    }

    @Test
    void testTakeWhileOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi", "Engineer").stream()
            .takeWhile(name -> name.length() <= 4) // After meet false condition, then it loops will end
            .forEach(System.out::println);
    }


    @Test
    void testDropWhileOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi", "Engineer", "Best").stream()
            .dropWhile(name -> name.length() <= 4) // After meet false condition, then it will take all of end
            .forEach(System.out::println);
    }

    @Test
    void testSingleRetrieveFindAny()
    {
        Optional<String> optional = List.of("Ravi", "Mukti", "Hartadi", "Engineer", "Best").stream()
            .findAny();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    void testSingleRetrieveFindFirst()
    {
        Optional<String> optional = List.of("Mukti", "Ravi", "Hartadi", "Engineer", "Best").stream()
            .findFirst();

        optional.ifPresent(name -> {
            System.out.println(name);
        });
    }


}
