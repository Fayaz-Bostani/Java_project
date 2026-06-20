package chapter_10_exercizes;

public class Chapter_10_Exercizes {
   
    public static void main(String[] args) {
        
        //   10.1
        
//        The Time class) Design a class named Time. The class contains:
//■
//■ The data fields hour, minute, and second that represent a time.
//■
//■ A no-arg constructor that creates a Time object for the current time. (The 
//values of the data fields will represent the current time.)
//402  Chapter 10  Object-Oriented Thinking
//■
//■ A constructor that constructs a Time object with a specified elapsed time 
//since midnight, January 1, 1970, in milliseconds. (The values of the data 
//fields will represent this time.)
//■
//■ A constructor that constructs a Time object with the specified hour, minute, 
//and second.
//■
//■ Three getter methods for the data fields hour, minute, and second, 
//respectively.
//■
//■ A method named setTime(long elapseTime) that sets a new time for the 
//object using the elapsed time. For example, if the elapsed time is 555550000 
//milliseconds, the hour is 10, the minute is 19, and the second is 10.
//Draw the UML diagram for the class then implement the class. Write a 
//test program that creates three Time objects (using new Time(), new 
//Time(555550000), and new Time(5, 23, 55)) and displays their hour, 
//minute, and second in the format hour:minute:second.
//(Hint: The first two constructors will extract the hour, minute, and second 
//from the elapsed time. For the no-arg constructor, the current time can be 
//obtained using System.currentTimeMillis(), as 
//
// public class Time {
//
//    private int hour;
//    private int minute;
//    private int second;
//
//    // No-arg constructor
//    public Time() {
//        setTime(System.currentTimeMillis());
//    }
//
//    // Constructor with elapsed time
//    public Time(long elapsedTime) {
//        setTime(elapsedTime);
//    }
//
//    // Constructor with hour, minute, second
//    public Time(int hour, int minute, int second) {
//        this.hour = hour;
//        this.minute = minute;
//        this.second = second;
//    }
//
//    // Getters
//    public int getHour() {
//        return hour;
//    }
//
//    public int getMinute() {
//        return minute;
//    }
//
//    public int getSecond() {
//        return second;
//    }
//
//    // Set time using elapsed milliseconds
//    public void setTime(long elapsedTime) {
//
//        long totalSeconds = elapsedTime / 1000;
//
//        second = (int)(totalSeconds % 60);
//
//        long totalMinutes = totalSeconds / 60;
//        minute = (int)(totalMinutes % 60);
//
//        long totalHours = totalMinutes / 60;
//        hour = (int)(totalHours % 24);
//    }
//}
// 
// public class TestTime {
//
//    public static void main(String[] args) {
//
//        Time t1 = new Time();
//
//        Time t2 = new Time(555550000);
//
//        Time t3 = new Time(5, 23, 55);
//
//        System.out.println(
//                t1.getHour() + ":" +
//                t1.getMinute() + ":" +
//                t1.getSecond());
//
//        System.out.println(
//                t2.getHour() + ":" +
//                t2.getMinute() + ":" +
//                t2.getSecond());
//
//        System.out.println(
//                t3.getHour() + ":" +
//                t3.getMinute() + ":" +
//                t3.getSecond());
//    }
//}
// 

    //   9.2
 
//    The BMI class) Add the following new constructor in the BMI class:
///** Construct a BMI with the specified name, age, weight, 
//* feet, and inches
//*/
//public BMI(String name, int age, double weight, double feet,
//double inches)
//        
//        public class BMI {
//
//    private String name;
//    private int age;
//    private double weight;
//    private double height;
//
//    public BMI(String name, int age, double weight, double height) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
//    }
//
//    /** Construct a BMI with the specified name, age, weight,
//     * feet, and inches
//     */
//    public BMI(String name, int age, double weight,
//               double feet, double inches) {
//        this(name, age, weight, feet * 12 + inches);
//    }
//
//    public double getBMI() {
//        final double KILOGRAMS_PER_POUND = 0.45359237;
//        final double METERS_PER_INCH = 0.0254;
//
//        double bmi = weight * KILOGRAMS_PER_POUND /
//                ((height * METERS_PER_INCH) *
//                 (height * METERS_PER_INCH));
//
//        return Math.round(bmi * 100) / 100.0;
//    }
//
//    public String getStatus() {
//        double bmi = getBMI();
//
//        if (bmi < 18.5)
//            return "Underweight";
//        else if (bmi < 25)
//            return "Normal";
//        else if (bmi < 30)
//            return "Overweight";
//        else
//            return "Obese";
//    }
//}


  // 10.4


//   The MyPoint class) Design a class named MyPoint to represent a point with 
//x- and y-coordinates. The class contains:
//■
//■ The data fields x and y that represent the coordinates with getter methods.
//■
//■ A no-arg constructor that creates a point (0, 0).
//■
//■ A constructor that constructs a point with specified coordinates.
//■
//■ A method named distance that returns the distance from this point to a 
//specified point of the MyPoint type.
//Programming Exercises  403
//■■A method named distance that returns the distance from this point to 
//another point with specified x- and y-coordinates.
//■■A static method named distance that returns the distance from two MyPoint 
//objects.
//Draw the UML diagram for the class then implement the class. Write a test 
//program that creates the two points (0, 0) and (10, 30.5) and displays the dis
//tance between them.
//VideoNote
//The MyPoint class
//Enter an id: 4 
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 1  
//The balance is 100.0
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 2  
//Enter an amount to withdraw: 3  
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 1  
//The balance is 97.0
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 3  
//Enter an amount to deposit: 10  
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 1  
//The balance is 107.0
//Main menu
//1: check balance
//2: withdraw
//3: deposit
//4: exit
//Enter a choice: 4  
//Enter an id: 
//
// public class MyPoint {
//
//    private double x;
//    private double y;
//
//    public MyPoint() {
//        this(0, 0);
//    }
//
//    public MyPoint(double x, double y) {
//        this.x = x;
//        this.y = y;
//    }
//
//    public double getX() {
//        return x;
//    }
//
//    public double getY() {
//        return y;
//    }
//
//    public double distance(MyPoint point) {
//        return Math.sqrt(
//                Math.pow(x - point.x, 2) +
//                Math.pow(y - point.y, 2));
//    }
//
//    public double distance(double x, double y) {
//        return Math.sqrt(
//                Math.pow(this.x - x, 2) +
//                Math.pow(this.y - y, 2));
//    }
//
//    public static double distance(MyPoint p1, MyPoint p2) {
//        return Math.sqrt(
//                Math.pow(p1.x - p2.x, 2) +
//                Math.pow(p1.y - p2.y, 2));
//    }
//}
// 
// public class TestMyPoint {
//
//    public static void main(String[] args) {
//
//        MyPoint p1 = new MyPoint();
//        MyPoint p2 = new MyPoint(10, 30.5);
//
//        System.out.println("Distance = " +
//                p1.distance(p2));
//
//        System.out.println("Distance = " +
//                MyPoint.distance(p1, p2));
//    }
//}


 
//   10.6

//  Display the prime numbers) Write a program that displays all the prime num
//bers less than 120 in decreasing order. Use the StackOfIntegers class to 
//store the prime numbers (e.g., 2, 3, 5, . . . ) and retrieve and display them in 
//reverse order.
//
//  public class DisplayPrimes {
//
//    public static void main(String[] args) {
//
//        StackOfIntegers stack = new StackOfIntegers();
//
//        for (int number = 2; number < 120; number++) {
//            if (isPrime(number)) {
//                stack.push(number);
//            }
//        }
//
//        while (!stack.empty()) {
//            System.out.print(stack.pop() + " ");
//        }
//    }
//
//    public static boolean isPrime(int number) {
//
//        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
//            if (number % divisor == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}


//  10.8

//  (Financial: the Tax class) Programming Exercise 8.12 writes a program for 
//computing taxes using arrays. Design a class named Tax to contain the follow
//ing instance data fields:
//■
//■ int filingStatus: One of the four tax-filing statuses: 0—single filer,  
//1—married filing jointly or qualifying widow(er), 2—married filing separately, 
//and 3—head of household. Use the public static constants SINGLE_FILER 
//(0), MARRIED_JOINTLY_OR_QUALIFYING_WIDOW(ER) (1), MARRIED_ 
//SEPARATELY (2), HEAD_OF_HOUSEHOLD (3) to represent the statuses.
//■
//■ int[][] brackets: Stores the tax brackets for each filing status.
//■
//■ double[] rates: Stores the tax rates for each bracket.
//■
//■ double taxableIncome: Stores the taxable income.
//Provide the getter and setter methods for each data field and the getTax() 
//method that returns the tax. Also, provide a no-arg constructor and the construc
//tor Tax(filingStatus, brackets, rates, taxableIncome).
//Draw the UML diagram for the class and then implement the class. Write a test 
//program that uses the Tax class to print the 2001 and 2009 tax tables for taxable 
//income from $50,000 to $60,000 with intervals of $1,000 for all four statuses. 
//The tax rates for the year 2009 were given in Table 3.2. The tax rates for 2001 
//are shown in Table 10.1.
//tabLe 10.1  2001 U.S. Federal Personal Tax Rates
//Tax Rate Single Filers
//Married—Filing Jointly 
//or Qualifying Widow(er)
//Married—Filing 
//Separately
//Head of Household
//15%
//27.5%
//30.5%
//35.5%
//39.1%
//Up to $27,050
//$27,051–$65,550
//$65,551–$136,750
//Up to $45,200
//$45,201–$109,250
//$109,251–$166,500
//$136,751–$297,350 $166,501–$297,350
//$297,351 or more
//$297,351 or more
//Up to $22,600
//$22,601–$54,625
//$54,626–$83,250
//Up to $36,250
//$36,251–$93,650
//$93,651–$151,650
//$83,251–$148,675 $151,651–$297,350
//$ 148,676 or more
//$297,351 or more
//
//
//  public class Tax {
//
//    public static final int SINGLE_FILER = 0;
//    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOWER = 1;
//    public static final int MARRIED_SEPARATELY = 2;
//    public static final int HEAD_OF_HOUSEHOLD = 3;
//
//    private int filingStatus;
//    private int[][] brackets;
//    private double[] rates;
//    private double taxableIncome;
//
//    public Tax() {
//    }
//
//    public Tax(int filingStatus, int[][] brackets,
//               double[] rates, double taxableIncome) {
//        this.filingStatus = filingStatus;
//        this.brackets = brackets;
//        this.rates = rates;
//        this.taxableIncome = taxableIncome;
//    }
//
//    public int getFilingStatus() {
//        return filingStatus;
//    }
//
//    public void setFilingStatus(int filingStatus) {
//        this.filingStatus = filingStatus;
//    }
//
//    public int[][] getBrackets() {
//        return brackets;
//    }
//
//    public void setBrackets(int[][] brackets) {
//        this.brackets = brackets;
//    }
//
//    public double[] getRates() {
//        return rates;
//    }
//
//    public void setRates(double[] rates) {
//        this.rates = rates;
//    }
//
//    public double getTaxableIncome() {
//        return taxableIncome;
//    }
//
//    public void setTaxableIncome(double taxableIncome) {
//        this.taxableIncome = taxableIncome;
//    }
//
//    public double getTax() {
//
//        double tax = 0;
//        int[] bracket = brackets[filingStatus];
//
//        for (int i = rates.length - 1; i > 0; i--) {
//            if (taxableIncome > bracket[i - 1]) {
//                tax += (taxableIncome - bracket[i - 1]) * rates[i];
//                taxableIncome = bracket[i - 1];
//            }
//        }
//
//        tax += taxableIncome * rates[0];
//
//        return tax;
//    }
//}
//  
//  
//  public class TestTax {
//
//    public static void main(String[] args) {
//
//        int[][] brackets2001 = {
//                {27050, 65550, 136750, 297350},
//                {45200, 109250, 166500, 297350},
//                {22600, 54625, 83250, 148675},
//                {36250, 93650, 151650, 297350}
//        };
//
//        double[] rates2001 = {
//                0.15, 0.275, 0.305, 0.355, 0.391
//        };
//
//        int[][] brackets2009 = {
//                {8350, 33950, 82250, 171550, 372950},
//                {16700, 67900, 137050, 208850, 372950},
//                {8350, 33950, 68525, 104425, 186475},
//                {11950, 45500, 117450, 190200, 372950}
//        };
//
//        double[] rates2009 = {
//                0.10, 0.15, 0.25, 0.28, 0.33, 0.35
//        };
//
//        System.out.println("2001 Tax Tables");
//        printTable(brackets2001, rates2001);
//
//        System.out.println("\n2009 Tax Tables");
//        printTable(brackets2009, rates2009);
//    }
//
//    public static void printTable(int[][] brackets,
//                                  double[] rates) {
//
//        System.out.printf("%10s%12s%12s%12s%12s%n",
//                "Income", "Single", "MarriedJ",
//                "MarriedS", "Head");
//
//        for (int income = 50000; income <= 60000; income += 1000) {
//
//            System.out.printf("%10d", income);
//
//            for (int status = 0; status < 4; status++) {
//
//                Tax tax = new Tax(status, brackets,
//                        rates, income);
//
//                System.out.printf("%12.2f",
//                        tax.getTax());
//            }
//
//            System.out.println();
//        }
//    }
//}
 
  
     
    }
    
}
