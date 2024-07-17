WITH TWO_GERNERATION AS (
    SELECT
        TWO.ID
    FROM
        ECOLI_DATA AS TWO
    WHERE
        TWO.PARENT_ID IN (
            SELECT
                ONE.ID
            FROM
                ECOLI_DATA AS ONE
            WHERE
                PARENT_ID IS NULL
        )
)

SELECT
    THREE.ID
FROM
    ECOLI_DATA AS THREE
JOIN
    TWO_GERNERATION
ON
    THREE.PARENT_ID = TWO_GERNERATION.ID