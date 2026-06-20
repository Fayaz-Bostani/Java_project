package subtractquiz;

import java.util.Scanner;

public class Subtractquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
       int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
       int number2 = input.nextInt();
       
       if (number2 > number1){
           int temp = number1;
           number1 = number2;
           number2 = temp;
       }
        System.out.print("what is the answer of " + number1 + " - " +number2 + " ? ");
        int answer = input.nextInt();
        if (number1 - number2  == answer) 
            System.out.println("your answer is right. ");
        else 
            System.out.println("your answer is wrong  " + number1 + " - " + number2 + " =  " +( number1 - number2 ));
   
    }
    
}
