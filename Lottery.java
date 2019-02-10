//devolop a program to play lottery
//the program randomly generates a lottery of two-digit number, prompts the user
//to enter a two-digit number, and determines whether the user
// wins according to:

import java.util.Scanner;
public class Lottery{
  public static void main(String[] args){

    //the program randomly generates a lottery of two-digit number,
    int  lottery = (int) (Math.random()*100);


    //prompt the user to enter a two digit randNumber
    //this is like separting the digits
     int lotteryDigit1 = lottery / 10;
     int lotteryDigit2 = lottery % 10;

     //System.out.println("The numbers generated: "+ lotteryDigit1+" , "+
      //lotteryDigit2 );
      Scanner input = new Scanner(System.in);

      System.out.println("Enter a two digit number to win the Lottery:");
      int guess = input.nextInt();

      int guessDigit1 = guess / 10;
      int guessDigit2 = guess % 10;

      System.out.println("The lottery number is " + lottery);


      if (guess == lottery){
        System.out.print("Congratulations!, you have won the highest price: $10,000" +
        "the numbers you guessed are in the exact ordered as generated");
      }
      else if(guessDigit1 ==lotteryDigit1
      &&  guessDigit2 == lotteryDigit2){
        System.out.println("You guessed the digits, so you win $3000.00");
      }
      else if(guessDigit1 == lotteryDigit1
      || guessDigit1 == lotteryDigit1
      || guessDigit2 == lotteryDigit2
      || guessDigit2 == lotteryDigit2){
        System.out.println("You guessed a number, of two possible. You win $1,000");
      }
      else {
        System.out.println("Sorry, no match");
      }






  }
}
