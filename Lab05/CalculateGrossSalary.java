/*
 Write a program to calculate the gross salary of a group of employees. 
 Basic salary should be taken from the user.
 If the basic salary is greater than 15000 ,HRA=20% and DA=60% will be given, else HRA=3000 and DA 70% will be given to the employee.
 
 Note:Input of basic salary will be taken from the keyboard. 
 After calculating the salary of one employee, the program will ask for the user's choice as int. 
 If “-1” is entered then the loop will continue and the loop will exit for other int inputs.
 */

package Lab05;
import java.util.Scanner;

public class CalculateGrossSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = -1;
		
		do {
			System.out.print("Enter the basic Salary: ");
			float basicSalary = sc.nextFloat();
			
			float hra, da;
			
			if(basicSalary <= 15000) {
				hra = (float) (0.2 * basicSalary);
				da = (float) (0.60 * basicSalary);
			} else {
				hra = 3000;
				da = (float) (0.70 * basicSalary);
				
			}
			
			System.out.println("HRA: "+hra);
			System.out.println("DA: "+da);
			float grossSalary = basicSalary + hra + da;
			System.out.println("Gross Salary = "+grossSalary);
			
			System.out.print("Enter -1 if you want to continue else press any digit to exit: ");
			choice = sc.nextInt();
			
		} while (choice == -1);
	}

}
