insert into dept 
(select department_id,department_name from departments);

/*select * from dept;*/

/*insert into dept values (10,'Accounts');
insert into dept values (null,'TT');
insert into dept values (20,'TT');
insert into dept values ('A1','Accounts');
insert into dept values (30,'Accounts');*/
/*All of them are giving error due to primary key constraint(no duplicate), not null
and dept_id can only be in number*/