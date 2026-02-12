package patterns.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = {3, 3, 3, 1, 2, 1, 1, 2, 3, 3, 4};
        System.out.println(optimized(fruits));
    }

    public static int optimized(int[] fruits) {
        int maxFruits = 0;
        Map<Integer, Integer> buckets = new HashMap<>();

        int low = 0;
        int high = 0;

        while (high < fruits.length) {
            buckets.put(fruits[high], buckets.getOrDefault(fruits[high], 0) + 1);

            while (buckets.size() > 2) {
                buckets.put(fruits[low], buckets.get(fruits[low]) - 1);

                if (buckets.get(fruits[low]) == 0) buckets.remove(fruits[low]);

                low++;
            }

            maxFruits = Math.max(maxFruits, high - low + 1);
            high++;
        }

        return maxFruits;
    }
}
