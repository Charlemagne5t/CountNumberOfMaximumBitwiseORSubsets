import java.util.*;

class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int OR = 0;
        for (int x : nums) {
            OR |= x;
        }

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int x : nums) {
            Map<Integer, Integer> newMap = new HashMap<>(map);
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                int mask = e.getKey();
                int count = e.getValue();
                int newEntryMask = mask | x;
                int newCount = newMap.getOrDefault(newEntryMask, 0) + count;
                newMap.put(newEntryMask, newCount);
            }

            map = newMap;
        }

        return map.getOrDefault(OR, 0);

    }
}
