-- SQLite

CREATE TABLE User (id INTEGER(6) PRIMARY KEY, name VARCHAR2(100) NOT NULL, age INTEGER(3) NOT NULL, phone VARCHAR2(20) NOT NULL,
 email VARCHAR2(50) NOT NULL, password VARCHAR2(60) NOT NULL UNIQUE, period INTEGER(100) NOT NULL check, basic_plan BOOLEAN NOT NULL,
 start_date DATE NOT NULL);

 INSERT INTO User VALUES(1, "Ali", 22, "01123456", "Ali1234@gmail.com", "Alli#678", 4, true, "02-02-2024");

 