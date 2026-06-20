package compute_change;

import java.util.Scanner;

public class Compute_change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // this program gets a money amount (in dollar)   and changes it to america currency denominations
        // 100 cent = 1 dollar      25 cent = 1 quarter    10 cent = 1 dime     5 cent = nickel      1 cent = 1 penny
        
        System.out.print("Enter a decimal amount: ");         //  = dollar 
        double amount = input.nextDouble();
        int remaining_amount =  (int)(amount * 100) ;             //      remaing_amount = remaining_cents
        int dollars = (remaining_amount / 100) ;
        remaining_amount = remaining_amount % 100 ;
        int quarters = remaining_amount / 25;
        remaining_amount = remaining_amount % 25 ;
        int dimes = remaining_amount / 10 ; 
        remaining_amount = remaining_amount % 10;
        int nickels = remaining_amount % 5;
        remaining_amount = remaining_amount  % 5 ;
        int pennies = remaining_amount;
        
        System.out.println(" your amount " + amount + " Dollars consist of: ");
        System.out.println("          "+ dollars + " dollars");
        System.out.println("          " + quarters + " quarters");
        System.out.println("          " + dimes + " dimes");
        System.out.println("          " + nickels + " nickels");
        System.out.println("          " + pennies + " pennies");
        
        

    }
    
}
