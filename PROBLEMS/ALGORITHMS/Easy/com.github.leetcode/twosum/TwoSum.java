package twosum;


import java.util.HashMap;
import java.util.Map;

class TwoSum  {
    public int[] twoSum(int[] nums, int target) {
        // for index mapping
        Map<Integer, Integer> numToIndex = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            // Calculate what number is needed
            int otherNum = target - nums[i];

            if (numToIndex.containsKey(otherNum)) {
                // Found the pair! Return indices
                return new int[]{numToIndex.get(otherNum), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
