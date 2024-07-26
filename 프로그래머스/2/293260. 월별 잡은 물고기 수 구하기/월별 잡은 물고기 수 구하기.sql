-- 코드를 작성해주세요

select count(*) as fish_count ,month(time) as 'MONTH'
from fish_info
where month(time) is not null
group by month(time)
order by MONTH
