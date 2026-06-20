package array;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 int [] numbers = {1 , 2 , 3 , 4 , 5};
        System.out.println(numbers[2]); 
        
        
   int [] Numbers = new int[5];
   Numbers[0] = 15;
   Numbers[1] = 20;
   Numbers[2] = 40;
   Numbers[3] = 10;
   Numbers[4] = 5;
        System.out.println(Numbers[2]);
        
        
        
  int [] Nambers = new int [5];
  double division;
  int sum = 0;
  for (int i = 0 ; i < Nambers.length; i++ ){
      System.out.print("Enter value to the array: ");
      Nambers[i] = input.nextInt();
      sum += Nambers[i];
  }
  division = (double)sum/Nambers.length;
        System.out.println(division);
        
        
        System.out.println("");     
        
   // For each : برای گردش روی عناصر آرایه ها مورد استفاده قرار میگیرد . 
   double [] Aadad = {13.5 , 49 , 87.6 , 59.1};
   for (double t : Aadad){
       t *= 3;
       System.out.println(t);
   }
        
        
        
        
      
   
    }
    
}
