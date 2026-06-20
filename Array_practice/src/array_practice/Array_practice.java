package array_practice;
import java.util.Scanner;
public class Array_practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
      // Q1: 
//        float x = input.nextFloat();
//        float [] a = new float [6];
//        for (int i = 0 ; i < a.length ; i++){
//           a [i] =  input.nextFloat();
//        }
//        int c = 0;
//        for (int i = 0 ; i < a.length ; i++){
//          if  (a [i] ==  x)
//              c++;
//          
//              
//        }
//        System.out.println(c );
        
        
        
    // Q2:
    int [] a = new int [3];
    int [] b = new int [2];
    int [] c = new int [5];
    
    for (int i = 0 ; i < a.length ; i++){
        a [i] = input.nextInt();
    }
    for (int i = 0 ; i < b.length ; i++){
        b[i] = input.nextInt();
    }
    for (int i = 0 ; i < a.length ; i++){
        c[i] = a[i];
    }
    for (int i = 0 ; i < b.length ; i++){
        c[a.length+i] = b[i];
   
    }
        System.out.println("---------------");
    for (int i = 0; i < (c.length) ; i++){
        System.out.print(c[i] + "   ");
        
    }
    
}
}
