/* SimpleCalc: Four Function (+,-,*,/)Calculator */
import java.io.*; 
import java.util.Scanner;
	public class SimpleCalc
	{
		public static void main(String args[])
		{
			System.out.println("  This Is A Simple Calculator ");
			/* Variable Initializations */
			boolean flag = false;
			boolean restart = true;
			int legalInput[];
			legalInput = new int[4];
			for(int i = 0; i<4; i++)
				legalInput[i] = i+1;
			Scanner input = new Scanner(System.in);
			/*==========================*/
			while (restart)
			{
				/* System UI */
				System.out.println("==== Choose Functionality ====");
				System.out.println("Add (1)\nSubstract (2)\nMultiply (3)\nDivide (4)");
				System.out.println("==============================");
				System.out.print("Choose Option (1-4): ");
				/* Take User Input */
				int usrInput = input.nextInt();
				/* Compare User Input */
				for (int i = 0; i<4; i++)
				if (usrInput == legalInput[i])
				{
					flag = true;
					break;
				}
				if (flag == false)
					System.out.print("Incorrect Response, Try Again!");
				else
				{
					System.out.print("Enter Values of (x,y): ");
					float x = input.nextFloat();
					float y = input.nextFloat();
					if (usrInput == 1)
						System.out.println("Sum = "+ (x+y));
					else if (usrInput == 2)
						System.out.println("Difference = "+ (x-y));
					else if (usrInput == 3)
						System.out.println("Product = "+ (x*y));
					else
						System.out.println("Quotient = "+ (x/y));
				}
				/* Restart the UI */
				System.out.print("Restart? (y|n): ");
				char rst = input.next().charAt(0);
				if (rst == 'y' || rst == 'Y')
					restart = true;
				else if (rst == 'n' || rst == 'N')
					restart = false;
				else
				{
					System.out.print("Invalid Choice!");
					break;
				}
			}
			
		}
	}
