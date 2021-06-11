import java.util.*;

public class Main{
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (Integer input : intList) {
            if (input % 2 == 0 && input > 0) {
                result.add(input);
            }
        }
        Collections.sort(result);
        for (Integer input : result) {
            System.out.println(input);
        }
    }
}
