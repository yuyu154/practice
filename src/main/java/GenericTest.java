import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class GenericTest {
    public <T> List<T> firstThree(List<T> list) {
        return list.stream()
                .limit(3L)
                .collect(toList());

    }

    public <T extends String> List<T> first(List<T> list) {
        return list.stream()
                .limit(1)
                .collect(Collectors.toList());
    }
}
