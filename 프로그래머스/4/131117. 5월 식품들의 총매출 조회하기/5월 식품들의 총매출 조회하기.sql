SELECT
    FR.PRODUCT_ID
    ,FR.PRODUCT_NAME
    ,SUM(FO.AMOUNT) * FR.PRICE AS TOTAL_SALES
FROM
    FOOD_PRODUCT AS FR
JOIN
    FOOD_ORDER AS FO
ON
    FR.PRODUCT_ID = FO.PRODUCT_ID
WHERE
    YEAR(FO.PRODUCE_DATE) = '2022' AND
    MONTH(FO.PRODUCE_DATE) = '5'
GROUP BY
    FR.PRODUCT_ID
ORDER BY
    TOTAL_SALES DESC
    ,FR.PRODUCT_ID ASC