/*
 * @lc app=leetcode.cn id=15 lang=java
 *
 * [15] 三数之和
 *
 * https://leetcode-cn.com/problems/3sum/description/
 *
 * algorithms
 * Medium (19.46%)
 * Total Accepted:    39K
 * Total Submissions: 184.1K
 * Testcase Example:  '[-1,0,1,2,-1,-4]'
 *
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0
 * ？找出所有满足条件且不重复的三元组。
 * 
 * 注意：答案中不可以包含重复的三元组。
 * 
 * 例如, 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 
 * 满足要求的三元组集合为：
 * [
 * ⁠ [-1, 0, 1],
 * ⁠ [-1, -1, 2]
 * ]
 * 
 * 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {//Not understand
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        // nums 数组排序后，要满足 sum == 0，必定有 nums[i] <= 0
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            // 跳过相同值
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            // 检索 [i + 1, nums.length) 区间，查找包含第 i 位元素且 sum 为 0 的所有组合
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                // sum 偏小或为 0，均需调整左边的指针（跳过相同值）
                if (sum <= 0) do j++; while (j < k && nums[j] == nums[j - 1]);
                // sum 偏大或为 0，均需调整右边的指针（跳过相同值）
                if (sum >= 0) do k--; while (j < k && nums[k] == nums[k + 1]);
            }
        }

        return result;
    }
}

