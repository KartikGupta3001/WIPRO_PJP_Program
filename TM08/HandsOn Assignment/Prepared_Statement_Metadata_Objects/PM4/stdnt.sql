CREATE TABLE stdnt (
	Rollno Number (4) Primary Key,
	StudentName Varchar (20)  Not Null,
	Standard Varchar (2) Not Null,
	Date_Of_Birth Date,
	Fees Number (9,2)
);
/*INSERT INTO student VALUES(1002, 'ALICE', 'V', '16-Aug-1947', 4300.0);
 */
 /*UPDATE stdnt SET fees = 4500.0 WHERE rollno = 1002;*/