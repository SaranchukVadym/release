CREATE FUNCTION autoInc ()
RETURNS INT(10)
    DETERMINISTIC
    BEGIN
        DECLARE getCount INT(10);
        SET getCount = (
            SELECT COUNT(USER_ID)
            FROM ORDERS) + 1;
        RETURN getCount;
    END