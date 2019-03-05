--
-- @lc app=leetcode.cn id=177 lang=mysql
--
-- [177] 第N高的薪水
--
-- https://leetcode-cn.com/problems/nth-highest-salary/description/
--
-- database
-- Medium (36.03%)
-- Total Accepted:    8.9K
-- Total Submissions: 24.3K
-- Testcase Example:  '{"headers": {"Employee": ["Id", "Salary"]}, "argument": 2, "rows": {"Employee": [[1, 100], [2, 200], [3, 300]]}}'
--
-- 编写一个 SQL 查询，获取 Employee 表中第 n 高的薪水（Salary）。
-- 
-- +----+--------+
-- | Id | Salary |
-- +----+--------+
-- | 1  | 100    |
-- | 2  | 200    |
-- | 3  | 300    |
-- +----+--------+
-- 
-- 
-- 例如上述 Employee 表，n = 2 时，应返回第二高的薪水 200。如果不存在第 n 高的薪水，那么查询应返回 null。
-- 
-- +------------------------+
-- | getNthHighestSalary(2) |
-- +------------------------+
-- | 200                    |
-- +------------------------+
-- 
-- 
--
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
      # Write your MySQL query statement below.
     select (
       IF(
         (select count(*) from (select distinct e.Salary from Employee e) e)>=N,
         (select min(e.Salary) from (select distinct e.Salary from Employee e order by e.Salary desc limit N) e),
         NULL
         )
       )
  );
END

