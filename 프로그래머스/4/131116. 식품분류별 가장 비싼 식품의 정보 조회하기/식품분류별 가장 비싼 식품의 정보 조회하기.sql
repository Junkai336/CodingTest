SELECT
    CATEGORY
    ,PRICE
    ,PRODUCT_NAME
FROM
    (
        SELECT
            CATEGORY
            ,PRICE
            ,RANK() OVER (PARTITION BY CATEGORY ORDER BY PRICE DESC) AS MAX_PRICE
            ,PRODUCT_NAME
        FROM
            FOOD_PRODUCT AS FR
        WHERE
            CATEGORY IN ('과자', '국', '김치', '식용유')
    ) AS SUB_QUERY
WHERE
    MAX_PRICE = 1
ORDER BY
    PRICE DESC