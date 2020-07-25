package com.montran.main;

import java.util.List;
import java.util.Scanner;

import com.montran.pojo.Employee;
import com.montran.util.EmployeeCollectionUtil;

public class EmployeeCollectionMainV2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		EmployeeCollectionUtil util = new EmployeeCollectionUtil();
		List<Employee> employeeList=null;
		Employee employees[];
		Employee employee;
		int employeeId;
		String name;
		double salary;
		int EmployeeChoice;
		String continueChoice;
		boolean result;
		int numberOfEmployees;
		
    do {
    	employeeList = util.getAllEmployees();
	if (employeeList.isEmpty())
		System.out.println("No employees");
	else
	  employeeList = util.getAllEmployees();
	  for (Employee emp : employeeList) {
			System.out.println(emp);
		}
		
     		System.out.println("Menu");
			System.out.println("1. Add Single Employee	");
			System.out.println("2. Add Multiple Employees");
			System.out.println("3. Update Existing Employee");
			System.out.println("4. Delete Existing Employee");
			System.out.println("5. Print Single Employee Details");
			System.out.println("6. Exit");

			System.out.println("Enter your choice");
			EmployeeChoice = scanner.nextInt();
			switch (EmployeeChoice) {
			case 1:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Enter Name");
				name = scanner.nextLine();
				System.out.println("Enter Salary");
				salary = scanner.nextDouble();

				employee = new Employee(employeeId, name, salary);
				result = util.addNewEmployee(employee);
				if (result)
					System.out.println("Employee is added successfully !!");
				else
					System.out.println("Fail to add employee entry");
				break;
			case 2:
				System.out.println("How many employees do you want to add ?");
				numberOfEmployees = scanner.nextInt();
				employees=new Employee[numberOfEmployees];
					for (int i = 0; i < numberOfEmployees; i++) {
						System.out.println("Enter EmployeeId");
						employeeId = scanner.nextInt();
						scanner.nextLine();
						System.out.println("Enter Name");
						name = scanner.nextLine();
						System.out.println("Enter Salary");
						salary = scanner.nextDouble();
						
						employee = new Employee(employeeId, name, salary);

						employees[i] = employee;
					}
					util.addAllEmployees(employees);
					System.out.println("Employees are added !!");
				break;
			case 3:
				System.out.println("Enter EmployeeId");
				employeeId = scanner.nextInt();
				employee = util.getEmployeeByEmployeeId(employeeId);
				if (employee != null) {
					System.out.println(employee);
					System.out.println("Enter new salary");
					double newSalary = scanner.nextDouble();
					

					result = util.updateEmployeeSalary(employeeId,newSalary);
					if (result)
						System.out.println("Employee details are updated successfully !!");
					else
						System.out.println("Employee not found !! Invalid  employeeId");
				} else
					System.out.println("Employee not found !!");
				break;

			case 4:
				System.out.println("Enter EmployeeId");
			employeeId = scanner.nextInt();
				employee = util.getEmployeeByEmployeeId(employeeId);
				if (employee != null) {
					result = util.deleteEmployee(employeeId);
					if (result)
						System.out.println("Employee record deleted successfully ");
					else
						System.out.println("Failed to delete employee record");
				} else
					System.out.println("No employee record Found !!");
				break;
			case 5:
				System.out.println("Enter EmployeeID");
				employeeId = scanner.nextInt();
				employee = util.getEmployeeByEmployeeId(employeeId);
				if (employee != null) {
					System.out.println(employee);
				} else
					System.out.println("No employee record Found !!");
				break;
			case 6:
				System.out.println("Thank you");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
			System.out.println("Do you want to continue yes- no ??");
			continueChoice = scanner.next();
		} while (continueChoice.equals("yes"));
		System.out.println("Thank you");
	    
		scanner.close();
		
		
		
		
		
		
		
		
		
	}
		
	}		
