package chapter_13_exercizes;
public class Chapter_13_Exercizes {
    public static void main(String[] args) {

        
        //  13.1
        
//        Triangle class) Design a new Triangle class that extends the abstract 
//GeometricObject class. Draw the UML diagram for the classes Triangle and 
//GeometricObject then implement the Triangle class. Write a test program 
//that prompts the user to enter three sides of the triangle, a color, and a Boolean 
//value to indicate whether the triangle is filled. The program should create a Tri
//angle object with these sides, and set the color and filled properties using the 
//input. The program should display the area, perimeter, color, and true or false to 
//indicate whether it is filled or not.
//*13.2 (Shuffle ArrayList) Write the follow
//
//public class GeometricObject {
//
//    private String color = "white";
//    private boolean filled;
//
//    public GeometricObject() {
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
//    @Override
//    public String toString() {
//        return "color: " + color +
//               ", filled: " + filled;
//    }
//}
//
//public class Triangle extends GeometricObject {
//
//    private double side1;
//    private double side2;
//    private double side3;
//
//    public Triangle() {
//        this(1.0, 1.0, 1.0);
//    }
//
//    public Triangle(double side1, double side2, double side3) {
//        this.side1 = side1;
//        this.side2 = side2;
//        this.side3 = side3;
//    }
//
//    public double getSide1() { return side1; }
//    public double getSide2() { return side2; }
//    public double getSide3() { return side3; }
//
//    public double getPerimeter() {
//        return side1 + side2 + side3;
//    }
//
//    public double getArea() {
//        double s = getPerimeter() / 2;
//        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
//    }
//
//    @Override
//    public String toString() {
//        return "Triangle: side1 = " + side1 +
//               ", side2 = " + side2 +
//               ", side3 = " + side3;
//    }
//}

//  13.3

//(Sort ArrayList) Write the following method that sorts an ArrayList of numbers:
//public static void sort(ArrayList<Number> list)
//        
//        ```java id="sort1"
//import java.util.ArrayList;
//
//public class SortArrayList {
//
//    public static void sort(ArrayList<Number> list) {
//
//        for (int i = 0; i < list.size() - 1; i++) {
//            Number min = list.get(i);
//            int minIndex = i;
//
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(j).doubleValue() < min.doubleValue()) {
//                    min = list.get(j);
//                    minIndex = j;
//                }
//            }
//
//            if (minIndex != i) {
//                Number temp = list.get(i);
//                list.set(i, list.get(minIndex));
//                list.set(minIndex, temp);
//            }
//        }
//    }
//}

//  13.5

//Enable GeometricObject comparable) Modify the GeometricObject class to 
//implement the Comparable interface and define a static max method in the Geo
//metricObject class for finding the larger of two GeometricObject objects. 
//Draw the UML diagram and implement the new GeometricObject class. Write 
//a test program that uses the max method to find the larger of two circles, the larger 
//of two rectangles.
//
//
//public abstract class GeometricObject implements Comparable<GeometricObject> {
//
//    private String color = "white";
//    private boolean filled;
//
//    public GeometricObject() {
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
//    public abstract double getArea();
//
//    @Override
//    public int compareTo(GeometricObject o) {
//        return Double.compare(this.getArea(), o.getArea());
//    }
//
//    public static GeometricObject max(GeometricObject o1,
//                                      GeometricObject o2) {
//        return (o1.compareTo(o2) >= 0) ? o1 : o2;
//    }
//
//    @Override
//    public String toString() {
//        return "color: " + color + ", filled: " + filled +
//               ", area: " + getArea();
//    }
//}
//
//public class Circle extends GeometricObject {
//
//    private double radius;
//
//    public Circle(double radius) {
//        this.radius = radius;
//    }
//
//    @Override
//    public double getArea() {
//        return Math.PI * radius * radius;
//    }
//
//    @Override
//    public String toString() {
//        return "Circle radius=" + radius +
//               ", area=" + getArea();
//    }
//}
//
//public class Rectangle extends GeometricObject {
//
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public String toString() {
//        return "Rectangle width=" + width +
//               ", height=" + height +
//               ", area=" + getArea();
//    }
//}
//
//public class TestGeometricObject {
//
//    public static void main(String[] args) {
//
//        Circle c1 = new Circle(5);
//        Circle c2 = new Circle(7);
//
//        Rectangle r1 = new Rectangle(4, 6);
//        Rectangle r2 = new Rectangle(5, 5);
//
//        System.out.println("Larger circle: " +
//                GeometricObject.max(c1, c2));
//
//        System.out.println("Larger rectangle: " +
//                GeometricObject.max(r1, r2));
//    }
//}


   //  13.7
   
//   (The Colorable interface) Design an interface named Colorable with a void 
//method named howToColor(). Every class of a colorable object must imple
//ment the Colorable interface. Design a class named Square that extends 
//GeometricObject and implements Colorable. Implement howToColor to 
//display the message Color all four sides. The Square class contains a 
//data field side with getter and setter methods, and a constructor for constructing 
//a Square with a specified side. The Square class has a private double data field 
//named side with its getter and setter methods. It has a no-arg constructor to 
//create a Square with side 0, and another constructor that creates a Square with 
//the specified side.
//Draw a UML diagram that involves Colorable, Square, and  GeometricObject. 
//Write a test program that creates an array of five GeometricObjects. For each object 
//in the array, display its area and invoke its howToColor method if it is colorable.
//        
//        
//        public interface Colorable {
//    void howToColor();
//}
//        
//        public abstract class GeometricObject {
//
//    private String color = "white";
//    private boolean filled;
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
//    public abstract double getArea();
//}
//        
//        public class Square extends GeometricObject implements Colorable {
//
//    private double side;
//
//    public Square() {
//        this.side = 0;
//    }
//
//    public Square(double side) {
//        this.side = side;
//    }
//
//    public double getSide() {
//        return side;
//    }
//
//    public void setSide(double side) {
//        this.side = side;
//    }
//
//    @Override
//    public double getArea() {
//        return side * side;
//    }
//
//    @Override
//    public void howToColor() {
//        System.out.println("Color all four sides");
//    }
//
//    @Override
//    public String toString() {
//        return "Square side=" + side +
//               ", area=" + getArea();
//    }
//}
//        
//        public class TestColorable {
//
//    public static void main(String[] args) {
//
//        GeometricObject[] objects = new GeometricObject[5];
//
//        objects[0] = new Square(2);
//        objects[1] = new Square(3);
//        objects[2] = new Square(4);
//        objects[3] = new Square(5);
//        objects[4] = new Square(6);
//
//        for (GeometricObject obj : objects) {
//
//            System.out.println("Area: " + obj.getArea());
//
//            if (obj instanceof Colorable) {
//                ((Colorable) obj).howToColor();
//            }
//        }
//    }
//}

//  13.10

//  Enable Rectangle comparable) Rewrite the Rectangle class in Listing  13.3 to 
//extend GeometricObject and implement the Comparable interface. Override 
//the equals method in the Object class. Two Rectangle objects are equal if 
//their areas are the same. Draw the UML diagram that involves Rectangle, Geo
//metricObject, and Comparable.
//
//public abstract class GeometricObject {
//
//    private String color = "white";
//    private boolean filled;
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
//    public abstract double getArea();
//}
//
//public class Rectangle extends GeometricObject
//        implements Comparable<Rectangle> {
//
//    private double width;
//    private double height;
//
//    public Rectangle() {
//        this(1, 1);
//    }
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//
//    @Override
//    public int compareTo(Rectangle o) {
//        return Double.compare(this.getArea(), o.getArea());
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//
//        if (this == obj) return true;
//        if (!(obj instanceof Rectangle)) return false;
//
//        Rectangle r = (Rectangle) obj;
//        return Double.compare(this.getArea(), r.getArea()) == 0;
//    }
//}




    }
    
}
