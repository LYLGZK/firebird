import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> temp = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i<nums.length; i++){
            if (nums[i] > target){
                continue;
            }
            if (nums[i] == target){
                result[0] = -1;
                result[1] = i;
                return result;
            }
            if (temp.containsKey(target - nums[i])){
                result[0] = temp.get(target - nums[i]);
                result[1] = i;
                return result;
            }

            temp.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = solution.twoSum(new int[]{4,7,11,15,3,1,2},7);
        System.out.println(nums[0]);
        System.out.println(nums[1]);

    }
}
