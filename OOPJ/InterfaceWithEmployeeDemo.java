interface Attendance {
	int calculateAttendance();
}

interface SalaryDetails {
	void calculateSalary();
}

class Employee implements Attendance,SalaryDetails {
	static int salaryPerDay = 2000;

	public int calculateAttendance(){
		return 30;
	}

	public void calculateSalary(){
		int attendance = calculateAttendance();
		int totalSalary =  attendance * salaryPerDay;

		System.out.println("Total Salary of Employee: "+totalSalary+" Rs.");
	}
}

class InterfaceWithEmployeeDemo {
	public static void main(String args[]) {
		Employee emp = new Employee();

		emp.calculateSalary();
	}
}