CREATE VIEW V_SALES_REPORT AS
	SELECT Sales_ID, Sales_Date, Product_ID, Product_Name, 
			Quantity_Sold, Product_Unit_Price, Sales_Price_Per_Unit, 
			(Sales_Price_Per_Unit - Product_Unit_Price) Profit_Amount
	FROM TBL_STOCK NATURAL JOIN TBL_SALES
	ORDER BY Profit_Amount DESC, Sales_ID ASC;