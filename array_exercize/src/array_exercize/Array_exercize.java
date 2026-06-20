package array_exercize;
import java.util.Scanner;
public class Array_exercize {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q1:
//        System.out.print("Enter your number: ");
//        int count = 0;
//        double x = input.nextDouble();
//        double [] a = new double [5];
//        for (int i = 0; i < a.length ; i++){
//            a[i] = input.nextDouble();
//            if (a[i] == x)
//                count++;
//        }
//        System.out.println(count);



//  Q2:

//     float [] a = new float [4];
//     float [] b = new float [3];
//     float [] c = new float [7];
//     for (int i = 0 ; i < a.length ; i++)
//         a[i] = input.nextFloat();
//     
//     for (int i = 0 ; i < b.length ; i++)
//         b[i] = input.nextFloat();
//     
//     for (int i = 0; i < a.length ; i++)
//         c[i] = a[i];
//     for (int i = 0 ; i < b.length ; i++)
//         c[i+a.length] = b[i];
//     
//        System.out.println("------------------");
//     
//      for (int i = 0 ; i < c.length ; i++)
//     System.out.println(c[i]);
      
      
      // second way : very hard : 
      
//      for (int i = 0 ; i < a.length ; i++)
//         a[i] = input.nextFloat();
//     
//     for (int i = 0 ; i < b.length ; i++)
//         b[i] = input.nextFloat();
//     
//     for (int i = 0; i < c.length ; i++)
//        if (i < a.length)
//            c[i] = a[i];
//        else 
//            c[i] =  b[i - a.length];
//     
//        System.out.println("------------------");
//     
//      for (int i = 0 ; i < c.length ; i++)
//     System.out.println(c[i]);



//  Q3:
    
//     int [] a = new int [5];
//     int [] b = new int[5];
//     int [] c = new int [a.length] ;
//     int k = 0;
//     for (int i = 0; i < a.length ; i++)
//         a[i] = input.nextInt();
//        System.out.println("------------------------");
//     for (int i = 0; i < b.length ; i++)
//         b[i] = input.nextInt();
//          System.out.println("------------------------");
//     for (int i = 0; i < a.length ; i++){
//         boolean namosavi = true;
//         for (int j = 0; j < b.length ; j++){
//             if (a[i] == b[j])  namosavi = false;
//                 
//         }
//         if (namosavi){
//             c[k] = a[i];
//             k++;
//         }
//     }
//             for (int i = 0; i < k ; i++)
//                 System.out.println(c[i]);


     // Q4: 
    
//     int [] a = new int [5];
//     int [] b = new int[5];
//     int [] c = new int [a.length] ;
//     int k = 0;
//     for (int i = 0; i < a.length ; i++)
//         a[i] = input.nextInt();
//        System.out.println("------------------------");
//     for (int i = 0; i < b.length ; i++)
//         b[i] = input.nextInt();
//          System.out.println("------------------------");
//     for (int i = 0; i < a.length ; i++){
//         
//         for (int j = 0; j < b.length ; j++){
//             if (a[i] == b[j])  {
//                 c[k] = a[i];
//                 k++;
//             }
//                 
//         }
//     }
//             for (int i = 0; i < k ; i++)
//                 System.out.println(c[i]);
    
             
             
             
     // Q5:         
//     int [] a = new int [5];
//     int [] b = new int[5];
//     int [] c = new int [a.length + b.length] ;
//     int k = 0;
//     for (int i = 0; i < a.length ; i++)
//         a[i] = input.nextInt();
//        System.out.println("------------------------");
//     for (int i = 0; i < b.length ; i++)
//         b[i] = input.nextInt();
//          System.out.println("------------------------");
//          
//
//     for (int i = 0; i < a.length ; i++){
//         boolean namosavi = true;
//         for (int j = 0; j < b.length ; j++){
//             if (a[i] == b[j])  namosavi = false;
//                 
//         }
//         if (namosavi){
//             c[k] = a[i];
//             k++;
//         }
//     }
//
//     for (int i = 0; i < b.length ; i++){
//         boolean namosavi = true;
//         for (int j = 0; j < a.length ; j++){
//             if (b[i] == a[j])  namosavi = false;
//                 
//         }
//         if (namosavi){
//             c[k] = b[i];
//             k++;
//         }
//     }
//             for (int i = 0; i < k ; i++)
//                 System.out.println(c[i]);




     // Q6:
//   int [] a = new int [3];
//   int [] b = new int [3];
//   boolean Exist = true; 
//   
//     for (int i = 0; i < a.length ; i++)
//         a[i] = input.nextInt();
//        System.out.println("------------------------");
//     for (int i = 0; i < b.length ; i++)
//         b[i] = input.nextInt();
//          System.out.println("------------------------");
//          
//          
//         
//       for (int i = 0 ; i < a.length ; i++){
//           boolean exist = false;
//           for (int j = 0 ; j< b.length ; j++){
//               if (a[i] == b[j])
//                   exist = true;
//               
//           }
//           if (!exist) {
//               Exist = false;
//               break;
//           } 
//       }
//       if (Exist) System.out.println("true");
//       else     System.out.println("false");
       
       
       
       
   int [] a = new int [5];
   int [] b = new int [a.length];
   int x = input.nextInt();
   int y = input.nextInt();

     for (int i = 0; i < a.length ; i++)
         a[i] = input.nextInt();
        System.out.println("------------------------");
        
        for (int i = x ; i <y ; i++)
            b[i] = a[i];
        
        for (int i = x ; i <=y ; i++)
            System.out.println(b[i]);
        
        
   
          
                  
          
              
              
         
   
            
   

     





     
    
       
     
    }
   
    
}
