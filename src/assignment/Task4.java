package assignment;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		// 1. Write a Java program that prompts the user to enter a positive integer. Use a while loop to calculate the factorial of the input number and display the result.
		Scanner sc=new Scanner(System.in);
		
		System.out.println("user input is:");
		
		int input=sc.nextInt();
		int i=1;
		int fact=1;
		
		while(i<=input) {
			
			fact=fact*i;
			i++;
			
			
		}System.out.println("factorial of the input is :"+fact);
		sc.close();
		
		
	}

}
