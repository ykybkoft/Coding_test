-- 코드를 입력하세요
SELECT board_id, writer_id, title, price, 
CASE 
WHEN status = 'RESERVED'
THEN '예약중'
WHEN status = 'SALE'
THEN '판매중'
ELSE '거래완료'
END
status
from used_goods_board
where created_date = '2022-10-5'
order by board_id desc;