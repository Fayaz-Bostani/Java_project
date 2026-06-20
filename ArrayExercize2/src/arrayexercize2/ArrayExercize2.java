package arrayexercize2;

import java.util.Scanner;

public class ArrayExercize2 {
    public static void main(String[] args) {
   Scanner input = new Scanner(System.in);
   
   // Q1:
//   int counter = 0;
//   double[] array = new double [5];
//   double number = input.nextDouble();
//   for (int i = 0; i < array.length; i++){
//       array[i] = input.nextDouble();
//       if (array[i] == number)
//           counter++;
//               }
//        System.out.println("--------");
//        System.out.println(counter);



   // Q2:
//    int [] a = new int [4]; 
//    int [] b = new int [3]; 
//    int [] c = new int [7];
//    
//   for (int i = 0; i < a.length; i++)
//       a[i] = input.nextInt();
//        System.out.println("--------------");
//
//   for (int i = 0; i < b.length; i++)
//       b[i] = input.nextInt();
//        System.out.println("--------------");
   
//   for (int i = 0; i < a.length ; i++)
//       c[i] = a[i];
//    for (int i = 0; i < b.length ; i++)
//        c[a.length + i] = b[i];
//    for (int i = 0; i < c.length; i++)
//        
//        System.out.println(c[i]);
    
    
    
    //  Second way:
//    int [] a = new int [4]; 
//    int [] b = new int [3]; 
//    int [] c = new int [7];
//    
//   for (int i = 0; i < a.length; i++)
//       a[i] = input.nextInt();
//        System.out.println("--------------");
//
//   for (int i = 0; i < b.length; i++)
//       b[i] = input.nextInt();
//        System.out.println("--------------");
//        
//    for (int i = 0; i < c.length ; i++){
//        if (i < a.length)
//            c[i] = a[i];
//        else 
//            c[i] = b[i-a.length];
//    }
//    for (int i = 0; i < c.length ; i++)
//        System.out.println(c[i]);



     // Q3:
     int [] a = new int [4]; 
    int [] b = new int [3]; 
    int [] c = new int [a.length];
    int k = 0;
    
   for (int i = 0; i < a.length; i++)
       a[i] = input.nextInt();
        System.out.println("--------------");

   for (int i = 0; i < b.length; i++)
       b[i] = input.nextInt();
        System.out.println("--------------");
        
        
   for (int i = 0 ; i < a.length ; i++){
       boolean namosavi = true;
       for (int j = 0 ; j<b.length ; j++){
           if (a[i] == b[j])   namosavi = false;
           
       }
       if (namosavi)
           c[k] = a[i];
       k++;
   }
   for (int i = 0 ; i< k ; i++)
       System.out.println(c[i]);
    
    
    
    }
    
}
