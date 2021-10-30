import java.util.*;

class Employee {
	int id;
	String name,designation;
	Scanner scan = new Scanner(System.in);

	Employee(int i){
		System.out.println("Enter Employee "+(i+1)+" ID:");
		id = scan.nextInt();

		scan.nextLine();

		System.out.println("Enter Employee "+(i+1)+" Name:");
		name = scan.nextLine();

		System.out.println("Enter Employee "+(i+1)+" Designation:");
		designation = scan.nextLine();
	}

	void displayManager(Employee[] emp){
		boolean flag=true;

		for(int i=0;i<5;i++){
			if(emp[i].designation.equals("Manager")){
				System.out.println(emp[i]);
				flag=false;
			}
		}

		if(flag)
			System.out.println("Employee not found whose designation is Manager.");
	}

	public String toString(){
		return "ID: "+id+"\nName: "+name+"\nDesignation: "+designation;
	}

	public static void main(String args[]){
		Employee emp[] = new Employee[5];

		for(int i=0;i<5;i++){
			emp[i] = new Employee(i);
		}

		emp[0].displayManager(emp);
	}
}