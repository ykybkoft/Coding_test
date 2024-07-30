-- 코드를 작성해주세
select round(avg(ifnull(length,10)),2) as AVERAGE_LENGTH
from fish_info 