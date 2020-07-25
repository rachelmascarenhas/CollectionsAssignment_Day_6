package com.montran.util;
import com.montran.pojo.Employee;
import java.util.ArrayList;
import java.util.List;
import com.montran.main.EmployeeCollectionMainV2;
public class EmployeeCollectionUtil {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public boolean addNewEmployee(Employee employee) {
		employeeList.add(employee);
		return true;
	}
	
	public boolean addAllEmployees(Employee[] employee) {
	   for (Employee employeess : employee) {
		   addNewEmployee(employeess);
	   }
	   return true;
	}

	
	public Employee getEmployeeByEmployeeId(int employeeId) {
		for (Employee employee : employeeList) {
			if (employee != null) {
				if (employee.getEmployeeId() == employeeId)
					return employee;
			}

		}
		return null;
	}
	
    public boolean updateEmployeeSalary(int employeeId ,  double newSalary) {
    	for (Employee employees: employeeList) {
			if (employees.getEmployeeId() == employeeId) {
				employees.setSalary(newSalary);
				return true;
			}
		}
		return false;
    		   
	}
    
    public boolean deleteEmployee(int employeeId) {
    	for (Employee employees: employeeList) {
			if (employees.getEmployeeId() == employeeId) {
				employeeList.remove(employees);
				return true;
			}
		}
         return false;
    }
    
    
	public List<Employee> getAllEmployees() {
		return employeeList;
	}
	
	

}
