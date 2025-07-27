package Lab10;

import java.util.Scanner;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Dog barks.");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The Cat meows.");
    }
}

public class AnimalOverriding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal to create:");
        System.out.println("A - Animal");
        System.out.println("D - Dog");
        System.out.println("C - Cat");
        System.out.print("Enter your choice (A/D/C): ");
        char choice = scanner.next().charAt(0); 

        if (choice == 'A' || choice == 'a') {
            Animal a = new Animal();
            a.makeSound();
        } else if (choice == 'D' || choice == 'd') {
            Dog d = new Dog();
            d.makeSound();
        } else if (choice == 'C' || choice == 'c') {
            Cat c = new Cat();
            c.makeSound();
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
