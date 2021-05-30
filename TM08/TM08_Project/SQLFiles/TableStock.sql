CREATE TABLE TBL_STOCK (
	Product_ID Varchar2(6),
	Product_Name Varchar2(20),
	Quantity_On_Hand Number(11),
	Product_Unit_Price Number(11,2),
	Reorder_Level Number(11),
	CONSTRAINT PK00 PRIMARY KEY(Product_ID),
	CONSTRAINT UQ01 UNIQUE(Product_Name),
	CONSTRAINT CH02 CHECK(Quantity_On_Hand >= 0),
	CONSTRAINT CH03 CHECK(Product_Unit_Price >= 0),
	CONSTRAINT CH04 CHECK(Reorder_Level >= 0)
);