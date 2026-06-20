package lottery;

import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
   int lottery = (int) (Math.random() * 100) ;
        System.out.print("Enter a two digit number: ");
        int guessnumber = input.nextInt();
        int lottery_digit_1 = lottery / 10;
        int lottery_digit_2 = lottery % 10;
        int guess_digit_1 = guessnumber / 10;
        int guess_digit_2 = guessnumber % 10;
        System.out.println("lottery number = " + lottery);
        
        if (lottery == guessnumber)
            System.out.println("Exact Mathch , you rewarded 10000$" );
        else if (lottery_digit_1 == guess_digit_2  && lottery_digit_2 == guess_digit_1)
            System.out.println("Matched all digits ... you rewarded 3000$ ");
        else if (lottery_digit_1 == guess_digit_1  || lottery_digit_1 == guess_digit_2  
                || lottery_digit_2 == guess_digit_1 || lottery_digit_2 == guess_digit_1)
            System.out.println("Mathced 1 .. you rewarded 1000$ ");
        else 
            System.out.println("sorry no match ");
    }
    
}
