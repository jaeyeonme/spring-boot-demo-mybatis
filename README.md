# spring-boot-demo-mybatis

### Table
```sql
create table company (
		id INTEGER AUTO_INCREMENT PRIMARY KEY,
		company_name VARCHAR(128),
		company_address VARCHAR(128),
		INDEX (company_name)
)
```
- company table 생성

```sql
+-----------------+--------------+------+-----+---------+----------------+
| Field           | Type         | Null | Key | Default | Extra          |
+-----------------+--------------+------+-----+---------+----------------+
| id              | int          | NO   | PRI | NULL    | auto_increment |
| company_name    | varchar(128) | YES  | MUL | NULL    |                |
| company_address | varchar(128) | YES  |     | NULL    |                |
+-----------------+--------------+------+-----+---------+----------------+
3 rows in set (0.08 sec)
```



```sql
CREATE TABLE employee (
		id INTEGER AUTO_INCREMENT PRIMARY KEY,
		company_id INTEGER,
		company_name VARCHAR(128),
		employee_address VARCHAR(128),
		INDEX (employee_name),
		FOREIGN KEY (company_id) REFERENCES company(id)
)
```
- employee table 생성

```sql
+------------------+--------------+------+-----+---------+----------------+
| Field            | Type         | Null | Key | Default | Extra          |
+------------------+--------------+------+-----+---------+----------------+
| id               | int          | NO   | PRI | NULL    | auto_increment |
| company_id       | int          | YES  | MUL | NULL    |                |
| employee_id      | varchar(128) | YES  |     | NULL    |                |
| employee_name    | varchar(128) | YES  | MUL | NULL    |                |
| employee_address | varchar(128) | YES  |     | NULL    |                |
+------------------+--------------+------+-----+---------+----------------+
5 rows in set (0.01 sec)
```


