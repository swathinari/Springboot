mysql> create database userDto
    -> ^C
mysql> create database userDto;
Query OK, 1 row affected (0.07 sec)

mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| business_sql       |
| db                 |
| emp                |
| information_schema |
| joins              |
| masterdb           |
| mysql              |
| online_business    |
| performance_schema |
| restuarent         |
| springbootapi      |
| sql_learning       |
| studentdetails     |
| swathi             |
| sys                |
| userdto            |
| userregister       |
+--------------------+
17 rows in set (0.06 sec)

mysql> use userdto
Database changed
mysql> desc userdto;
ERROR 1146 (42S02): Table 'userdto.userdto' doesn't exist
mysql> show tables;
+-------------------+
| Tables_in_userdto |
+-------------------+
| user_entity       |
+-------------------+
1 row in set (0.01 sec)

mysql> desc user_entity;
+----------+--------------+------+-----+---------+----------------+
| Field    | Type         | Null | Key | Default | Extra          |
+----------+--------------+------+-----+---------+----------------+
| id       | int          | NO   | PRI | NULL    | auto_increment |
| age      | int          | YES  |     | NULL    |                |
| location | varchar(255) | YES  |     | NULL    |                |
| name     | varchar(255) | YES  |     | NULL    |                |
+----------+--------------+------+-----+---------+----------------+
4 rows in set (0.01 sec)

mysql> select * from user_entity;
+----+------+----------+--------+
| id | age  | location | name   |
+----+------+----------+--------+
|  1 |   21 | hyd      | Swathi |
+----+------+----------+--------+
1 row in set (0.00 sec)

mysql> select * from user_entity;
+----+------+-----------+---------+
| id | age  | location  | name    |
+----+------+-----------+---------+
|  1 |   21 | hyd       | Swathi  |
|  2 |   45 | bangalore | kishore |
+----+------+-----------+---------+
2 rows in set (0.00 sec)

mysql> select * from user_entity;
+----+------+-----------+---------+
| id | age  | location  | name    |
+----+------+-----------+---------+
|  1 |   21 | hyd       | Swathi  |
|  2 |   45 | bangalore | kishore |
|  3 |   37 | noida     | Harshal |
+----+------+-----------+---------+
3 rows in set (0.01 sec)

mysql> select * from user_entity;
+----+------+-----------+---------+
| id | age  | location  | name    |
+----+------+-----------+---------+
|  1 |   21 | hyd       | Swathi  |
|  2 |   45 | bangalore | kishore |
|  3 |   37 | noida     | Harshal |
|  4 |   37 | chennai   | satyam  |
|  5 |   30 | mimbai    | shiva   |
|  6 |   30 | mumbai    | Ankit   |
|  7 |   33 | hyd       | saheel  |
|  8 |   28 | ap        | ramya   |
|  9 |   29 | ka        | mounika |
| 10 |   32 | kadapa    | ramu    |
+----+------+-----------+---------+
10 rows in set (0.00 sec)

mysql>mysql> select * from user_entity;
+----+------+-----------+---------+
| id | age  | location  | name    |
+----+------+-----------+---------+
|  1 |   21 | hyd       | Swathi  |
|  2 |   45 | bangalore | kishore |
|  3 |   37 | noida     | Harshal |
|  4 |   37 | chennai   | satyam  |
|  5 |   28 | mimbai    | hyd     |
|  6 |   30 | mumbai    | Ankit   |
|  7 |   33 | hyd       | saheel  |
|  8 |   28 | ap        | ramya   |
|  9 |   29 | ka        | mounika |
| 10 |   32 | kadapa    | ramu    |
+----+------+-----------+---------+
10 rows in set (0.02 sec)

mysql> select * from user_entity;
+----+------+-----------+---------+
| id | age  | location  | name    |
+----+------+-----------+---------+
|  1 |   21 | hyd       | Swathi  |
|  2 |   45 | bangalore | kishore |
|  3 |   37 | noida     | Harshal |
|  4 |   37 | chennai   | satyam  |
|  5 |   28 | hyd       | deva    |
|  6 |   30 | mumbai    | Ankit   |
|  7 |   33 | hyd       | saheel  |
|  8 |   28 | ap        | ramya   |
|  9 |   29 | ka        | mounika |
| 10 |   32 | kadapa    | ramu    |
+----+------+-----------+---------+
10 rows in set (0.01 sec)
