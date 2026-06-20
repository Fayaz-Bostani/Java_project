package current_time;
public class Current_time {
    public static void main(String[] args) {
    long total_Milliseconds  =  System.currentTimeMillis();
   long total_seconds =  total_Milliseconds  / 1000;
   long current_second = total_seconds % 60 ;
   long total_minutes = total_seconds / 60 ;
   long current_minute = total_minutes % 60 ;
   long total_hours =  total_minutes / 60 ;
   long current_hour = total_hours % 24;
        System.out.println("the current time is: " + current_hour + ":" + current_minute + ":" + current_second + " GMT");
        
        System.out.println(" the current time in AFG is: " + (current_hour + 4) + ":" + (current_minute + 30) + ":" + current_second );
        
        //  نکته : اختلاف زمانی بین سیستم جی ام تی و افغانستان ..... چهار ساعت و سی دقیقه افغانستان جلوتر است 
        
   
   
   
    }
    
}
