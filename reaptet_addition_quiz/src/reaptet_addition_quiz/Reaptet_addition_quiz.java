package reaptet_addition_quiz;

import java.util.Scanner;

public class Reaptet_addition_quiz {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int number1 = (int) (Math.random() * 10);
     int number2 = (int) (Math.random() * 10);
        System.out.print("what is " + number1 + " + " + number2 + " =? ");
        int answer = input.nextInt();
        while (answer != number1 + number2){
            System.out.print("wrong answer , " + "what is " + number1 +" + " + number2 + " =? ");
                    answer = input.nextInt() ;
        }
        System.out.println("you got it congratulations ");
    }
    
}
