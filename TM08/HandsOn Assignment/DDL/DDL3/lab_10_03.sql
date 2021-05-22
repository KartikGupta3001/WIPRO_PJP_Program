create table emps(
id number(7) primary key,
l_name varchar2(25) not null,
f_name varchar2(25),
dept_id number(7),
constraint dept_id_fk foreign key(dept_id) references dept(dept_id));

/*describe emps;*/

/*insert into emps
values(101,'Sam','Sundar',10);*/

/*insert into emps
values(101,'Ram','Krishna',20);
unique constraint (HR.SYS_C007273) violated*/

/*insert into emps
values(102,'Gopi',null,40);*/

/*insert into emps
values(103,null,'Ram',20);
cannot insert NULL into ("HR"."EMPS"."L_NAME")*/

/*select * from emps;*/