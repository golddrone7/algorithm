-- 코드를 입력하세요
SELECT A.ANIMAL_ID, B.NAME
FROM ANIMAL_INS A
LEFT JOIN ANIMAL_OUTS B
USING (ANIMAL_ID)
WHERE A.DATETIME > B.DATETIME
ORDER BY A.DATETIME
;