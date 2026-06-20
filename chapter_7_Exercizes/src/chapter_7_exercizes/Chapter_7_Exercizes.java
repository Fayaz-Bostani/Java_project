package chapter_7_exercizes;

import java.util.Scanner;

public class Chapter_7_Exercizes {

    public static void main(String[] args) {
        
   //     7.1 
//(Assign grades) Write a program that reads student scores, gets the best score, and 
//then assigns grades based on the following scheme:
//Grade is A if score is Ú best -10;
//Grade is B if score is Ú best -20;
//Grade is C if score is Ú best -30;
//Grade is D if score is Ú best -40;
//Grade is F otherwise.
//The program prompts the user to enter the total number of students, then prompts 
//the user to enter all of the scores, and concludes by displaying the grades. Here is 
//a sample run:
//Enter the number of students: 4 
//Enter 4 scores: 40 55 70 58 
//Student 0 score is 40 and grade is C
//Student 1 score is 55 and grade is B
//Student 2 score is 70 and grade is A
//Student 3 score is 58 and grade is B    

        
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Enter the number of students: ");
//        int numberOfStudents = input.nextInt();
//
//        int[] scores = new int[numberOfStudents];
//
//        System.out.print("Enter " + numberOfStudents + " scores: ");
//
//        int best = 0;
//
//        // Read scores and find best score
//        for (int i = 0; i < numberOfStudents; i++) {
//            scores[i] = input.nextInt();
//
//            if (scores[i] > best) {
//                best = scores[i];
//            }
//        }

        // Assign grades
//        for (int i = 0; i < numberOfStudents; i++) {
//
//            char grade;
//
//            if (scores[i] >= best - 10) {
//                grade = 'A';
//            } else if (scores[i] >= best - 20) {
//                grade = 'B';
//            } else if (scores[i] >= best - 30) {
//                grade = 'C';
//            } else if (scores[i] >= best - 40) {
//                grade = 'D';
//            } else {
//                grade = 'F';
//            }
//
//            System.out.println(
//                "Student " + i +
//                " score is " + scores[i] +
//                " and grade is " + grade
//            );
//        }
//
//        input.close();
        
        
        
       //  7.2   
       
     //       Reverse the numbers entered) Write a program that reads 10 integers then dis
     //plays them in the reverse of the order in which they were read.
//     
//           Scanner input = new Scanner(System.in);
//
//        int[] numbers = new int[10];
//
//        System.out.print("Enter 10 integers: ");
//
//        // Read 10 integers
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = input.nextInt();
//        }
//
//        // Display in reverse order
//        System.out.println("The numbers in reverse order are:");
//
//        for (int i = numbers.length - 1; i >= 0; i--) {
//            System.out.print(numbers[i] + " ");
//        }
//
//        input.close();

        //   7.3
        
//        (Count occurrence of numbers) Write a program that reads the integers between 
//       1 and 100 and counts the occurrences of each. Assume the input ends with 0. Here 
//       is a sample run of the program: Note that if a number occurs more than one time, the 
//       plural word “times” is used in the output. Numbers are displayed in increasing order.
//      Enter the integers between 1 and 100: 2 5 6 5 4 3 23 43 2 0 
//      2 occurs 2 times
//      3 occurs 1 time
//      4 occurs 1 time
//      5 occurs 2 times
//      6 occurs 1 time
//      23 occurs 1 time
//      43 occurs 1 time
              
              
//          Scanner input = new Scanner(System.in);
//
//        int[] counts = new int[101]; // اندیس‌های 1 تا 100
//
//        System.out.print("Enter the integers between 1 and 100: ");
//
//        int number;
//
//        do {
//            number = input.nextInt();
//
//            if (number >= 1 && number <= 100) {
//                counts[number]++;
//            }
//
//        } while (number != 0);
//
//        for (int i = 1; i <= 100; i++) {
//            if (counts[i] > 0) {
//                if (counts[i] == 1) {
//                    System.out.println(i + " occurs " + counts[i] + " time");
//                } else {
//                    System.out.println(i + " occurs " + counts[i] + " times");
//                }
//            }
//        }



   //  7.4
   
//            Analyze scores) Write a program that reads an unspecified number of scores and 
//determines how many scores are above or equal to the average, and how many 
//scores are below the average. Enter a negative number to signify the end of the 
//input. Assume the maximum number of scores is 100.
//
//         Scanner input = new Scanner(System.in);
//
//        int[] scores = new int[100];
//        int count = 0;
//        int sum = 0;
//
//        System.out.print("Enter scores (negative number to end): ");
//
//        int score = input.nextInt();
//
//        while (score >= 0) {
//            scores[count] = score;
//            sum += score;
//            count++;
//
//            score = input.nextInt();
//        }
//
//        double average = (double) sum / count;
//
//        int aboveOrEqual = 0;
//        int below = 0;
//
//        for (int i = 0; i < count; i++) {
//            if (scores[i] >= average) {
//                aboveOrEqual++;
//            } else {
//                below++;
//            }
//        }
//
//        System.out.println("Average is " + average);
//        System.out.println("Number of scores above or equal to the average: "
//                + aboveOrEqual);
//        System.out.println("Number of scores below the average: "
//                + below);



      //    7.5
      
//      Print distinct numbers) Write a program that reads in 10 numbers and displays the 
//number of distinct numbers and the distinct numbers in their input order and sepa
//rated by exactly one space (i.e., if a number appears multiple times, it is displayed 
//only once). (Hint: Read a number and store it to an array if it is new. If the number is 
//already in the array, ignore it.) After the input, the array contains the distinct numbers. 
//Here is the sample run of the program:
//Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
//The number of distinct numbers is 6
//The distinct numbers are: 1 2 3 6 4 5
//
//Scanner input = new Scanner(System.in);
//
//int[] distinct = new int[10];
//int count = 0;
//
//System.out.print("Enter 10 numbers: ");
//
//for (int i = 0; i < 10; i++) {
//    int number = input.nextInt();
//
//    boolean found = false;
//
//    for (int j = 0; j < count; j++) {
//        if (distinct[j] == number) {
//            found = true;
//            break;
//        }
//    }
//
//    if (!found) {
//        distinct[count] = number;
//        count++;
//    }
//}
//
//System.out.println("The number of distinct numbers is " + count);
//
//System.out.print("The distinct numbers are: ");
//
//for (int i = 0; i < count; i++) {
//    System.out.print(distinct[i] + " ");
//}
        


  //  7.6
//  
//    Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a num
//ber n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor 
//is found, n is not prime. A more efficient approach is to check whether any of the 
//prime numbers less than or equal to 2n can divide n evenly. If not, n is prime. 
//Rewrite Listing 5.15 to display the first 50 prime numbers using this approach. 
//You need to use an array to store the prime numbers, and later use them to check 
//whether they are possible divisors for n. 
        
        
//        int[] primes = new int[50];
//
//int count = 0;
//int number = 2;
//
//while (count < 50) {
//    boolean isPrime = true;
//
//    for (int i = 0; i < count; i++) {
//        if (primes[i] > Math.sqrt(number)) {
//            break;
//        }
//
//        if (number % primes[i] == 0) {
//            isPrime = false;
//            break;
//        }
//    }
//
//    if (isPrime) {
//        primes[count] = number;
//        count++;
//    }
//
//    number++;
//}
//
//for (int i = 0; i < 50; i++) {
//    System.out.printf("%5d", primes[i]);
//
//    if ((i + 1) % 10 == 0) {
//        System.out.println();
//    }
//}


    //   7.7
    
//    Count single digits) Write a program that generates 100 random integers between 
//0 and 9 and displays the count for each number. (Hint: Use an array of 10 integers, 
//say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
//
//     
//        int[] counts = new int[10];
//
//for (int i = 0; i < 100; i++) {
//    int number = (int)(Math.random() * 10);
//    counts[number]++;
//}
//
//for (int i = 0; i < counts.length; i++) {
//    System.out.println(i + " occurs " + counts[i] + " times");
//}



      //   7.8
      
      
//         Average an array) Write two overloaded methods that return the average of an 
//array with the following headers:
//public static double average(int[] array)
//public static double average(double[] array)
//Write a test program that prompts the user to enter 10 integers, invokes the first 
//method, then displays the average value; prompts the user to enter 10 double 
//values, invokes the second method, then displays the average value.
//        
//        
//         public static double average(int[] array) {
//    int sum = 0;
//
//    for (int i = 0; i < array.length; i++) {
//        sum += array[i];
//    }
//
//    return (double) sum / array.length;
//}
//
//public static double average(double[] array) {
//    double sum = 0;
//
//    for (int i = 0; i < array.length; i++) {
//        sum += array[i];
//    }
//
//    return sum / array.length;
//}



//   7.9

//   Find the smallest element) Write a method that finds the smallest element in an 
//array of double values using the following header:
//public static double min(double[] array)
//Write a test program that prompts the user to enter 10 numbers, invokes this 
//method to return the minimum value, and displays the minimum value. Here is a 
//sample run of the program:
//Enter 10 numbers: 1.9 2.5 3.7 2 1.5 6 3 4 5 2 
//The minimum number is 1.5


//     Scanner input = new Scanner(System.in);
//
//double[] numbers = new double[10];
//
//System.out.print("Enter 10 numbers: ");
//
//for (int i = 0; i < numbers.length; i++) {
//    numbers[i] = input.nextDouble();
//}
//
//System.out.println("The minimum number is " + min(numbers));
//
//public static double min(double[] array) {
//    double min = array[0];
//
//    for (int i = 1; i < array.length; i++) {
//        if (array[i] < min) {
//            min = array[i];
//        }
//    }
//
//    return min;
//}



  //   7.10
  
//  Find the index of the smallest element) Write a method that returns the index of 
//the smallest element in an array of integers. If the number of such elements is 
//greater than 1, return the smallest index. Use the following header:
//public static int indexOfSmallestElement(double[] array)
     
//        Scanner input = new Scanner(System.in);
//
//double[] numbers = new double[10];
//
//System.out.print("Enter 10 numbers: ");
//
//for (int i = 0; i < numbers.length; i++) {
//    numbers[i] = input.nextDouble();
//}
//
//System.out.println("The index of the smallest element is "
//        + indexOfSmallestElement(numbers));
//
// public static int indexOfSmallestElement(double[] array) {
//    int index = 0;
//
//    for (int i = 1; i < array.length; i++) {
//        if (array[i] < array[index]) {
//            index = i;
//        }
//    }
//
//    return index;
//}


   //  7.12
   
//     Reverse an array) The reverse method in Section 7.7 reverses an array by 
//copying it to a new array. Rewrite the method that reverses the array passed in 
//the argument and returns this array. Write a test program that prompts the user to 
//enter 10 numbers, invokes the method to reverse the numbers, and displays the 
//numbers.

//   Scanner input = new Scanner(System.in);
//
//double[] numbers = new double[10];
//
//System.out.print("Enter 10 numbers: ");
//
//for (int i = 0; i < numbers.length; i++) {
//    numbers[i] = input.nextDouble();
//}

//reverse(numbers);
//
//System.out.println("The reversed numbers are:");
//
//for (int i = 0; i < numbers.length; i++) {
//    System.out.print(numbers[i] + " ");
//}
//
//public static double[] reverse(double[] array) {
//    for (int i = 0; i < array.length / 2; i++) {
//        double temp = array[i];
//        array[i] = array[array.length - 1 - i];
//        array[array.length - 1 - i] = temp;
//    }

//    return array;
//}


//  7.13

//   Random number chooser) Write the following method that returns a random 
//number between start and end, excluding the numbers. 
//public static int getRandom(int start, int end, int... numbers)
//For example, invoking getRandom(1,100,4,8,95,93) returns a random num
//ber between 1 and 100 excluding 4,8,95,and 93. Write a test program that 
//invokes getRandom(1,100,4,8,95,93) 45 times and displays the resulting 
//numbers 15 per line using the format %4d.
//        
//        for (int i = 1; i <= 45; i++) {
//    System.out.printf("%4d", getRandom(1, 100, 4, 8, 95, 93));
//
//    if (i % 15 == 0) {
//        System.out.println();
//    }
//}
//        
//        public static int getRandom(int start, int end, int... numbers) {
//    while (true) {
//        int random = (int)(Math.random() * (end - start + 1)) + start;
//
//        boolean found = false;
//
//        for (int number : numbers) {
//            if (random == number) {
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            return random;
//        }
//    }
//}
            

//  7.14

//  Compute gcd) Write a method that returns the gcd of an unspecified number of 
//integers. The method header is specified as follows:
//public static int gcd(int... numbers)
//Write a test program that prompts the user to enter five numbers, invokes the 
//method to find the gcd of these numbers, and displays the gcd. 
//
//Scanner input = new Scanner(System.in);
//
//int[] numbers = new int[5];
//
//System.out.print("Enter five numbers: ");
//
//for (int i = 0; i < 5; i++) {
//    numbers[i] = input.nextInt();
//}
//
//System.out.println("The gcd is " +
//        gcd(numbers[0], numbers[1], numbers[2], numbers[3], numbers[4]));
//
// public static int gcd(int... numbers) {
//    int gcd = numbers[0];
//
//    for (int i = 1; i < numbers.length; i++) {
//        int a = gcd;
//        int b = numbers[i];
//
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//
//        gcd = a;
//    }
//
//    return gcd;
//}


   //  7.15
   
//   (Eliminate duplicates) Write a method that returns a new array by eliminating the 
//duplicate values in the array using the following method header:
//public static int[] eliminateDuplicates(int[] list)
//Write a test program that reads in 10 integers, invokes the method, and displays 
//the distinct numbers separated by exactly one space. Here is a sample run of the 
//program:
//Enter 10 numbers: 1 2 3 2 1 6 3 4 5 2 
//The distinct numbers are: 1 2 3 6 4 5
//
// Scanner input = new Scanner(System.in);
//
//int[] numbers = new int[10];
//
//System.out.print("Enter 10 numbers: ");
//
//for (int i = 0; i < 10; i++) {
//    numbers[i] = input.nextInt();
//}
//
//int[] distinct = eliminateDuplicates(numbers);
//
//System.out.print("The distinct numbers are: ");
//
//for (int i = 0; i < distinct.length; i++) {
//    System.out.print(distinct[i] + " ");
//}
//
//
//  public static int[] eliminateDuplicates(int[] list) {
//    int[] temp = new int[list.length];
//    int count = 0;
//
//    for (int i = 0; i < list.length; i++) {
//        boolean found = false;
//
//        for (int j = 0; j < count; j++) {
//            if (list[i] == temp[j]) {
//                found = true;
//                break;
//            }
//        }
//
//        if (!found) {
//            temp[count] = list[i];
//            count++;
//        }
//    }
//
//    int[] result = new int[count];
//
//    for (int i = 0; i < count; i++) {
//        result[i] = temp[i];
//    }
//
//    return result;
//}



  // 7.16 
  
//  Execution time) Write a program that randomly generates an array of 100,000 
//integers and a key. Estimate the execution time of invoking the linearSearch 
//method in Listing 7.6. Sort the array and estimate the execution time of invoking 
//the binarySearch method in Listing 7.7. You can use the following code tem
//plate to obtain the execution time:
//long startTime = System.nanoTime();
//perform the task;
//long endTime = System.nanoTime();
//long executionTime = endTime − startTime;
//
//int[] list = new int[100000];
//
//for (int i = 0; i < list.length; i++) {
//    list[i] = (int)(Math.random() * 100000);
//}
//
//int key = (int)(Math.random() * 100000);
//
//long startTime = System.nanoTime();
//linearSearch(list, key);
//long endTime = System.nanoTime();
//
//System.out.println("Linear Search Time: "
//        + (endTime - startTime) + " ns");
//
//java.util.Arrays.sort(list);
//
//startTime = System.nanoTime();
//binarySearch(list, key);
//endTime = System.nanoTime();
//
//System.out.println("Binary Search Time: "
//        + (endTime - startTime) + " ns");
//
//public static int linearSearch(int[] list, int key) {
//    for (int i = 0; i < list.length; i++) {
//        if (list[i] == key) {
//            return i;
//        }
//    }
//
//    return -1;
//}
//
//public static int binarySearch(int[] list, int key) {
//    int low = 0;
//    int high = list.length - 1;
//
//    while (high >= low) {
//        int mid = (low + high) / 2;
//
//        if (key < list[mid]) {
//            high = mid - 1;
//        } else if (key == list[mid]) {
//            return mid;
//        } else {
//            low = mid + 1;
//        }
//    }
//
//    return -1;
//}


   //   7.17
   
//    Sort students) Write a program that prompts the user to enter the number of stu
//dents, the students’ names, and their scores and prints student names in decreasing 
//order of their scores. Assume the name is a string without spaces, use the Scan
//ner’s next() method to read a name.
//            
//        
//        Scanner input = new Scanner(System.in);
//
//System.out.print("Enter the number of students: ");
//int n = input.nextInt();
//
//String[] names = new String[n];
//double[] scores = new double[n];
//
//for (int i = 0; i < n; i++) {
//    System.out.print("Enter student name: ");
//    names[i] = input.next();
//
//    System.out.print("Enter student score: ");
//    scores[i] = input.nextDouble();
//}
//
//for (int i = 0; i < n - 1; i++) {
//    for (int j = i + 1; j < n; j++) {
//        if (scores[i] < scores[j]) {
//            double tempScore = scores[i];
//            scores[i] = scores[j];
//            scores[j] = tempScore;
//
//            String tempName = names[i];
//            names[i] = names[j];
//            names[j] = tempName;
//        }
//    }
//}
//
//System.out.println("Students in decreasing order of scores:");
//
//for (int i = 0; i < n; i++) {
//    System.out.println(names[i]);
//}


//   7.19

//  Scanner input = new Scanner(System.in);
//
//System.out.print("Enter the size of the list: ");
//int size = input.nextInt();
//
//int[] list = new int[size];
//
//System.out.print("Enter the contents of the list: ");
//
//for (int i = 0; i < size; i++) {
//    list[i] = input.nextInt();
//}
//
//System.out.print("The list has " + size + " integers ");
//
//for (int i = 0; i < size; i++) {
//    System.out.print(list[i] + " ");
//}
//
//System.out.println();
//
//if (isSorted(list)) {
//    System.out.println("The list is already sorted");
//} else {
//    System.out.println("The list is not sorted");
//}
//
// public static boolean isSorted(int[] list) {
//    for (int i = 0; i < list.length - 1; i++) {
//        if (list[i] > list[i + 1]) {
//            return false;
//        }
//    }
//
//    return true;
//}


  // 7.20
//  
//  Revise selection sort) In Listing 7.8, you used selection sort to sort an array. The 
//selection-sort method repeatedly finds the smallest number in the current array 
//and swaps it with the first. Rewrite this program by finding the largest number and 
//swapping it with the last. Write a test program that reads in 10 double numbers, 
//invokes the method, and displays the sorted numbers.

//  Scanner input = new Scanner(System.in);
//
//double[] numbers = new double[10];
//
//System.out.print("Enter 10 double numbers: ");
//
//for (int i = 0; i < numbers.length; i++) {
//    numbers[i] = input.nextDouble();
//}
//
//selectionSort(numbers);
//
//System.out.println("Sorted numbers:");
//
//for (int i = 0; i < numbers.length; i++) {
//    System.out.print(numbers[i] + " ");
//}
//
//public static void selectionSort(double[] list) {
//    for (int i = list.length - 1; i > 0; i--) {
//        int largestIndex = 0;
//
//        for (int j = 1; j <= i; j++) {
//            if (list[j] > list[largestIndex]) {
//                largestIndex = j;
//            }
//        }
//
//        double temp = list[i];
//        list[i] = list[largestIndex];
//        list[largestIndex] = temp;
//    }
//}






    }
    
}
