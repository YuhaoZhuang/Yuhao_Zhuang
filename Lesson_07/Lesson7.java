import java.util.Scanner;
public class Lesson7 

{
	static int sum = 0;	
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb= new Scanner(System.in);
		System.out.println("Please enter your number.");
		number = kb.nextInt();
		sumDigits();
		
		System.out.println("The sum of the digits in" + number + " is " + sum);
	}
	public static void sumDigits()
	{
		int num = number;
		while (num > 0)
		{
			sum += num % 10;
			num /= 10;
		}
		
	}
}