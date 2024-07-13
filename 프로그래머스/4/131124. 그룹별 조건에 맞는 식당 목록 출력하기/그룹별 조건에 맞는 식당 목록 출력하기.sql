SELECT
    MP.MEMBER_NAME
    ,RR.REVIEW_TEXT
    ,DATE_FORMAT(RR.REVIEW_DATE, '%Y-%m-%d') AS REVIEW_DATE
FROM
    MEMBER_PROFILE AS MP
JOIN
    REST_REVIEW AS RR
ON
    MP.MEMBER_ID = RR.MEMBER_ID
WHERE
    MP.MEMBER_ID = (
        SELECT
            MEMBER_ID
        FROM
            (
                SELECT
                    MEMBER_ID
                    ,COUNT(MEMBER_ID) AS REVIEW_COUNT
                FROM
                    REST_REVIEW
                GROUP BY
                    MEMBER_ID
                ORDER BY
                    REVIEW_COUNT DESC
                LIMIT 1
            ) AS RR2
    )
ORDER BY
    RR.REVIEW_DATE ASC
    ,RR.REVIEW_TEXT ASC