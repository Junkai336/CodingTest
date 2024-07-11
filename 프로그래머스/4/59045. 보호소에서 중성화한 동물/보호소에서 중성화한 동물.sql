SELECT
    AO.ANIMAL_ID
    ,AO.ANIMAL_TYPE
    ,AO.NAME
FROM
    ANIMAL_OUTS AS AO
INNER JOIN
    ANIMAL_INS AS AI
ON
    AO.ANIMAL_ID = AI.ANIMAL_ID AND
    AI.SEX_UPON_INTAKE LIKE 'INTACT%' 
WHERE
    AO.SEX_UPON_OUTCOME NOT LIKE 'INTACT%' 
ORDER BY
    AO.ANIMAL_ID ASC