select d.name as Department , e1.name as Employee , e1.salary as Salary 
from Department d, Employee e1
where (select count(distinct(e2.salary))
                    from Employee e2
                    where e2.salary > e1.salary
                    and e2.DepartmentId = e1.DepartmentId) < 3
and
e1.DepartmentId = d.id
order by e1.DepartmentId, e1.salary desc
                    
                    