import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> array = new HashMap<>();
        for (int num : arr) {
            array.put(num, array.getOrDefault(num, 0) + 1);
        }
        List<Integer> values = new ArrayList<>(array.values());
        Collections.sort(values);
        int c = 0;
        for (int i = 0; i < values.size(); i++) {
            if (k > values.get(i)) {
                k -= values.get(i);
                values.set(i, 0);
            } else {
                values.set(i, values.get(i) - k);
                k = 0;
            }
            if (values.get(i) != 0) {
                c++;
            }
        }
        return c;
    }
}
