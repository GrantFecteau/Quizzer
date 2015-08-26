import java.util.Scanner;
public class Quizzer
	{

		static int correctA;
		
		static int wrongA;
		
		static int noOfQ;
		
		static Scanner userInput = new Scanner(System.in);
		
		public static void main(String[] args)
			{
				askQuestion();
				
				for (int i = 0; i < noOfQ; i++ )
					{
						getQuestions();
					}
				
				printResult();
				
				
				

			}
		
		
		public static void askQuestion()
		{
			System.out.println("How many questions would you like?");
			
			noOfQ = userInput.nextInt();
			
		}
		
		public static void getQuestions()
		{
			
			
			int number1 = (int)(Math.random()*9)+2;
			
			int number2 = (int)(Math.random()*5)+1;
			
			int answer = number1 % number2;
		
			System.out.println("What is the modulus of " +number1+ " and " +number2+ ".");
			
			int userAnswer = userInput.nextInt();
			
			if (userAnswer == answer)
				{
					correctA++;	
					System.out.println("That's right!");
					
				}
			
			else
				{
					wrongA++;
				}
			
		}
		
		public static void printResult()
		{
			if(correctA > wrongA)
				{
					System.out.println("Congrats! You got " + correctA + " answers right, and "+ wrongA +" wrong."  );
				}
			
			else
				{
					System.out.println("Aww");
				}
		}

	}
