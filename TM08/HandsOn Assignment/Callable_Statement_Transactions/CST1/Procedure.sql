CREATE OR REPLACE PROCEDURE raise_salary (
	p_id IN emp.employee_id % TYPE, 
	p_percent IN NUMBER
) 
IS 
	test NUMBER;
BEGIN 

	/*UPDATE emp SET salary = salary * ( 1 + p_percent/ 100 ) 
	WHERE employee_id = p_id; */

	SELECT COUNT(*) INTO test FROM emp;
	DBMS_OUTPUT.PUT_LINE(test || ' records total');

END raise_salary;
/


CREATE OR REPLACE PROCEDURE calculate_salary (
	p_employee_id IN emp.employee_id % TYPE,
	p_commission_pct IN emp.commission_pct % TYPE,
	p_salary IN emp.salary % TYPE,
	p_percent IN NUMBER
) 
IS 
	gross_salary NUMBER;
	net_salary NUMBER;
	it NUMBER;
BEGIN 

	gross_salary = p_salary + p_commission_pct;
	
	IF p_commission_pct IS NULL THEN
		it = gross_salary * 10 / 100;
	ELSE IF p_commission_pct < 500 THEN
		it = gross_salary * 15 / 100;
	ELSE
		it = gross_salary * 20 / 100;
	END IF;

	net_salary = gross_salary - it;

	UPDATE emp SET salary = salary * ( 1 + p_percent/ 100 ) 
	WHERE employee_id = p_employee_id; 

END calculate_salary;
/


CREATE OR REPLACE PROCEDURE calculate_salary (
	p_employee_id IN emp.employee_id % TYPE,
	output OUT emp.salary % TYPE
) IS 
	p_commission_pct emp.commission_pct % TYPE;
	p_salary emp.salary % TYPE;

	gross_salary  emp.salary % TYPE;
	net_salary  emp.salary % TYPE;
	it  emp.salary % TYPE;
BEGIN 
	SELECT commission_pct INTO p_commission_pct FROM emp WHERE employee_id = p_employee_id;
	SELECT salary INTO p_salary FROM emp WHERE employee_id = p_employee_id;

	IF p_commission_pct IS NULL THEN
		p_commission_pct := 0;
	END IF;

	gross_salary := p_salary + p_commission_pct;
	
	IF p_commission_pct IS NULL THEN
		it := gross_salary * 10 / 100;
	ELSE
		IF p_commission_pct < 500 THEN
			it := gross_salary * 15 / 100;
		ELSE
			it := gross_salary * 20 / 100;
		END IF;	
	END IF;

	net_salary := gross_salary - it;
	
	output := net_salary;
END calculate_salary;
/