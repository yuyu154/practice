import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class GenericTestTest {

    @Test
    public void testGeneric() {
        GenericTest genericTest = new GenericTest();
        List<Object> list = genericTest.firstThree(Arrays.asList(1, "2", 3));
    }

    @Test
    public void testGeneric2() {
        GenericTest genericTest = new GenericTest();
        List<String> list = genericTest.first(Arrays.asList("1", "2"));
    }

    @Test
    public void predicateTest() {
        Stream<String> stream = Stream.of("string", null, "is", null, "not null");
        Predicate<Object> notnull = (obj) -> obj != null;
        stream.filter(notnull)
                .forEach(System.out::print);
    }

    private GenericTest getGenericTest() {
        return new GenericTest();
    }
}