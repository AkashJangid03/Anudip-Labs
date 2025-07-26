package Lab06;
import java.util.Scanner;

public class StudentOverlaoding {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// default
		Student student1 = new Student();
		student1.printDetails();
		
		// name & age
		System.out.println("Enter the name and age of the student seperate: ");
		String s2name = sc.nextLine();
		int s2age = sc.nextInt();
		sc.nextLine();
		Student student2 = new Student(s2name, s2age);
		student2.printDetails();
		
		// name, age and department
		System.out.println("Enter the name, age and department of the student seperatly: ");
		String s3name = sc.nextLine();
		int s3age = sc.nextInt();
		String s3department = sc.nextLine();
		sc.nextLine();
		Student student3 = new Student(s3name, s3age, s3department);
		student3.printDetails();
	}
}


