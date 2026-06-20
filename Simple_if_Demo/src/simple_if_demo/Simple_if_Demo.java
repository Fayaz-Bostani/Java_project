package simple_if_demo;

import java.util.Scanner;

public class Simple_if_Demo {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
        System.out.print("Ente a number: ");
        int number = input.nextInt();
        
        if (number % 5 == 0)
            System.out.println("Hi five");
       if (number % 2 == 0)
            System.out.println("Hi even");
   
   
        
    }
    
}
