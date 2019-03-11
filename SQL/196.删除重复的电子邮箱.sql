--
-- @lc app=leetcode.cn id=196 lang=mysql
--
-- [196] 删除重复的电子邮箱
--
-- https://leetcode-cn.com/problems/delete-duplicate-emails/description/
--
-- database
-- Easy (47.04%)
-- Total Accepted:    8.8K
-- Total Submissions: 18.2K
-- Testcase Example:  '{"headers": {"Person": ["Id", "Email"]}, "rows": {"Person": [[1, "john@example.com"], [2, "bob@example.com"], [3, "john@example.com"]]}}'
--
-- 编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。
-- 
-- +----+------------------+
-- | Id | Email            |
-- +----+------------------+
-- | 1  | john@example.com |
-- | 2  | bob@example.com  |
-- | 3  | john@example.com |
-- +----+------------------+
-- Id 是这个表的主键。
-- 
-- 
-- 例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:
-- 
-- +----+------------------+
-- | Id | Email            |
-- +----+------------------+
-- | 1  | john@example.com |
-- | 2  | bob@example.com  |
-- +----+------------------+
-- 
-- 
--
# Write your MySQL query statement below

delete from Person where 
Email in 
(
    select tmp.Email from 
        (
            select Email
            from Person
            group by Email having count(Email) > 1
        ) as tmp
) 
and # 重复的ID保留最小值 
Id not in 
(
    select tmp.Id from
    (
        select min(Id) as Id 
        from Person 
        group by Email having count(Id) > 1
    ) as tmp
);
