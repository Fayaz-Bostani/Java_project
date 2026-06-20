package subtract_quiz_loop;

import java.util.Scanner;

public class Subtract_Quiz_loop {
    public static void main(String[] args) {
        final int number_of_questions = 5;
        int count = 0;
        int correct_count = 0;
        long start_time = System.currentTimeMillis();
        Scanner input = new Scanner(System.in);
        while(count < number_of_questions){
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number2 > number1){
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }
            
            System.out.print("what is " + number1 + " - "+ number2 + " =? ");
            int answer = input.nextInt();
            if (number1 - number2 == answer){
                System.out.println("you are right");
            correct_count++;
            }
            else 
                System.out.println("wrong answer " + number1 + " - " + number2 + " = " +( number1 - number2));
                count++;     
        } 
        long endtime = System.currentTimeMillis();
        long tastetime = endtime - start_time; 
    
        System.out.println("currect count is " + correct_count + " \n taste time is " + tastetime / 1000 + " seconds ");
    }
    
   
}
