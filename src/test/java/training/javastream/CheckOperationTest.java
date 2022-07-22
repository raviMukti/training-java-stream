package training.javastream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {
    

    @Test
    void testAnyMatch()
    {
        boolean anyMatch = List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .anyMatch(number -> number > 20);

        System.out.println(anyMatch);
    }

    @Test
    void testAllMatch()
    {
        boolean allMatch = List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .allMatch(number -> number > 0);
            
        System.out.println(allMatch);
    }

    @Test
    void testNoneMatch()
    {
        boolean noneMatch = List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .noneMatch(number -> number > 11);
            
        System.out.println(noneMatch);
    }

}
