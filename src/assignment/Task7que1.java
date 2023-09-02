package assignment;
import java.util.Scanner;
public class Task7que1 {

	public static void main(String[] args) {
		// 1. Write a Java program that takes a positive integer input and checks if it's a prime number using a break statement. Display the result accordingly.
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number :");

int input=sc.nextInt();

if(input%input==0 & input%1==0) {
	System.out.println("It is a prime number");
	
	
	
}else {
  System.out.println("It is not a prime number");

	}
	

}
}