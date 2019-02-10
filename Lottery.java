//devolop a program to play lottery
//the program randomly generates a lottery of two-digit number, prompts the user
//to enter a two-digit number, and determines whether the user
// wins according to:


public class Lottery{
  public static void main(String[] args){

    //the program randomly generates a lottery of two-digit number,
    int  lottery = (int) (Math.random()*100);


    //prompt the user to enter a two digit randNumber
     int lotteryDigit1 = lottery / 10;
     int lotteryDigit2 = lottery % 10;

     System.out.println("The numbers generated: "+ lotteryDigit1+" , "+ lotteryDigit2 );




  }
}
