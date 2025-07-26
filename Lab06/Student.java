package Lab06;

public class Student {
	String name;
	int age;
	String department;
	
	// default
	Student() {
		name = "Unknown";
		age = 20;
		department = "Unassigned";
	}
	
	// name & age
	Student(String studentName, int studentage) {
		name = studentName;
		age = studentage;
		department = "IT";
	}
	
	// name, age, dpt
	Student(String studentName, int studentAge, String studentDepartment) {
		name = studentName;
		age = studentAge;
		department = studentDepartment;
	}
	
	void printDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Department: "+department);
	}
}
