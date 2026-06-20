package chapter_11;
public class Chapter_11 {

    public static void main(String[] args) {
        
        
        //  11.1
        
        
//        (The Triangle class) Design a class named Triangle that extends 
//GeometricObject. The class contains:
//■
//■ Three double data fields named side1, side2, and side3 with default val
//ues 1.0 to denote three sides of a triangle.
//■
//■ A no-arg constructor that creates a default triangle.
//■
//■ A constructor that creates a triangle with the specified side1, side2, and side3.
//■
//■ The accessor methods for all three data fields.
//■
//■ A method named getArea() that returns the area of this triangle.
//■
//■ A method named getPerimeter() that returns the perimeter of this triangle.
//■
//■ A method named toString() that returns a string description for the triangle.
//For the formula to compute the area of a triangle, see Programming Exercise 2.19. 
//The toString() method is implemented as follows:
//return "Triangle: side1 = " + side1 + " side2 = " + side2 +
//" side3 = " + side3;
//Draw the UML diagrams for the classes Triangle and GeometricObject and 
//implement the classes. Write a test program that prompts the user to enter three 
//sides of the triangle, a color, and a Boolean value to indicate whether the triangle 
//is filled. The program should create a Triangle object with these sides and set 
//the color and filled properties using the input. The program should display 
//the area, perimeter, color, and true or false to indicate whether it is filled or not.
//
//
//import java.util.Date;
//
//public class GeometricObject {
//
//    private String color = "white";
//    private boolean filled;
//    private Date dateCreated;
//
//    public GeometricObject() {
//        dateCreated = new Date();
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public boolean isFilled() {
//        return filled;
//    }
//
//    public void setFilled(boolean filled) {
//        this.filled = filled;
//    }
//
//    public Date getDateCreated() {
//        return dateCreated;
//    }
//
//    @Override
//    public String toString() {
//        return "created on " + dateCreated +
//                "\ncolor: " + color +
//                " and filled: " + filled;
//    }
//}
//
//public class Triangle extends GeometricObject {
//
//    private double side1 = 1.0;
//    private double side2 = 1.0;
//    private double side3 = 1.0;
//
//    public Triangle() {
//    }
//
//    public Triangle(double side1,
//                    double side2,
//                    double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    public double getSide1() {
//        return side1;
//    }
//
//    public double getSide2() {
//        return side2;
//    }
//
//    public double getSide3() {
//        return side3;
//    }
//
//    public double getArea() {
//
//        double s = getPerimeter() / 2;
//
//        return Math.sqrt(
//                s * (s - side1) *
//                (s - side2) *
//                (s - side3));
//    }
//
//    public double getPerimeter() {
//        return side1 + side2 + side3;
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle: side1 = " + side1 +
//                " side2 = " + side2 +
//                " side3 = " + side3;
//    }
//}
//
//import java.util.Scanner;
//
//public class TestTriangle {
//
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter side1: ");
//        double side1 = input.nextDouble();
//
//        System.out.print("Enter side2: ");
//        double side2 = input.nextDouble();
//
//        System.out.print("Enter side3: ");
//        double side3 = input.nextDouble();
//
//        System.out.print("Enter color: ");
//        String color = input.next();
//
//        System.out.print("Is filled (true/false): ");
//        boolean filled = input.nextBoolean();
//
//        Triangle triangle =
//                new Triangle(side1, side2, side3);
//
//        triangle.setColor(color);
//        triangle.setFilled(filled);
//
//        System.out.println("\nArea: "
//                + triangle.getArea());
//
//        System.out.println("Perimeter: "
//                + triangle.getPerimeter());
//
//        System.out.println("Color: "
//                + triangle.getColor());
//
//        System.out.println("Filled: "
//                + triangle.isFilled());
//    }
//}


   //  11.3
   
//   (Subclasses of Account) In Programming Exercise 9.7, the Account class was 
//defined to model a bank account. An account has the properties account number, 
//balance, annual interest rate, and date created, and methods to deposit and with
//draw funds. Create two subclasses for checking and saving accounts. A checking 
//account has an overdraft limit, but a savings account cannot be overdrawn.
//Draw the UML diagram for the classes and implement them. Write a test program 
//that creates objects of Account, SavingsAccount, and CheckingAccount and 
//invokes their toString() methods.
//   
//   import java.util.Date;
//
//public class Account {
//
//    private int id;
//    private double balance;
//    private double annualInterestRate;
//    private Date dateCreated;
//
//    public Account() {
//        dateCreated = new Date();
//    }
//
//    public Account(int id, double balance) {
//        this.id = id;
//        this.balance = balance;
//        dateCreated = new Date();
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public double getBalance() {
//        return balance;
//    }
//
//    public double getAnnualInterestRate() {
//        return annualInterestRate;
//    }
//
//    public void setAnnualInterestRate(double rate) {
//        this.annualInterestRate = rate;
//    }
//
//    public double getMonthlyInterest() {
//        return balance * (annualInterestRate / 1200);
//    }
//
//    public void deposit(double amount) {
//        balance += amount;
//    }
//
//    public void withdraw(double amount) {
//        balance -= amount;
//    }
//
//    @Override
//    public String toString() {
//        return "Account[id=" + id +
//                ", balance=" + balance + "]";
//    }
//}
//
//public class CheckingAccount extends Account {
//
//    private double overdraftLimit = 500;
//
//    public double getOverdraftLimit() {
//        return overdraftLimit;
//    }
//
//    public void setOverdraftLimit(double limit) {
//        this.overdraftLimit = limit;
//    }
//
//    @Override
//    public void withdraw(double amount) {
//        if (getBalance() + overdraftLimit >= amount) {
//            super.withdraw(amount);
//        } else {
//            System.out.println("Overdraft limit exceeded.");
//        }
//    }
//
//    @Override
//    public String toString() {
//        return "CheckingAccount[overdraftLimit=" +
//                overdraftLimit + "] " + super.toString();
//    }
//}
//
//public class TestAccounts {
//
//    public static void main(String[] args) {
//
//        Account a = new Account(1, 1000);
//
//        SavingsAccount s = new SavingsAccount();
//        s.deposit(500);
//
//        CheckingAccount c = new CheckingAccount();
//        c.deposit(800);
//        c.setOverdraftLimit(300);
//
//        System.out.println(a.toString());
//        System.out.println(s.toString());
//        System.out.println(c.toString());
//    }
//}


  //  11.5
  
    The Course class) Rewrite the Course class in Listing 10.6. Use an  ArrayList 
to replace an array to store students. Draw the new UML diagram for the class. 
You should not change the original contract of the Course class (i.e., the defi
nition of the constructors and methods should not be changed, but the private 
members may be changed.) 

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Course(String courseName, int capacity) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public String[] getStudents() {
        return students.toArray(new String[0]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }
}

public class TestCourse {

    public static void main(String[] args) {

        Course course = new Course("Java Programming", 3);

        course.addStudent("Ali");
        course.addStudent("Sara");
        course.addStudent("Omar");

        course.dropStudent("Sara");

        System.out.println("Course: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());

        String[] students = course.getStudents();

        for (String s : students) {
            System.out.println(s);
        }
    }
}


//   11 .6

   Use ArrayList) Write a program that creates an ArrayList and adds a Loan 
object, a Date object, a string, and a Circle object to the list, and use a loop to 
display all the elements in the list by invoking the object’s toString() method.
        
        import java.util.ArrayList;
import java.util.Date;

public class TestArrayList {

    public static void main(String[] args) {

        ArrayList<Object> list = new ArrayList<>();

        list.add(new Loan(5.5, 10, 10000));
        list.add(new Date());
        list.add("Hello World");
        list.add(new Circle(5));

        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle radius: " + radius +
               ", area: " + getArea();
    }
}

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;

    public Loan(double annualInterestRate,
                int numberOfYears,
                double loanAmount) {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyRate = annualInterestRate / 1200;
        return loanAmount * monthlyRate /
               (1 - Math.pow(1 / (1 + monthlyRate),
               numberOfYears * 12));
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    @Override
    public String toString() {
        return "Loan amount: " + loanAmount +
               ", monthly payment: " + getMonthlyPayment();
    }
}


//  11.10

// Implement MyStack using inheritance) In Listing 11.10, MyStack  
//is implemented using composition. Define a new stack class that extends 
//ArrayList.
//        
//        import java.util.ArrayList;
//
//public class MyStack<E> extends ArrayList<E> {
//
//    public void push(E value) {
//        add(value);
//    }
//
//    public E pop() {
//        if (isEmpty()) {
//            return null;
//        }
//        return remove(size() - 1);
//    }
//
//    public E peek() {
//        if (isEmpty()) {
//            return null;
//        }
//        return get(size() - 1);
//    }
//
//    public boolean empty() {
//        return isEmpty();
//    }
//
//    public int getSize() {
//        return size();
//    }
//}
//
//public class TestMyStack {
//
//    public static void main(String[] args) {
//
//        MyStack<Integer> stack = new MyStack<>();
//
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());
//        System.out.println(stack.getSize());
//    }
//}





      
    }
    
}
