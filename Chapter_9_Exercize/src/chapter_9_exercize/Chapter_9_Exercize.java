package chapter_9_exercize;

public class Chapter_9_Exercize {

    public static void main(String[] args) {
        
        //  9.1
     
//        The Rectangle class) Following the example of the Circle class in Section 9.2, 
//design a class named Rectangle to represent a rectangle. The class contains:
//■
//■ Two double data fields named width and height that specify the width and 
//height of the rectangle. The default values are 1 for both width and height.
//■
//■ A no-arg constructor that creates a default rectangle.
//■
//■ A constructor that creates a rectangle with the specified width and height.
//■
//■ A method named getArea() that returns the area of this rectangle.
//■
//■ A method named getPerimeter() that returns the perimeter.
//Draw the UML diagram for the class then implement the class. Write a test pro
//gram that creates two Rectangle objects—one with width 4 and height 40, and 
//
//public class Rectangle {
//    double width;
//    double height;
//
//    Rectangle() {
//        width = 1;
//        height = 1;
//    }
//
//    Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    double getArea() {
//        return width * height;
//    }
//
//    double getPerimeter() {
//        return 2 * (width + height);
//    }
//}
//
//Rectangle rectangle1 = new Rectangle(4, 40);
//Rectangle rectangle2 = new Rectangle(3.5, 35.9);
//
//System.out.println("Rectangle 1");
//System.out.println("Width: " + rectangle1.width);
//System.out.println("Height: " + rectangle1.height);
//System.out.println("Area: " + rectangle1.getArea());
//System.out.println("Perimeter: " + rectangle1.getPerimeter());
//
//System.out.println();
//
//System.out.println("Rectangle 2");
//System.out.println("Width: " + rectangle2.width);
//System.out.println("Height: " + rectangle2.height);
//System.out.println("Area: " + rectangle2.getArea());
//System.out.println("Perimeter: " + rectangle2.getPerimeter());


   //  9.2
 
//   The Stock class) Following the example of the Circle class in Section 9.2, 
//design a class named Stock that contains:
//■
//■ A string data field named symbol for the stock’s symbol.
//■
//■ A string data field named name for the stock’s name.
//■
//■ A double data field named previousClosingPrice that stores the stock 
//price for the previous day.
//■
//■ A double data field named currentPrice that stores the stock price for the 
//current time.
//■
//■ A constructor that creates a stock with the specified symbol and name.
//■
//■ A method named getChangePercent() that returns the percentage changed 
//from previousClosingPrice to currentPrice.
//Draw the UML diagram for the class then implement the class. Write a test pro
//gram that creates a Stock object with the stock symbol ORCL, the name  Oracle 
//Corporation, and the previous closing price of 34.5. Set a new current price to 
//34.35 and display the price-change percentage.
//
//  public class Stock {
//    String symbol;
//    String name;
//    double previousClosingPrice;
//    double currentPrice;
//
//    Stock(String symbol, String name) {
//        this.symbol = symbol;
//        this.name = name;
//    }
//
//    double getChangePercent() {
//        return ((currentPrice - previousClosingPrice)
//                / previousClosingPrice) * 100;
//    }
//}
//  
//  Stock stock = new Stock("ORCL", "Oracle Corporation");
//
//stock.previousClosingPrice = 34.5;
//stock.currentPrice = 34.35;
//
//System.out.println("Price Change Percentage: "
//        + stock.getChangePercent() + "%");


 //  9.3

//   Use the Date class) Write a program that creates a Date object, sets its elapsed 
//time to 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 
//10000000000, and 100000000000, and displays the date and time using the 
//toString() method, respectively.
//   
//   Date date = new Date();
//
//long[] times = {
//        10000L,
//        100000L,
//        1000000L,
//        10000000L,
//        100000000L,
//        1000000000L,
//        10000000000L,
//        100000000000L
//};
//
//for (int i = 0; i < times.length; i++) {
//    date.setTime(times[i]);
//    System.out.println(date.toString());
//}
//
//import java.util.Date;



//   9.4

//Use the Random class) Write a program that creates a Random object with seed 
//1000 and displays the first 50 random integers between 0 and 100 using the 
//nextInt(100) method.
//
//  Random random = new Random(1000);
//
//for (int i = 1; i <= 50; i++) {
//    System.out.printf("%4d", random.nextInt(100));
//
//    if (i % 10 == 0) {
//        System.out.println();
//    }
//}
//
//import java.util.Random;


   //  9.5
  
//   (Use the GregorianCalendar class) Java API has the GregorianCalendar 
//class in the java.util package, which you can use to obtain the year, month, and 
//day of a date. The no-arg constructor constructs an instance for the current date, 
//and the methods get(GregorianCalendar.YEAR), get(GregorianCalen
//dar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year, 
//month, and day. Write a program to perform two tasks:
//1. Display the current year, month, and day.
//2. The GregorianCalendar class has the setTimeInMillis(long), which 
//can be used to set a specified elapsed time since January 1, 1970. Set the value 
//to 1234567898765L and display the year, month, and day
//        
//        GregorianCalendar calendar = new GregorianCalendar();
//
//System.out.println("Current Date:");
//System.out.println("Year: " +
//        calendar.get(GregorianCalendar.YEAR));
//System.out.println("Month: " +
//        (calendar.get(GregorianCalendar.MONTH) + 1));
//System.out.println("Day: " +
//        calendar.get(GregorianCalendar.DAY_OF_MONTH));
//
//calendar.setTimeInMillis(1234567898765L);
//
//System.out.println();
//
//System.out.println("Date after setting elapsed time:");
//System.out.println("Year: " +
//        calendar.get(GregorianCalendar.YEAR));
//System.out.println("Month: " +
//        (calendar.get(GregorianCalendar.MONTH) + 1));
//System.out.println("Day: " +
//        calendar.get(GregorianCalendar.DAY_OF_MONTH));
//
//import java.util.GregorianCalendar;

 
//   9.7

//Stopwatch) Design a class named StopWatch. The class contains:
//■
//■ Private data fields startTime and endTime with getter methods.
//■
//■ A no-arg constructor that initializes startTime with the current time.
//■
//■ A method named start() that resets the startTime to the current time.
//■
//■ A method named stop() that sets the endTime to the current time.
//■
//■ A method named getElapsedTime() that returns the elapsed time for the 
//stopwatch in milliseconds.
//Draw the UML diagram for the class then implement the class. Write a test program 
//that measures the execution time of sorting 100,000 numbers using selection sort.
//9.7 (The Account class) Design a class named Account that contains:
//
//
//  public class StopWatch {
//    private long startTime;
//    private long endTime;
//
//    public StopWatch() {
//        startTime = System.currentTimeMillis();
//    }
//
//    public long getStartTime() {
//        return startTime;
//    }
//
//    public long getEndTime() {
//        return endTime;
//    }
//
//    public void start() {
//        startTime = System.currentTimeMillis();
//    }
//
//    public void stop() {
//        endTime = System.currentTimeMillis();
//    }
//
//    public long getElapsedTime() {
//        return endTime - startTime;
//    }
//}
//  
//  int[] list = new int[100000];
//
//for (int i = 0; i < list.length; i++) {
//    list[i] = (int)(Math.random() * 100000);
//}
//
//StopWatch stopWatch = new StopWatch();
//
//stopWatch.start();
//
//for (int i = 0; i < list.length - 1; i++) {
//    int minIndex = i;
//
//    for (int j = i + 1; j < list.length; j++) {
//        if (list[j] < list[minIndex]) {
//            minIndex = j;
//        }
//    }
//
//    int temp = list[i];
//    list[i] = list[minIndex];
//    list[minIndex] = temp;
//}
//
//stopWatch.stop();
//
//System.out.println("Execution time: "
//        + stopWatch.getElapsedTime() + " milliseconds");


// 9.10

//(Algebra: quadratic equations) Design a class named QuadraticEquation for 
//a quadratic equation ax2 + bx + c = 0. The class contains:
//■
//■ Private data fields a, b, and c that represent three coefficients.
//■
//■ A constructor with the arguments for a, b, and c.
//■
//■ Three getter methods for a, b, and c.
//■
//■ A method named getDiscriminant() that returns the discriminant, which 
//is b2- 4ac.
//■
//■ The methods named getRoot1() and getRoot2() for returning two roots 
//of the equation
//r1 =-b + 2b2- 4ac
//2a 
//and r2 =-b- 2b2- 4ac
//2a
//These methods are useful only if the discriminant is nonnegative. Let these methods 
//return 0 if the discriminant is negative.
//Draw the UML diagram for the class then implement the class. Write a test pro
//gram that prompts the user to enter values for a, b, and c and displays the result 
//based on the discriminant. If the discriminant is positive, display the two roots. If 
//the discriminant is 0, display the one root. Otherwise, display “The equation has 
//no roots.” See Programming Exercise 3.1 for sample runs.
//
//public class QuadraticEquation {
//    private double a;
//    private double b;
//    private double c;
//
//    public QuadraticEquation(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    public double getA() {
//        return a;
//    }
//
//    public double getB() {
//        return b;
//    }
//
//    public double getC() {
//        return c;
//    }
//
//    public double getDiscriminant() {
//        return b * b - 4 * a * c;
//    }
//
//    public double getRoot1() {
//        if (getDiscriminant() < 0) {
//            return 0;
//        }
//
//        return (-b + Math.sqrt(getDiscriminant())) / (2 * a);
//    }
//
//    public double getRoot2() {
//        if (getDiscriminant() < 0) {
//            return 0;
//        }
//
//        return (-b - Math.sqrt(getDiscriminant())) / (2 * a);
//    }
//}
//
//Scanner input = new Scanner(System.in);
//
//System.out.print("Enter a, b, and c: ");
//
//double a = input.nextDouble();
//double b = input.nextDouble();
//double c = input.nextDouble();
//
//QuadraticEquation equation =
//        new QuadraticEquation(a, b, c);
//
//double discriminant = equation.getDiscriminant();
//
//if (discriminant > 0) {
//    System.out.println("The equation has two roots "
//            + equation.getRoot1() + " and "
//            + equation.getRoot2());
//}
//else if (discriminant == 0) {
//    System.out.println("The equation has one root "
//            + equation.getRoot1());
//}
//else {
//    System.out.println("The equation has no roots");
//}


       
    }
    
}
