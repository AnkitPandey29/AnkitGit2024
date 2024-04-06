package javaBasicProgram;

import java.util.Scanner;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//capagamin interview
		Scanner s = new Scanner(System.in);
		System.out.println("Input the Number");
		int number = s.nextInt();
		if(number%5==0)
		{
			System.out.println("orange");
		}
		if(number%3==0)
		{
			System.out.println("Red");
		}
		if(number%50==0)
		{
			System.out.println("Orange Red");
		}
		

	}

}
