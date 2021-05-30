select employee_id,last_name,salary,department_id from employees
where manager_id = &manager_id_value
order by &sorted_value;

/*select employee_id,last_name,salary,department_id from employees
where manager_id = 108
order by salary*/