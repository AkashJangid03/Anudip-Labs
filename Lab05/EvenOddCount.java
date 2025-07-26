/*
  Write a program to count and print the total number of odd and even numbers from user inputs. 
  Program will ask for user inputs in a loop. 
  Loop will terminate if-1 is entered as input.
 */

package Lab05;
import java.util.Scanner;

public class EvenOddCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int evenCount = 0;
		int oddCount = 0;
		int number;
		
		System.out.println("Enter numbers and press '-1' to stop entery: ");
		
		while (true) {
			number = sc.nextInt();
			
			if (number == -1) {
				break;
			} else {
				if (number % 2 == 0) {
					evenCount++;
					} else {
						oddCount++;
					}
			}
		}
		
		System.out.println("Total count off even numbers: "+evenCount);
		System.out.println("Total count of odd numbers: "+oddCount);
		
	}
}
