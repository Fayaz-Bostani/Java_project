package array_book;

import java.util.Scanner;

public class Array_book {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
//         7.2.4       
  /*  int x = 30;
    int [] numbers = new int[x];
    x = 60;
        System.out.println("x is:" +x);
        System.out.println("the size of the array is:" + numbers.length);      */
  
     // 7.2.6
//      Finding smallest index of the largest element 
    /*    int [] array = {23 , 44 , 55, 10 ,  55};
    int max = array[0];
    int smallestindex  = 0;
    for (int i = 1 ; i < array.length ; i++){
        if (array[i] > max) {    max = array[i];
        smallestindex = i;
        }
    }
        System.out.println(smallestindex);       */
    
    
    // Random shafalling
    int [] array = {23 , 44 , 55, 10 ,  55};
    for (int i = array.length - 1 ; i > 0 ; i--){
        int j = (int) (Math.random() * array.length);
        
        
    int temp = array[i];
    array[i] = array[j];
    array][j] = temp;
    }
    
    
    
     
     
        
        
       // 7.2.8
       /*
       double [] array = new double[10];
       array[0] = 9;
       double  sum = array[0] , sum2 = array[0];
       double min = array[0];
     
       for (int i=1; i<array.length ; i++){
           System.out.print("enter the value for index " + i + ":");
           array[i] = input.nextInt();
       sum += array[i];
       sum2 = array[0] + array[1];
       if (array[i] < min)     min = array[i];
       }
       
        System.out.println(sum);
        System.out.println(min);
        System.out.println(sum2);
       int random_index = (int) (Math.random() * 10);
        System.out.println(array[random_index]);            */
       
       
       
       // 7.2.11
       
    }
    
}
