package training.javastream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {
    
    @Test
    void testCreateStreamBuilder()
    {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Ravi");
        builder.add("Mukti")
                .add("Hartadi");
        
        Stream<String> stream = builder.build();
        stream.forEach(System.out::println);
    }

    @Test
    void testCreateBuilderSimplify()
    {
        Stream<Object> build = Stream.builder()
                                        .add("Ravi")
                                        .add("Mukti")
                                        .add("Hartadi")
                                        .build();

        build.forEach(System.out::println);
    }

    
}
