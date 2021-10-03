CREATE TRIGGER before_insert_user_id
    BEFORE INSERT ON ORDERS
    FOR EACH ROW
    SET new.user_id = autoInc();