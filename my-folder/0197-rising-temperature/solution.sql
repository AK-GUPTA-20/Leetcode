# Write your MySQL query statement below
SELECT w1.id
FROM Weather W1
LEFT JOIN Weather W2
ON DATE(W1.recordDate) = DATE(W2.recordDate) + INTERVAL 1 DAY where w1.temperature > w2.temperature ;

