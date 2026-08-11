# Write your MySQL query statement below
select t.name as `Customers` from 
Customers t
left join Orders o
on t.id = o.customerId
where o.id is null;
