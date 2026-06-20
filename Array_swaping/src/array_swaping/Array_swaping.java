package array_swaping;
public class Array_swaping {
    public static void main(String[] args) {
     int [] array = {5,10};
        System.out.println("before swap metod");
        System.out.println("array is { " + array[0] + "," + array[1] + " }");
        swap(array[0],array[1]);
        System.out.println("after swap method: ");
        System.out.println("array is { " + array[0] + "," + array[1] + " }");
        
        System.out.println("---------------------------------------");
    
        System.out.println("before swap do ta element awal metod");
        System.out.println("array is { " + array[0] + "," + array[1] + " }");
        swap_dota_element_awal(array);
        System.out.println("after swap dota element awal method: ");
        System.out.println("array is { " + array[0] + "," + array[1] + " }");
        
    }
        
         
        public static void swap(int n1 , int n2 ){
            int temp =  n1;
            n1 = n2;
            n2 = temp;   
        }
        
        
        public static void swap_dota_element_awal(int array[]){
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
        }
     
    }
    

