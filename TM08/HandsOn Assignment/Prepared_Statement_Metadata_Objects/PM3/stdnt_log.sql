CREATE TABLE stdnt_log (
	Rollno Number (4) Primary Key,
	StudentName Varchar (20)  Not Null,
	Standard Varchar (2) Not Null,
	Date_Of_Birth Date,
	Fees Number (9,2)
);
/*CREATE TABLE stdnt (
	Rollno Number (4) Primary Key,
	StudentName Varchar (20)  Not Null,
	Standard Varchar (2) Not Null,
	Date_Of_Birth Date,
	Fees Number (9,2)
);

INSERT INTO stdnt VALUES(1001, 'BOB', 'IV', '15-Aug-1947', 4500.0);
 */