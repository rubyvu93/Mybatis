CREATE TABLE  user (
  user_id int(10)  NOT NULL auto_increment,
  email_id varchar(45) NOT NULL,
  password varchar(45) NOT NULL,
  first_name varchar(45) NOT NULL,
  last_name varchar(45) default NULL,
  PRIMARY KEY  (user_id)
);