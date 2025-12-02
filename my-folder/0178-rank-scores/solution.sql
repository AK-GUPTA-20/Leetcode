# Write your MySQL query statement below
Select score , Dense_rank() over (order by score desc) as 
"Rank" from Scores;
