# Write your MySQL query statement below
SELECT MAX(salary) AS SecondHighestSalary
FROM employee
WHERE salary NOT IN (SELECT max(salary) FROM employee)
