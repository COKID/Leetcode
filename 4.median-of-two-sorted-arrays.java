/*
 * @lc app=leetcode.cn id=4 lang=java
 *
 * [4] 寻找两个有序数组的中位数
 *
 * https://leetcode-cn.com/problems/median-of-two-sorted-arrays/description/
 *
 * algorithms
 * Hard (32.77%)
 * Total Accepted:    33.4K
 * Total Submissions: 100.8K
 * Testcase Example:  '[1,3]\n[2]'
 *
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
 * 
 * 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
 * 
 * 你可以假设 nums1 和 nums2 不会同时为空。
 * 
 * 示例 1:
 * 
 * nums1 = [1, 3]
 * nums2 = [2]
 * 
 * 则中位数是 2.0
 * 
 * 
 * 示例 2:
 * 
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * 
 * 则中位数是 (2 + 3)/2 = 2.5
 * 
 * 
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[] array=new int[l1+l2];
        int flag,i,j;
        flag=i=j=0;
        while(i<l1&&j<l2){
            if(nums1[i]<nums2[j]){
                array[flag]=nums1[i];
                i++;
                flag++;
            }else{
                array[flag]=nums2[j];
                j++;
                flag++;
            }
        }
        if(i<l1){
            while(i<l1){
                array[flag]=nums1[i];
                i++;
                flag++;
            }
        }
        if(j<l2){
            while(j<l2){
                array[flag]=nums2[j];
                j++;
                flag++;
            }
        }
        int n=l1+l2;
        if((l1+l2)%2==0){//偶数
            return (array[n/2]+array[n/2-1])*1.0/2;
        }else{
            return array[n/2];
        }
    }
}
//可以根据数组长短优化算法
