package passing_two_dominsional_array_to_methods;

import java.util.Scanner;

public class Passing_two_dominsional_array_to_Methods {
    public static void main(String[] args) {
        
        /*    
        int [][] array = get_array();
        System.out.println("The sum of all elements is: " + sum(array));
    }
    public static int [][] get_array(){
        Scanner input = new Scanner(System.in);
        
        int [][] array = new int [3][4];
        for (int row = 0 ; row < array.length ; row++){
            for (int colomn = 0 ; colomn < array[row].length ; colomn++){
                array [row][colomn] = input.nextInt();
            }
            System.out.println("");
        }
        return array;
    }
      public static int  sum(int [][] array){
          int total = 0;
          
        for (int row = 0 ; row < array.length ; row++){
            for (int colomn = 0 ; colomn < array[row].length ; colomn++){
             total   += array[row][colomn]; 
      }
}
        return total;                                          */
        
        
        
        int [][] array = {
                          {1,2,3,4},
                          {5,6,7,8}
                                };
         int [] result = get_array_size(array);
        System.out.println(result[0]);
        System.out.println(result[1]);
      }
      public static int [] get_array_size(int [][]array){
          int[] result = new int [2];
          result[0] = array.length;
          result[1] = array[0].length;
          return result;
          
      }
}
