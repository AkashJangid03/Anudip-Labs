/*
 Write a Java program that takes an array of integers as input and sorts it in
 ascending order using any sorting algorithm of your choice. Print the sorted array.
*/

package Lab07;
import java.util.Scanner;

public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Enter "+size+" integers: ");
		for (int i=0; i<size; i++) {
			array [i] = sc.nextInt();
		}
		
		for (int i=0; i<size; i++) {
			for (int j=0; j<size-1; j++) {
				if (array[j] > array[j+1]) {
					// swapping 
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		System.out.print("Sorted array: ");
		// print kaise kiya samjha nahi toh gpt use kiya 
		for (int num : array) {
			System.out.print(num+" ");
		}
	}
}