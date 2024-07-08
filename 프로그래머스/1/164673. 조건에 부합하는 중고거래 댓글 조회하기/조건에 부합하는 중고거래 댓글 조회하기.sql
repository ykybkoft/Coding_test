-- 코드를 입력하세요
SELECT A.title, A.board_id, B.reply_id, B.writer_id, B.contents,date_format(B.created_date, '%Y-%m-%d') as created_date
from used_goods_board as A, used_goods_reply as B
where (A.created_date between '2022-10-01' and '2022-10-31') and A.board_id = B.board_id
order by B.created_date , A.title;
