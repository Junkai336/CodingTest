SELECT
    ANIMAL_INS.ANIMAL_ID
    ,ANIMAL_INS.NAME
FROM
    ANIMAL_INS
JOIN
    ANIMAL_OUTS
ON
    ANIMAL_INS.ANIMAL_ID = ANIMAL_OUTS.ANIMAL_ID
ORDER BY
    DATEDIFF(ANIMAL_OUTS.DATETIME, ANIMAL_INS.DATETIME) DESC
LIMIT 2