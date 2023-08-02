# -- 코드를 입력하세요
# SELECT CAR_ID, CASE WHEN '2022-10-16' BETWEEN START_DATE AND END_DATE THEN '대여중'
#                      ELSE '대여 가능'
#                     END AS AVAILABILITY
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# ORDER BY CAR_ID DESC;

# SELECT * 
# FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
# GROUP BY CAR_ID
# ORDER BY CAR_ID DESC
# ;

SELECT CAR_ID, case
                when max('2022-10-16' between start_date and end_date) then '대여중'
                else '대여 가능'
                end as AVAILABILITY
from car_rental_company_rental_history
group by car_id
order by car_id desc;