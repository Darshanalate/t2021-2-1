import java.util.*;
public class MultipleCount {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30);
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};
      
        Map<Integer, Integer> result = new HashMap<>();
        for (int multiple : multiples) {
            int count = 0;
            for (int num : numbers) {
                if (num % multiple == 0) {
                    count++;
                }
            }
            result.put(multiple, count);
        }

        System.out.println(result);
    }
}
