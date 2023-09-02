package assignment;

public class Task8 {

	public static void main(String[] args) {
		/* 1. Write a Java program that initializes an array of integers with values {1, 2, 3, 4, 5} and
		calculates the sum of all elements using an enhanced for loop (forEach)*/
		
		int digit[]= {1,2,3,4,5};
		int sum=0;
		for(int a:digit) {
			
			sum=sum+a;
			
		}System.out.println("sum of all the elements are :"+sum);
		
		

	}

}
