import java.util.*;

class Employee {
	static int empNo,totalSalary;
	int salary;
	Scanner scan;

	Employee(){
		scan = new Scanner(System.in);
		salary = scan.nextInt();
		totalSalary += salary;
		empNo++;
	}

	void display(){
		System.out.println("Total Employees: "+empNo+"\n"+"Total Salary: "+totalSalary);
	}
}

class EmployeeDemo {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		Employee emp = null;
		String check = "yes";


		while(check.equals("yes")) {
					System.out.println("Enter the salary of Employee:");
					emp = new Employee();

					System.out.println("Enter 'yes' to continue to add salaries of employees else enter 'no':");
					check = scan.next();
		}

		emp.display();
	}
}