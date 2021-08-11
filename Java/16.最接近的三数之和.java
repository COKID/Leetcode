/*
 * @lc app=leetcode.cn id=16 lang=java
 *
 * [16] 最接近的三数之和
 */

// @lc code=start
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int result = 0;
        for(int i=0;i<nums.length-2;i++){
            if(i!=0&&nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if (Math.abs(sum-target)<diff){
                    diff=Math.abs(sum-target);
                    result=sum;
                }
                if(sum==target){
                    return sum;
                }else if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return result;
    }
}
// @lc code=end

