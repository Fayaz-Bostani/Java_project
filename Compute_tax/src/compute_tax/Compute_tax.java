package compute_tax;

import java.util.Scanner;

public class Compute_tax {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
        System.out.println("Enter your the filling status: ");
        System.out.println("[0]   Business owner");
        System.out.println("[1]    Government employee");
        System.out.println("[2]     Freelancer");
        System.out.println("[3]      Professional");
        System.out.println("[4]      Labor worker");
        System.out.println("");
        int status = input.nextInt();
        if (status > 4)    System.out.println("invalid status");
        else {
        System.out.println("Enter the taxable income: ");
        double income = input.nextDouble();
        double tax = 0;
        
        if (status == 0){
             if (income <= 30000)            tax = income * 0.10;
             else if (income <= 500000)         tax = (50000 * 0.10 + (income - 50000) * 0.15);
             else if (income <= 100000)          tax = (50000 * 0.10  + 100000 * 0.15  + (income - 100000) * 0.25);
             else        tax = (50000 * 0.10  + 100000 * 0.15  + 500000 * 0.25 + (income - 500000) * 0.30);
            }
 
        
        else if (status == 1){
             if (income <= 50000)            tax = income * 0.10;
             else if (income <= 100000)         tax = (50000 * 0.10 + (income - 50000) * 0.15);
             else if (income <= 500000)          tax = (50000 * 0.10  + 100000 * 0.15  + (income - 100000) * 0.25);
             else        tax = (50000 * 0.10  + 100000 * 0.15  + 500000 * 0.25 + (income - 500000) * 0.30);
            }
  
        
        else if (status == 2){
             if (income <= 30000)            tax = income * 0.10;
             else if (income <= 500000)         tax = (50000 * 0.10 + (income - 50000) * 0.15);
             else if (income <= 200000)          tax = (50000 * 0.10  + 100000 * 0.15  + (income - 100000) * 0.25);
             else        tax = (50000 * 0.10  + 100000 * 0.15  + 500000 * 0.25 + (income - 500000) * 0.30);
            }
    
        
        if (status == 3){
             if (income <= 50000)            tax = income * 0.10;
             else if (income <= 100000)         tax = (50000 * 0.10 + (income - 50000) * 0.15);
             else if (income <= 200000)          tax = (50000 * 0.10  + 100000 * 0.15  + (income - 100000) * 0.25);
             else        tax = (50000 * 0.10  + 100000 * 0.15  + 500000 * 0.25 + (income - 500000) * 0.30);
            }
        
        
     
        else if (status == 4)  {
             if (income <= 10000)            tax = 0;
             else if (income <= 20000)         tax = income * 0.10 ;
             else if (income <= 30000)          tax = (20000 * 0.10   + (income - 20000) * 0.15);
             else        tax = (20000 * 0.10  + 300000 * 0.15  +  (income - 30000) * 0.20);
            }
        
        
        System.out.println("your tax from " + income + " AF is   " + tax);
        
        
        
        }
    }
    
}
