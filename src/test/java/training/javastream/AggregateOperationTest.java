package training.javastream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AggregateOperationTest {
    

    @Test
    void testMaxOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .max(Comparator.naturalOrder())
            .ifPresent(System.out::println);
    }

    @Test
    void testMinOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .min(Comparator.naturalOrder())
            .ifPresent(System.out::println);
    }

    @Test
    void testCountOperation()
    {
        long l = List.of("Ravi", "Mukti", "Hartadi").stream()
            .count();
        System.out.println(l);
    }

    @Test
    void testReduceOperation()
    {
        int sumOfList = List.of(1,2,3,4,5).stream()
            .reduce(0, (value, item) -> value + item);

        System.out.println(sumOfList);
    }


}
