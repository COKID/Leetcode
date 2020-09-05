/*
 * @lc app=leetcode.cn id=1 lang=golang
 *
 * [1] 两数之和
 */

// @lc code=start
package Golang
// import (
// 	"fmt"
// )

func TwoSum(nums []int, target int) []int {
	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i]+nums[j] == target {
				return []int{i, j}
			}
		}
	}
	return []int{}
}
// func main()  {
// 	a:=[]int{2,7,11,15}
// 	fmt.Println(twoSum(a,9))
// }
// @lc code=end
