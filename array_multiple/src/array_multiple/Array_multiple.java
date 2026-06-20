package array_multiple;
public class Array_multiple {
    public static void main(String[] args) {
        
        double [][] Numbers = new  double [3][4] ;
        Numbers [2][2] = 8;
        Numbers [1][3] = 8;
        System.out.println(Numbers[1][3]);
        
        
        
        
        double [][] numbers = {
                     { 12 , 45 , 76.8 , 99},
                     { 74.90 , 65 , 132 , 55},
                     {27 , 85.9 , 10 , 5.99}
                              };
        for (int row = 0; row < 3 ; row++){
            for (int col = 0 ; col < 4 ; col++){
                System.out.print(numbers[row][col] + "   ");
            }
            System.out.println("");
        }
        
        
        
        
        
        
        int [][] nums = {
                     {1 , 2 , 3 , 4},
                     {5 , 6 , 7 , 8},
                     {9 , 0 , 10 , 11}
                              };
        
        for (int [] num : nums){
            for (int n : num){
                System.out.print(n + "   ");
            }
            System.out.println("");
        }
        
        
        
        // Jagged Array    (آرایه دندانه دار):
        
        int [][] array = new int [3][];
        array [1] = new int [4];
        array [2] = new int [3];
        array [0] = new int [3];
        array [2][2] = 90;
        System.out.println(array [2][2]);
       
    
    
    
    
    
    
    
    
    } 
    
}
