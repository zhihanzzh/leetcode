# Write your MySQL query statement below
select score, (select count(distinct (score)) from scores where score >= s.score) rank
from scores s
order by score desc