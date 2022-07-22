package training.javastream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {
    
    @Test
    void testSortedOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .sorted() // Ascending
            .forEach(System.out::println);
    }

    @Test
    void testSortedCustomComparatorOperation()
    {
        Comparator<String> reverseComparator = Comparator.reverseOrder();

        List.of("Ravi", "Mukti", "Hartadi").stream()
            .sorted(reverseComparator) // Descending
            .forEach(System.out::println);
    }


}
