package sale_tax;

import java.util.Scanner;

public class Sale_tax {
    public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  
        System.out.println("Enter the purchase amount: ");
        double purchase_amount = input.nextDouble();
        double tax = purchase_amount  * 0.06;         //    malyat  6% hesab shoda 
        System.out.println("the sale tax is: "  + (int)(tax * 100) / 100.0);
    }
    
}
