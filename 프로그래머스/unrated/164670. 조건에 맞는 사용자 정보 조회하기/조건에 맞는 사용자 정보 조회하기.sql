-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, CONCAT(CITY, ' ', STREET_ADDRESS1, ' ', STREET_ADDRESS2) AS 전체주소, 
   CONCAT(SUBSTRING(TLNO, 1, 3), '-',
    SUBSTRING(TLNO, 4, 4), '-',
    SUBSTRING(TLNO, 8, 4)) AS 전화번호
FROM USED_GOODS_BOARD A
LEFT JOIN USED_GOODS_USER B
ON USER_ID = WRITER_ID
GROUP BY WRITER_ID
HAVING COUNT(WRITER_ID) > 2
ORDER BY USER_ID DESC;
