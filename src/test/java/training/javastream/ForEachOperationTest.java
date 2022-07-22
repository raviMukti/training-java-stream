package training.javastream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperationTest {
    
    @Test
    void testPeek()
    {
        List.of("Ravi", "Mukti", "Hartadi").stream()
            .peek(name -> System.out.println("Before Change Name To Upper : " + name))
            .map(name -> name.toUpperCase())
            .peek(name -> System.out.println("After Change Name To Upper : " + name))
            .forEach(finalName -> System.out.println("Final Name : " + finalName));
    }


}
