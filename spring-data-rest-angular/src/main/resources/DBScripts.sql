


create database taskmanager;

use taskmanager;

create table task_list(task_id int not null auto_increment, task_name varchar(100) not null, task_description text,task_priority varchar(20),task_status varchar(20),task_start_time datetime not null default CURRENT_TIMESTAMP,task_end_time datetime not null default CURRENT_TIMESTAMP,task_archived bool default false,primary key(task_id));

insert into task_list values(1,'Gathering Requirement','Requirement Gathering','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR,0);

insert into task_list values(2,'Application Designing','Application Designing','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 2 HOUR,0);

insert into task_list values(3,'Implementation','Implementation','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR,0);

insert into task_list values(4,'Unit Testing','Unit Testing','LOW','ACTIVE',curtime(),curtime() + INTERVAL 4 HOUR,0);

insert into task_list values(5,'Maintanence','Maintanence','LOW','ACTIVE',curtime(),curtime() + INTERVAL 5 HOUR,0);

select * from task_list;

use taskmanager;
create table order_list(order_id int not null auto_increment, order_name varchar(100) not null, order_description text,order_priority varchar(20),order_status varchar(20),order_start_time datetime not null default CURRENT_TIMESTAMP,order_end_time datetime not null default CURRENT_TIMESTAMP,order_archived bool default false,primary key(order_id));

insert into order_list values(1,'Books Order','Books Order','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR,0);

insert into order_list values(2,'Pens Order','Pens Order','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 2 HOUR,0);

insert into order_list values(3,'Cars Order','Cars Order','MEDIUM','ACTIVE',curtime(),curtime() + INTERVAL 3 HOUR,0);

insert into order_list values(4,'Toys Order','Toys Order','LOW','ACTIVE',curtime(),curtime() + INTERVAL 4 HOUR,0);

insert into order_list values(5,'Order Maintanence','Order Maintanence','LOW','ACTIVE',curtime(),curtime() + INTERVAL 5 HOUR,0);
select * from order_list;