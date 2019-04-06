create table customer (
                        ID bigint(20) not null auto_increment,
                        ADDRESS_LINE_ONE varchar(200),
                        ADDRESS_LINE_TWO varchar(200),
                        CITY varchar(200),
                        EMAIL varchar(200),
                        FIRST_NAME varchar(200),
                        LAST_NAME varchar(200),
                        PHONE_NUMBER varchar(200),
                        STATE varchar(200),
                        ZIP_CODE varchar(200)
);

INSERT INTO CUSTOMER (
  ID,
  ADDRESS_LINE_ONE,
  ADDRESS_LINE_TWO,
  CITY,
  EMAIL,
  FIRST_NAME,
  LAST_NAME,
  PHONE_NUMBER,
  STATE,
  ZIP_CODE
  )
VALUES (null,
        'ul. Rolna',
        '74',
        'Białystok',
        'n2God@o2.pl',
        'Lukasz',
        'Kardasz',
        '888 888 888',
        'Podlaskie',
        '15199'
        );

CREATE TABLE PRODUCT (
  ID BIGINT(20) NOT NULL AUTO_INCREMENT,
  DESCRIPTION VARCHAR(100) NOT NULL ,
  IMAGE_URL VARCHAR(100) NOT NULL ,
  PRICE DECIMAL(20,2),
  PRIMARY KEY (ID)
);


INSERT INTO PRODUCT (
                     ID,
                     DESCRIPTION,
                     IMAGE_URL,
                     PRICE)
VALUES ( null,
        'opis grzebien 01',
        'www.grzebienie.org/simpleGrzebien.jpg',
        '15.99' );
INSERT INTO PRODUCT (
  ID,
  DESCRIPTION,
  IMAGE_URL,
  PRICE)
  VALUES ( null,
           'opis grzebien 02',
           'www.grzebienie.org/simpleGrzebienwersjaSuper.jpg',
           '25.99' );