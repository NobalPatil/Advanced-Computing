import java.util.*;

class Student implements Comparable<Student> {
	int roll,marks,age;

	Student(){

	}

	Student(int roll,int marks,int age){
		this.roll = roll;
		this.marks = marks;
		this.age = age;
	}

	public String toString(){
			return "Roll:"+roll+" Marks:"+marks+" Age:"+age;
	}

	public int compareTo(Student s){
		return this.roll-s.roll;
	}

	void show(Collection<?> list){
		Iterator it = list.iterator();

		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}

class StudentSortingFactor implements Comparator<Student>{
	public int compare(Student s1,Student s2){
			return s1.marks-s2.marks;
	}
}

class ComparableDemo{
	public static void main(String args[]){
		Student s = new Student();
		List<Student> list = new ArrayList<>();

		Collection<Object> list1 = new ArrayList<>();

		list1.add("String");
		list1.add(23);

		s.show(list1);

		list.add(new Student(1,20,22));
		list.add(new Student(2,10,22));

		list.add(1,new Student(3,20,24));

		//list.set(2,new Student(4,21,12));

		//Collections.sort(list);

		s.show(list);

		Collections.sort(list,new StudentSortingFactor());

		Iterator it1 = list.iterator();

		s.show(list);
	}
}