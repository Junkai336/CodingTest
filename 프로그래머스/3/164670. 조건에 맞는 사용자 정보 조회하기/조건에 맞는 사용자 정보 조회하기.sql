SELECT
    US.USER_ID
    ,US.NICKNAME
    ,CONCAT(US.CITY, ' ', US.STREET_ADDRESS1, ' ', US.STREET_ADDRESS2) AS 전체주소
    ,CONCAT(
        LEFT(US.TLNO, 3), '-'
        ,MID(US.TLNO, 4, 4), '-'
        ,RIGHT(US.TLNO, 4)
    ) AS 전화번호
FROM
    USED_GOODS_BOARD AS UB
JOIN
    USED_GOODS_USER AS US
ON
    UB.WRITER_ID = US.USER_ID
WHERE
    USER_ID IN
    (
        SELECT 
            WRITER_ID
        FROM 
            USED_GOODS_BOARD
        GROUP BY
            WRITER_ID
        HAVING
            COUNT(BOARD_ID) >= 3
    )
GROUP BY
    US.USER_ID
ORDER BY
    US.USER_ID DESC