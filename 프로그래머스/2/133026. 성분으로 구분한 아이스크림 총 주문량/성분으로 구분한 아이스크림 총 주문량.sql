-- 코드를 입력하세요
SELECT B.ingredient_type,sum(A.total_order) as TOTAL_ORDER
from first_half as A 
inner join icecream_info as B
on A.flavor = B.flavor
group by B.ingredient_type 
order by TOTAL_ORDER asc