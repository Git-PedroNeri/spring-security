INSERT INTO `customer` (`name`,`email`,`mobile_number`, `pwd`, `role`,`create_dt`)
VALUES ('Pedro neri','pedro.neri@email.com','9876548337', '$2y$12$oRRbkNfwuR8ug4MlzH5FOeui.//1mkd.RsOAJMbykTSupVy.x/vb2', 'admin',CURDATE());



INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'VIEWACCOUNT');

INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'VIEWCARDS');

INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'VIEWLOANS');

INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'VIEWBALANCE');

DELETE FROM `authorities`;

INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'ROLE_USER');

INSERT INTO `authorities` (`customer_id`, `name`)
VALUES ((SELECT c.customer_id FROM CUSTOMER C WHERE C.EMAIL LIKE '%pedro.neri@email.com%'), 'ROLE_ADMIN');