/*
 * @lc app=leetcode.cn id=33 lang=java
 *
 * [33] 搜索旋转排序数组
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
//        if(nums.length==1){
//            if (target==nums[0])return 0;
//            return -1;
//        }

        int i=0;
        if(target>=nums[0]){
            for(i=0;i<nums.length-1&&nums[i]<nums[i+1];i++){
                if(nums[i]==target)return i;
            }
        }else{
            for(i=nums.length-1;i>0&&nums[i]>nums[i-1];i--){
                if(nums[i]==target)return i;
            }

        }
        if(nums[i]==target)return i;
        return -1;
    }
}
// @lc code=end

