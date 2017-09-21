CREATE TABLE tb_user(
  id INT PRIMARY KEY auto_increment,
  loginname VARCHAR(50) UNIQUE,
  PASSWARD VARCHAR (18),
  username VARCHAR (18),
  phone VARCHAR (18),
  address VARCHAR (255)
);

INSERT INTO tb_user(id,loginname, PASSWARD, username, phone, address)
 VALUES ('1','jack','123456','杰克','13920001234','广州魅力');

CREATE TABLE to_book(
id INT (11) PRIMARY KEY auto_increment,
name VARCHAR (54),
author VARCHAR (54),
publicationdate DATE ,
publication VARCHAR (150),
price DOUBLE ,
image VARCHAR (54),
remark VARCHAR (600)
);

INSERT INTO to_book(id, name, author,publicationdate, publication, price, image, remark) VALUES (
'1','疯狂的讲义','李刚 编辑','2008-10-01','电子工业出版社','72.8','java.jpg','你的梦想就是我的梦想');
INSERT INTO to_book(id, name, author,publicationdate, publication, price, image, remark) VALUES (
'2','轻量级','李刚 编辑','2008-11-01','电子工业出版社','52.5','ee.jpg','启动我的项目，hahah mybatis+spring');
INSERT INTO to_book(id, name, author,publicationdate, publication, price, image, remark) VALUES (
'3','疯狂的石头app','李刚 编辑','2011-05-01','电子工业出版社','12.6','android.jpg','你的梦想就是我的梦想,安卓死的快，java大法好');
INSERT INTO to_book(id, name, author,publicationdate, publication, price, image, remark) VALUES (
'4','ajax讲解大全','李刚 编辑','2012-11-21','电子工业出版社','32','java.jpg','不怕别人阻挡，只怕自己投降');


