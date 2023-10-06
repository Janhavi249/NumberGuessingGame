package com.topperworldtask;
import java.util.Scanner;

public class NumberGuessingGame 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int min = 0;
		int max = 10;
		int randomNumber = (int)(min + (Math.random()* (max - min) + 1));//It generates random number
		
		System.out.println("Welcome to Guess Number Game" );
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Will Be Asked To Guess a Number To Win The Game" + "\nYou have Maximum 5 Attemp Limit");
		System.out.println("--------------------------------------------------------------------");
		
		int trial=0;
		while(trial<5)
		{
			System.out.println("Enter a number between 1 to 10");
			int num=sc.nextInt();
			
			if(num>randomNumber)
			{
				System.out.println("Your guess number is smaller");
			}
			else if(num<randomNumber)
			{
				System.out.println("Your guess number is greater");
			}
			else
			{
				System.err.println("OOhhOO!, Your Number is Correct. You Win the Game!");
				break;
			}
			trial++;
		}
		if(trial==5)
		{
			System.err.println("OOPSSS! You have exhausted your 5 trials"+ "\n the number is "+randomNumber);
		}
		sc.close();
	}

}
