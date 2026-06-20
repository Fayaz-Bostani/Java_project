/*   package passing_array;
public class Passing_array {
    public static void main(String[] args) {
        
       print_array();
    }
    public static void print_array(){
        int [] array = {1,2,3,4,5,6,7};
        for (int num:array)
            System.out.print(num + " ");
        
    }
    
}                                */




/*
package passing_array;

import java.util.Scanner;

public class Passing_array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        
       print_array(array);
    }
    public static void print_array(int [] array){
        for (int num:array)
            System.out.print(num + " ");                    */

        

//    Anonymous array: 

package passing_array;
public class Passing_array {
    public static void main(String[] args) {
       print_array(new int[] {1,2,3,4,5});
    }
    public static void print_array(int [] array){
        for (int num:array)
            System.out.print(num + " ");                    

    }
    
}
