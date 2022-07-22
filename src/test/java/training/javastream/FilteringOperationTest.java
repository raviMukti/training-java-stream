package training.javastream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationTest {
    
    @Test
    void testFilterOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .filter(name -> name.length() > 4) // It Will Filter
            .forEach(System.out::println);

        List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream()
            .filter(number -> number % 2 == 0) // It Will Filter
            .forEach(System.out::println);
    }

    @Test
    void testDistinctOperation()
    {
        List.of("Ravi", "Mukti", "Hartadi", "Ravi", "mukti", "hartadi").stream()
            .distinct() // It Will Filter And Remove Duplicate
            .forEach(System.out::println);
    }

}
