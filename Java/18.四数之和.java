import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * @lc app=leetcode.cn id=18 lang=java
 *
 * [18] 四数之和
 */

// @lc code=start
class Solution {
    
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-3; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int[] numsSub=Arrays.copyOfRange(nums, i+1, nums.length);
            threeSum(numsSub, target-nums[i], nums[i]);
        }
        return result;
    }
    public void threeSum(int[] nums, int target, int numi) {
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == target) result.add(Arrays.asList(numi, nums[i], nums[j], nums[k]));
                if (sum <= target) do j++; while (j < k && nums[j] == nums[j - 1]);
                if (sum >= target) do k--; while (j < k && nums[k] == nums[k + 1]);
            }
        }
    }
}
// @lc code=end

