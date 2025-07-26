/*
 Write a Java program that takes an array of integers as input from the user and 
 then calculates the sum and average of the elements in the array. 
 The program should output the sum and average.
 */

package Lab07;
import java.util.Scanner;
public class SumAndAverage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		
		int[] number = new int[size];
		int sum = 0;
		
		System.out.println("Enter "+size+" integers: ");
		for (int i=0; i< size; i++) {
			number[i] = sc.nextInt();
			sum = sum + number[i];
		}
		
		float average = sum / size;
		
		System.out.println("Sum of the array: "+sum);
		System.out.println("Average of the array: "+average);
	}
}
