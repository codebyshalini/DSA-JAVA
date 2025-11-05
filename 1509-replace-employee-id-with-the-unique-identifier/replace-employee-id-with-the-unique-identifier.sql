# Write your MySQL query statement below
select un.unique_id,e.name from employees e
left join
employeeuni un 
on 
e.id = un.id; 


