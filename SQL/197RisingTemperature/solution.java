# Write your MySQL query statement below
select a.id as Id
from weather a, weather b
where to_days(a.date) - to_days(b.date) = 1 and
      a.temperature > b.temperature