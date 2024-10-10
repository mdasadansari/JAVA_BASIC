import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 99;
        Solution solution = new Solution();
        int[] twoSum = solution.twoSum(nums, target);
//        if (Arrays.equals(twoSum, new int[]{0, 0})) {
        if (Arrays.equals(twoSum, new int[]{})) {
            System.out.println("no match");
        } else {
            System.out.println(Arrays.toString(twoSum));
        }
    }
}

/*class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j != i; j++) {
                if (target == nums[i] + nums[j]) {
                    result = new int[]{j, i};
                    break;
                }
            }
        }
        return result;
    }
}*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
}
