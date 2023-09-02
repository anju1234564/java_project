package assignment;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// //Write a Java program that takes an integer input and checks if it's positive, negative, or zero.Display the result accordingly.
	     Scanner sc=new Scanner(System.in);
	     System.out.println("please enter the number");
	     int num=sc.nextInt();
	     if(num>0) {
	    	 System.out.println("It is a positive number");
	     }else if(num<0) {
	    	 System.out.println("It is a negative number"); 
	    	
	     }
	     else {
	    	 System.out.println("It is zero");
	     }sc.close();
		}



	}


