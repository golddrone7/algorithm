-- 코드를 입력하세요
SELECT name, count(*)
from animal_ins
where name is not null
group by name 
having count(name) >= 2
order by 1;