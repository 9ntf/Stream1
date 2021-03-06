import java.util.*;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = intList.stream()
                .filter(x -> x % 2 == 0).filter(x -> x > 0)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        result.stream().forEach(System.out::println);
    }
}
