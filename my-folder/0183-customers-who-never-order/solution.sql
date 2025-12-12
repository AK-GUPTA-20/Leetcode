# Write your MySQL query statement below
Select c.name as Customers from Customers as c
left join Orders as o On
c.id = o.customerId where o.customerId is Null  
