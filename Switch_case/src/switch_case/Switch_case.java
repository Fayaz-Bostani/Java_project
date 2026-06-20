package switch_case;
import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        
        int age = 18;
        int grade = 1;
        double position = 10;
        if (age > 14 && grade++ < 6 && position > 7 ){
        } System.out.println(grade);
        
        
        
  // Switch case    -------------------------------------------------------  
        System.out.println("Enter your favorite food: ");
        System.out.println("[1] Boolani");
        System.out.println("[2] Ashak");
        System.out.println("[3] Qabeli");
        System.out.println("[4] Mantu");
        
        int food = input.nextInt();
        switch (food){
            case 1:
                System.out.println("your favorite food is Boolani");
                break;
            case 2:
                System.out.println("your favorite food is Ashak");
                break;
            case 3:
                System.out.println("your favorite food is Qabeli");
                break;
            case 4:
                System.out.println("your favorite food is Mantu");
                break;
                
                
    // نکته : در صورتیکه بریک ندهیم تمامی کیس ها اجرا میشوند.    
    // نکته : برای کیس ها فقط قیمت های مشخص مثل عدد کرکتر و یک متحول ثابت داده میتوانیم 
        }
        
        
        
  
        
        
        
        
   }
    
}
