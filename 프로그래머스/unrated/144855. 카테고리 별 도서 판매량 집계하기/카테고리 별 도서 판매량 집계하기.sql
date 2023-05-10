-- 코드를 입력하세요
SELECT category CATEGORY, sum(sales) TOTAL_SALES
from book
left join book_sales using(book_id)
where to_char(sales_date, 'yyyy-mm-dd') like ('2022-01%')
group by category
order by 1