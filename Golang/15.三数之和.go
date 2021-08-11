/*
 * @lc app=leetcode.cn id=15 lang=golang
 *
 * [15] 三数之和
 */

// @lc code=start
import "sort"

func threeSum(nums []int) [][]int {
	sort.Ints(nums)
	var result [][]int
	for i:=0; i<len(nums); i++{
		if i != 0&&nums[i]==nums[i-1] {
			continue
		}
		var j,k = i+1,len(nums)-1
		for j<k{
			var sum=nums[i]+nums[j]+nums[k]
			if sum==0 {
				var temp =[]int{nums[i],nums[j],nums[k]}
				result = append(result,temp)
			}
			if sum <= 0 {
				j++
				for j<k&&nums[j]==nums[j-1]{
					j++
				}
			}
			if sum >= 0 {
				k--
				for j<k&&nums[k]==nums[k+1]{
					k--
				}
			}
		}

	}
	return result
}
// @lc code=end

