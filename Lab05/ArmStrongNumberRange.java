/*
 Write a program to find out all the armstrong numbers within a given range using a method named printArmstrongNumber( int start, int end) by taking input from the user.
 The program should print the Armstrong number in a given range starting from “start” and ending with “end”.
 
 Armstrong Number Example: 153 13+53+33=153 (Number which is equal to the sum of the cubes of its digits)
 
 Note: input should be taken from the keyboard. 
 Use a loop to calculate the Armstrong number from “start” to “end”. 
 Also use loops to calculate the cube of a number. Do not use the Math.pow() function.

 */

package Lab05;
import java.util.Scanner; 

public class ArmStrongNumberRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the starting number: ");
		int start = sc.nextInt();
		System.out.print("Enter the ending number: ");
		int end = sc.nextInt();
		
		System.out.println("The Armstring number between the givemn range is: ");
		printArmstrongNumber(start, end);
	}
	
	public static void printArmstrongNumber(int start, int end) {
		for(int num=start; num<=end; num++) {
			int originalNumber = num;
			int sum = 0;
			
			while (originalNumber != 0) {
				int digit = originalNumber % 10;
				// int cube = digit * digit * digit;
				int cube = 1;
				for (int i=0; i<3; i++) {
					cube = cube*digit;
				}
				
				sum = sum + cube;
				originalNumber = originalNumber/10;
			}
			
			if (sum == num) {
				System.out.print(num+", ");
			}
		}
	}
}
