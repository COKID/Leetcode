# @before-stub-for-debug-begin
# @before-stub-for-debug-end

#
# @lc app=leetcode.cn id=59 lang=python3
#
# [59] 螺旋矩阵 II
#

# @lc code=start
class Solution:
    def generateMatrix(self, n: int) -> List[List[int]]:
        left,right=0,n-1

        top,bottom=0,n-1
        A = [[0] * n for _ in range(n)]

        cnt=0

        while left<=right and top<=bottom:
            for x in range(left,right+1) :
                cnt+=1
                A[top][x]=cnt

            for x in range(top+1,bottom+1):
                cnt+=1
                A[x][right]=cnt

            for x in range(right-1,left,-1):
                cnt+=1 
                A[bottom][x]=cnt

            for x in range(bottom,top,-1):
                cnt+=1
                A[x][left]=cnt
            
            top+=1
            left+=1
            right-=1
            bottom-=1 
        
        return A
# @lc code=end

