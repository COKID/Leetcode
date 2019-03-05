--
-- @lc app=leetcode.cn id=182 lang=mysql
--
-- [182] 查找重复的电子邮箱
--
-- https://leetcode-cn.com/problems/duplicate-emails/description/
--
-- database
-- Easy (70.71%)
-- Total Accepted:    17.5K
-- Total Submissions: 24.4K
-- Testcase Example:  '{"headers": {"Person": ["Id", "Email"]}, "rows": {"Person": [[1, "a@b.com"], [2, "c@d.com"], [3, "a@b.com"]]}}'
--
-- 编写一个 SQL 查询，查找 Person 表中所有重复的电子邮箱。
-- 
-- 示例：
-- 
-- +----+---------+
-- | Id | Email   |
-- +----+---------+
-- | 1  | a@b.com |
-- | 2  | c@d.com |
-- | 3  | a@b.com |
-- +----+---------+
-- 
-- 
-- 根据以上输入，你的查询应返回以下结果：
-- 
-- +---------+
-- | Email   |
-- +---------+
-- | a@b.com |
-- +---------+
-- 
-- 
-- 说明：所有电子邮箱都是小写字母。
-- 
--
# Write your MySQL query statement below

select Email AS Email
from Person
group by Email
having count(Email)>=2
