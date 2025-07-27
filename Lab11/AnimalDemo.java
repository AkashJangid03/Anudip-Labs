/*
Write a Java program that demonstrates method overriding by creating a superclass called Animal and two subclasses called Dog and Cat.
The Animal class should have a method called makeSound(), which simply prints "The animal makes a sound."
The Dog and Cat classes should override this method to print "The dog barks." and "The cat meows." respectively.
The program should allow the user to create and display objects of each class.
Hint: Use multilevel inheritance.
 */

package Lab11;

import java.util.Scanner;

class Animal {
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

class Dog extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

class Puppy extends Dog {
 @Override
 public void makeSound() {
     System.out.println("The puppy yelps.");
 }
}

class Cat extends Animal {
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

public class AnimalDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("Choose an animal to create:");
     System.out.println("1. Animal");
     System.out.println("2. Dog");
     System.out.println("3. Puppy (multilevel from Dog)");
     System.out.println("4. Cat");
     System.out.print("Enter your choice (1-4): ");
     int choice = sc.nextInt();

     Animal animal;

     if (choice == 1) {
         animal = new Animal();
     } else if (choice == 2) {
         animal = new Dog();
     } else if (choice == 3) {
         animal = new Puppy();
     } else if (choice == 4) {
         animal = new Cat();
     } else {
         System.out.println("Invalid choice.");
         sc.close();
         return;
     }

     animal.makeSound();

     sc.close();
 }
}
