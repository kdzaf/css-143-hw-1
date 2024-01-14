import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Problem3 {

    // Do not change signature (function name, parameters, return type)
    public static long SumOfNonUnique(int[] data) {

        Set<Integer> uniqueElements = new HashSet<>();
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        long sum = 0;

        for (int num : data) {
            if (!uniqueElements.add(num)) {
                // If the element is already in the set, it is non-unique
                frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
            }
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                sum += entry.getKey() * entry.getValue();
            }
        }

        return (sum == 0) ? -1 : sum;
    }

    }
    /*
    One possible improvement is to use a HashSet to keep track of unique elements as we iterate through the array.
    This can help improve the time complexity by avoiding unnecessary iterations. I implemented the change that I talked
    about into my code.
     */
