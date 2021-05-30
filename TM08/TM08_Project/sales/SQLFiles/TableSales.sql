CREATE TABLE TBL_SALES (
	Sales_ID Varchar2(6), 
	Sales_Date Date,
	Product_ID Varchar2(6),
	Quantity_Sold Number(11),
	Sales_Price_Per_Unit Number(11,2),
	CONSTRAINT PK10 PRIMARY KEY(Sales_ID),
	CONSTRAINT FK11 FOREIGN KEY(Product_ID) REFERENCES TBL_STOCK(Product_ID),
	CONSTRAINT CH12 CHECK(Quantity_Sold >= 0),
	CONSTRAINT CH13 CHECK(Sales_Price_Per_Unit >= 0)
);

