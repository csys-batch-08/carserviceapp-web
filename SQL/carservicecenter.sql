--USER DETAILS
create table userdetails
(
user_id int generated always as identity start with 100 primary key,
u_name varchar2(50) not null,
mobileno number(20) unique,
u_password varchar2(50) not null,
u_email varchar2(50) unique not null,
u_address varchar2(60) not null
);
desc userdetails;
insert into userdetails(u_name,mobileno,u_password,u_email,u_address,usertype) values('vinithkumar',9384794214,'Helloworld@143','babluvinith25@gmail.com','223,shevapet,salem','admin');
insert into userdetails(u_name,mobileno,u_password,u_email,u_address) values('thilipkumar',8056311562,'Thilip@143','thilipkumar@gmail.com','22,nehru street,salem');
select * from userdetails;
alter table userdetails add usertype varchar2(50) default 'user';
alter table bill add status varchar2(20) default 'processing';



--SERVICE CENTER
create table service_center
(
center_id int generated always as identity start with 300 primary key,
user_id int,
foreign key(user_id) references userdetails(user_id),
center_name varchar2(50) not null,
c_location varchar2(30) not null,
c_contact int unique,
c_email varchar2(40) unique,
c_address varchar2(70) not null
);
insert into service_center(user_id,center_name,c_location,c_contact,c_email,c_address) values(100,'vinayaka cars','salem west',9088974502,'vinayakacars@gmail.com','90,rampillai street,salem west');
select * from service_center;
alter table service_center add status varchar2(50) default 'active';

--SERVICES
create table services
(
service_id int generated always as identity start with 500 primary key,
service_name varchar2(50) not null,
service_cost int not null,
service_desc varchar2(100) not null
);
insert into services(service_name,service_cost,service_desc) values('ac filter clean',3000,'clean all filters perfectly');
select * from services;
alter table services add status varchar2(50) default 'active';
select service_name,service_cost,service_desc,service_id from services where status='active';

--PICKUP
create table pickup
(
pickup_id int generated always as identity start with 700 primary key,
user_id int,
foreign key (user_id) references userdetails(user_id),
cus_name varchar2(40) not null,
cus_email varchar2(50),
cus_contact int,
pick_address varchar2(80) not null,
center_id int,
foreign key (center_id) references service_center(center_id)
);
alter table pickup add status varchar2(20) default 'requested';
select * from pickup order by pickup_id desc;
delete from pickup;
commit;

--BILL
create table bill
(
bill_num int generated always as identity start with 900 primary key,
user_id int,
foreign key (user_id) references userdetails(user_id),
serv_date date,
amount int not null,
status varchar(50)
);
select * from bill;

alter table bill add constraint servid foreign key (service_id) references services(service_id);
alter table bill modify status default 'processing';
alter table bill modify amount default 0;

--SERVICE DETAILS
create table service_details
(
detail_id int generated always as identity start with 1300 primary key,
user_id int,
foreign key(user_id) references userdetails(user_id),
service_id int,
foreign key(service_id) references services(service_id)
);
select * from service_details;

--PAYMENT
create table payment
(
payment_id int generated always as identity start with 1500 primary key,
bill_num int,
foreign key(bill_num) references bill(bill_num),
card_no int not null,
cardhol_name varchar2(50) not null,
expiry_date date,
cvv_no int not null,
amt_paid int not null
);
select * from payment;
commit;