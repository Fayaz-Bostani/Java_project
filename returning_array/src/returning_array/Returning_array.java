package returning_array;
public class Returning_array {
    public static void main(String[] args) {
      /* int [] list1 = {1,2,3,4,5,6};
       int [] list2 =  reverse(list1);
       for (int num: list2)
           System.out.print(num + " ");    */
       
       
          int [ ] array = {10 , 20 , 30 , 40};
        for (int i = 0 , j = array.length - 1 ; i < array.length ; i++ , j--){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            
        }
        for (int i = 0 ; i< array.length ; i++)
         System.out.println(array[i]);
        
    }
    /*
    public static int [] reverse(int [] list){
        int [] result = new int [list.length];
        for (int i = 0 ,j = list.length -1 ; i < list.length ; i++ , j--){
        result[j] = list[i];
        }
        return result;       
    } */
        
        
        
        
     
    
}
