-- 准备数据库和数据表

CREATE DATABASE test;

CREATE TABLE tiger (
id INT(5) NOT NULL ,
name VARCHAR(30),
age INT(4),
weight VARCHAR(10),
PRIMARY KEY (id)
);

INSERT INTO tiger(id,name,age,weight) VALUES (1,'name1',22,'88');
INSERT INTO tiger(id,name,age,weight) VALUES (2,'name2',2,'8');