package chinese_zodiac;

import java.util.Scanner;

public class Chinese_Zodiac {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        switch (year % 12){
            case 0:
                System.out.println("Monkey");
                
            case 1:
                System.out.println("donkey");
                
            case 2:
                System.out.println("horse");
                
            case 3:
                System.out.println("goat");
                
            case 4:
                System.out.println("sheep");
                
            case 5:
                System.out.println("lion");
                
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("wolf");
                break;
            case 8:
                System.out.println("dog");
                break;
            case 9:
                System.out.println("pig");
                break;
            case 10:
                System.out.println("rat");
                break;
            case 11:
                System.out.println("Mouse");
                break;
        }
    
    
    }
    
}
