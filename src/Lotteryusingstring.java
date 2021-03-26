import java.util.Scanner;

public class Lotteryusingstring {

    public static void main(String[] args) {
        String lottery = "" + (int)(Math.random() * 10)
        + (int)(Math.random() * 10) +(int)(Math.random() * 10);

         // Prompt the user to enter a guess
         Scanner input = new Scanner(System.in);
         System.out.print("Enter your lottery pick (three digits): ");
         String guess = input.nextLine();
         // Get digits from lottery
         char lotteryDigit1 = lottery.charAt(0);
         char lotteryDigit2 = lottery.charAt(1);
         char lotteryDigit3 = lottery.charAt(2);

         // Get digits from guess
         char guessDigit1 = guess.charAt(0);
         char guessDigit2 = guess.charAt(1);
         char guessDigit3 = guess.charAt(2);

         System.out.println("The lottery number is " + lottery);

         // Check the guess
         if (guess.equals(lottery))
             System.out.println("Exact match: you win $20,000");
         else if     (guessDigit2 == lotteryDigit1
                 && guessDigit1 == lotteryDigit2
                 && lotteryDigit1 == lotteryDigit3
                 && lotteryDigit3 == lotteryDigit1
                 && lotteryDigit2 == lotteryDigit3
                 && lotteryDigit3 == lotteryDigit2)
         System.out.println("Match all digits: you win $5,000");
         else if (guessDigit1 == lotteryDigit1
         || guessDigit1 == lotteryDigit2
         || guessDigit1 == lotteryDigit3
         || guessDigit2 == lotteryDigit1
         || guessDigit2 == lotteryDigit2
         || guessDigit2 == lotteryDigit3
         || guessDigit3 == lotteryDigit1
         || guessDigit3 == lotteryDigit2
         || guessDigit3 == lotteryDigit3)
         System.out.println("Match one digit: you win $2,000");
        else
         System.out.println("Sorry, no match");
    }
}
