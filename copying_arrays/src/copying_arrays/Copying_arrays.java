package copying_arrays;
public class Copying_arrays {
    public static void main(String[] args) {                               /*
    int[] sorce_array = {12, 13, 15, 22, 42, 76};
    int [] target_array = new int [sorce_array.length];
    for (int i = 0 ; i< sorce_array.length ; i++)
        target_array[i] = sorce_array[i];
        System.out.print("{ ");
    for (int i = 0; i< target_array.length ; i++)
        System.out.print( target_array[i] + ", " );
        System.out.println("}");                                                      */
        
        
        
        int [] sorce_array = {25 , 40 , 55, 60 , 75, 90};
        int [] target_array = new int[sorce_array.length];
        System.arraycopy(sorce_array, 1, target_array, 0, 3);
             for (int num: target_array)
             System.out.print(num +" ");
            System.out.println(" ");
             
             
             
             
             
         int [] sourc_array = {10 , 30 , 50 , 20 , 70};
         int [] Target_array = {65 , 25 , 95 , 105};
         System.arraycopy(sourc_array, 0, Target_array, 2, 2);
         for (int Num: Target_array)
             System.out.print(Num + " ");
    }
    
}
