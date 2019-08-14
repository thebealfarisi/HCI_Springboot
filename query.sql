
CREATE DATABASE "hci";

CREATE TABLE tbl_user
(
  
user_id serial NOT NULL,
  
name character varying(255),
  
PRIMARY KEY (user_id)
);

INSERT INTO tbl_user(user_id, name)
    VALUES (1, 'UserA');
INSERT INTO tbl_user(user_id, name)
    VALUES (2, 'UserB');
INSERT INTO tbl_user(user_id, name)
    VALUES (3, 'UserC');



CREATE TABLE section
(
  
section_id serial NOT NULL,
  
section_card_name character varying(255),
  
section_name character varying(255),
  
PRIMARY KEY (section_id)
);

INSERT INTO section(section_id, section_card_name, section_name)
    VALUES (1, 'PromoCard', 'Promo');
INSERT INTO section(section_id, section_card_name, section_name)
    VALUES (2, 'CategoryCard', 'Category');
INSERT INTO section(section_id, section_card_name, section_name)
    VALUES (3, 'FlashSaleCard', 'FlashSale');
INSERT INTO section(section_id, section_card_name, section_name)
    VALUES (4, 'HistoryCard', 'History');
INSERT INTO section(section_id, section_card_name, section_name)
    VALUES (5, 'NewsCard', 'News');



CREATE TABLE module
(
  
module_id serial NOT NULL,
  
order_data integer,
  
section_id integer,
  
user_id integer,
  
PRIMARY KEY (module_id),
  
FOREIGN KEY (user_id)
      
REFERENCES tbl_user (user_id),
  
FOREIGN KEY (section_id)
     
REFERENCES section (section_id));

INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (1, 1, 1, 1);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (2, 2, 2, 1);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (3, 3, 3, 1);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (4, 4, 4, 1);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (5, 5, 5, 1);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (6, 1, 1, 2);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (7, 2, 5, 2);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (8, 3, 3, 2);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (9, 4, 2, 2);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (10, 5, 5, 2);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (11, 1, 1, 3);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (12, 2, 3, 3);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (13, 3, 2, 3);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (14, 4, 5, 3);
INSERT INTO module(module_id, order_data, section_id, user_id)
    VALUES (15, 5, 4, 3);
