package codes;

import java.util.Scanner;

public class FunctionsAssignment {
	
//***********************************************************************************************************
/*

	// 1.0
	public static int middle(int number1, int number2, int number3)
	{
		
		int winner=0;
		
		
		if ( (number1 > number2 && number2 > number3) || (number3 > number2 && number2 > number1) ) // num1, num2, num3
		{
			System.out.println("Try 1");
			winner = number2;
		}
		if ( (number2 > number1 && number1 > number3) || (number3 > number1 && number1 > number2) ) // num2, num1, num3
		{
			System.out.println("Try 2");
			winner = number1;
		}
		if ( (number1 > number3 && number3 > number2) || (number2 > number3 && number3 > number1) ) // num1, num3, num2
		{
			System.out.println("Try 3");
			winner = number3;
		}
		
		
		return winner;
	}
	
*/
//***********************************************************************************************************
	
	// 3.0
	public static int sum(int number)
	{
		int sum = 0;
		

		while (number > 0)
		{	
			sum += number%10;
			number = number/10;
			
		}
		
		
		return sum;
	}
	
	
//***********************************************************************************************************

	public static void main(String[] args) {
		
		
//***********************************************************************************************************
/*

	// 1. Function that takes 3 integer parameters & returns the number with the middle value.
		
		Scanner input = new Scanner(System.in);
		int figure1 = 1, figure2 = 2, figure3 = 3;
		
		
		System.out.println("Please enter an integer:");
		figure1 = input.nextInt();
		
		System.out.println("Please enter an integer:");
		figure2 = input.nextInt();
		
		System.out.println("Please enter an integer:");
		figure3 = input.nextInt();
		
		int middleValue = middle(figure1,figure2,figure3);
		
		System.out.println(middleValue);

*/		
//************************************************************************************************************
		
	// 3. Function called "sum" that takes any integer as a parameter & returns the sum of its
	//    individual digits.
		
		Scanner input = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Please enter an integer");
		number = input.nextInt();
		
		int total = sum(number);
		
		System.out.println(total);

	}

}
