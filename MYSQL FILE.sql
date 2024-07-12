show databases;
use moneymover;
show tables;

create table login(formno varchar(20), cardNumber varchar(25), pinNumber varchar(10));
create table signup(formno varchar(20), name varchar(20), father_name varchar(20), dob varchar(20), gender varchar(20), email varchar(40), maritial_status varchar(20), address varchar(50), city varchar(20), pcode varchar(20), province varchar(20));
create table signuptwo(formno varchar(20), relegion varchar(20), category varchar(20), income varchar(50), qualification varchar(50), occupation varchar(20), pan_no varchar(20), aadhar_no varchar(20), seniorcitizen varchar(20), existingacc varchar(20));
create table signupthree(formno varchar(20), accountType varchar(40), cardNumber varchar(25), pinNumber varchar(10), facility varchar(150));
create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));

drop table signuptwo; 
 
describe bank;

select * from signup;

select * from signuptwo;

select * from signupthree;

select * from login;

select * from bank;

delete from bank where amount='00';

alter table login change pinNumber pin varchar(10);


truncate signup;

truncate signuptwo;

truncate signupthree;

truncate login;

truncate bank;
