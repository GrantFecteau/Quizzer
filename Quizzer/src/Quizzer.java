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
				
				for (int i = 0; i < noOfQ - 2; i++ )
					{
						getQuestions();
					}
				
				doQuestion2();
				
				doQuestion3();
				
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
		
			System.out.println("What is " +number1+ "%" +number2+ ".");
			
			int userAnswer = userInput.nextInt();
			
			if (userAnswer == answer)
				{
					correctA++;	
					System.out.println("That's right!");
					
				}
			
			else
				{
					wrongA++;
					System.out.println("That's wrong, sorry.");
				}
			
		}
		
		public static void doQuestion2()
		{
			int number3 = (int)(Math.random()*9)+1;
			
			int answer = number3 % number3;
			
			System.out.println("What is " +number3+ "%" +number3+ ".");
			
			int userAnswer = userInput.nextInt();
			
			if (userAnswer == answer)
				{
					correctA++;	
					System.out.println("That's right!");
					
				}
			
			else
				{
					wrongA++;
					System.out.println("That's wrong, sorry.");
				}
		}
		
		public static void doQuestion3()
			{
				int number5 = (int)(Math.random()*3)+1;
				
				int number6 = (int)(Math.random()*9)+3;
				
				int answer = number5 % number6;
				
				System.out.println("What is " +number5+ "%" +number6+ ".");
				
				int userAnswer = userInput.nextInt();
				
				if (userAnswer == answer)
					{
						correctA++;	
						System.out.println("That's right!");
						
					}
				
				else
					{
						wrongA++;
						System.out.println("That's wrong, sorry.");
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
					System.out.println("Aww. You got " +correctA + "answers right and " +wrongA+ " wrong.");
				}
		}

	}
