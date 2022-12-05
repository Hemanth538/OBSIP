import java.util.Scanner;

public class GuessNumber {

	// Function that implements the number guessing game

	public static void numberGuessingGame()
	{
		Scanner sc = new Scanner(System.in);

		int number = 1 + (int)(150 * Math.random());

		// Given n trials
		int n = 5;

		int i, g;

		System.out.println("A number is chosen between 1 to 150 \nGuess the number within 4 trials.");

		// Iterate over n Trials
		for (i = 0; i < n; i++)
        {

			System.out.println("Guess the number:");

			g = sc.nextInt();

			// If the number is guessed
			if (number == g) 
            {
				System.out.println("Congratulations! You guessed the number.");
				break;
			}
			else if (number > g && i != n - 1) 
            {
				System.out.println("The number is greater than " + g + ". Try again");
			}
			else if (number < g && i != n - 1) 
            {
				System.out.println("The number is less than " + g + ". Try again");
			}

		}

		if (i == n) 
        {
			System.out.println("Your chances are completed.");

			System.out.println("The number was " + number);

            System.out.println("Restart the game to play again");
		}
	}

	public static void main(String args[])
	{

		// Calling the function
		numberGuessingGame();
	}
}
