SELECT
    MONTH(START_DATE) AS MONTH
    ,CAR_ID
    ,COUNT(*) AS RECODES
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    MONTH(START_DATE) BETWEEN 8 AND 10 AND
    CAR_ID IN (
                SELECT 
                    CAR_ID 
                FROM 
                    CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                WHERE
                    MONTH(START_DATE) BETWEEN 8 AND 10
                GROUP BY 
                    CAR_ID 
                HAVING 
                    COUNT(*) >= 5
            )
GROUP BY
    MONTH, CAR_ID
ORDER BY
    MONTH ASC,
    CAR_ID DESC