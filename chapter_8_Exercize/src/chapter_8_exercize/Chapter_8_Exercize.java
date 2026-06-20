package chapter_8_exercize;

import java.util.Scanner;

public class Chapter_8_Exercize {

    public static void main(String[] args) {
       
        //   8.1
//        Sum elements column by column) Write a method that returns the sum of all the 
//elements in a specified column in a matrix using the following header:
//public static double sumColumn(double[][] m, int columnIndex)
//Write a test program that reads a 3-by-4 matrix and displays the sum of each 
//column. Here is a sample run:
//Enter a 3−by−4 matrix row by row:
//1.5 2 3 4 
//5.5 6 7 8 
//9.5 1 3 1 
//Sum of the elements at column 0 is 16.5
//Sum of the elements at column 1 is 9.0
//Sum of the elements at column 2 is 13.0
//Sum of the elements at column 3 is 13.0
    
    
//    Scanner input = new Scanner(System.in);
//
//double[][] matrix = new double[3][4];
//
//System.out.println("Enter a 3-by-4 matrix row by row:");
//
//for (int i = 0; i < matrix.length; i++) {
//    for (int j = 0; j < matrix[i].length; j++) {
//        matrix[i][j] = input.nextDouble();
//    }
//}
//
//for (int column = 0; column < matrix[0].length; column++) {
//    System.out.println("Sum of the elements at column "
//            + column + " is "
//            + sumColumn(matrix, column));
//}
//
//  public static double sumColumn(double[][] m, int columnIndex) {
//    double sum = 0;
//
//    for (int i = 0; i < m.length; i++) {
//        sum += m[i][columnIndex];
//    }
//
//    return sum;
//}


   //  8.2
   
//   Sum the major diagonal in a matrix) Write a method that sums all the numbers 
//in the major diagonal in an n * n matrix of double values using the following 
//header:
//public static double sumMajorDiagonal(double[][] m)
//Write a test program that reads a 4-by-4 matrix and displays the sum of all its 
//elements on the major diagonal. Here is a sample run:
//Enter a 4−by−4 matrix row by row:
//1 2 3 4.0 
//5 6.5 7 8 
//9 10 11 12 
//13 14 15 16 
//Sum of the elements in the major diagonal is 34.5
//
// Scanner input = new Scanner(System.in);
//
//double[][] matrix = new double[4][4];
//
//System.out.println("Enter a 4-by-4 matrix row by row:");
//
//for (int i = 0; i < matrix.length; i++) {
//    for (int j = 0; j < matrix[i].length; j++) {
//        matrix[i][j] = input.nextDouble();
//    }
//}
//
//System.out.println("Sum of the elements in the major diagonal is "
//        + sumMajorDiagonal(matrix));
//
// public static double sumMajorDiagonal(double[][] m) {
//    double sum = 0;
//
//    for (int i = 0; i < m.length; i++) {
//        sum += m[i][i];
//    }
//
//    return sum;
//}


   //  8.3
   
//   Sort students on grades) Rewrite Listing 8.2, GradeExam.java, to display the 
//students in increasing order of the number of correct answers.
//        
//        char[][] answers = {
//    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
//    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
//    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
//    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
//    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
//};
//
//char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
//
//int[] correctCounts = new int[answers.length];
//
//for (int i = 0; i < answers.length; i++) {
//    int correctCount = 0;
//
//    for (int j = 0; j < answers[i].length; j++) {
//        if (answers[i][j] == keys[j]) {
//            correctCount++;
//        }
//    }
//
//    correctCounts[i] = correctCount;
//}
//
//for (int i = 0; i < correctCounts.length - 1; i++) {
//    int minIndex = i;
//
//    for (int j = i + 1; j < correctCounts.length; j++) {
//        if (correctCounts[j] < correctCounts[minIndex]) {
//            minIndex = j;
//        }
//    }
//
//    int temp = correctCounts[i];
//    correctCounts[i] = correctCounts[minIndex];
//    correctCounts[minIndex] = temp;
//
//    char[] tempAnswers = answers[i];
//    answers[i] = answers[minIndex];
//    answers[minIndex] = tempAnswers;
//}
//
//for (int i = 0; i < correctCounts.length; i++) {
//    System.out.println("Student " + i +
//            "'s correct count is " + correctCounts[i]);
//}


    //  8.4
    
//     int[][] hours = {
//    {2, 4, 3, 4, 5, 8, 8},
//    {7, 3, 4, 3, 3, 4, 4},
//    {3, 3, 4, 3, 3, 2, 2},
//    {9, 3, 4, 7, 3, 4, 1},
//    {3, 5, 4, 3, 6, 3, 8},
//    {3, 4, 4, 6, 3, 4, 4},
//    {3, 7, 4, 8, 3, 8, 4},
//    {4, 3, 4, 9, 3, 7, 5}
//};
//
//int[][] totals = new int[hours.length][2];
//
//for (int i = 0; i < hours.length; i++) {
//    totals[i][0] = i;
//
//    for (int j = 0; j < hours[i].length; j++) {
//        totals[i][1] += hours[i][j];
//    }
//}
//
//for (int i = 0; i < totals.length - 1; i++) {
//    int maxIndex = i;
//
//    for (int j = i + 1; j < totals.length; j++) {
//        if (totals[j][1] > totals[maxIndex][1]) {
//            maxIndex = j;
//        }
//    }
//
//    int[] temp = totals[i];
//    totals[i] = totals[maxIndex];
//    totals[maxIndex] = temp;
//}
//
//for (int i = 0; i < totals.length; i++) {
//    System.out.println("Employee " + totals[i][0]
//            + ": " + totals[i][1]);
//}


  // 8.5
  
//  Algebra: add two matrices) Write a method to add two matrices. The header of 
//the method is as follows:
//public static double[][] addMatrix(double[][] a, double[][] b)
//  In order to be added, the two matrices must have the same dimensions and the 
//same or compatible types of elements. Let c be the resulting matrix. Each ele
//ment cij is aij +bij. For example, for two 3*3 matrices a and b, c is
//£
//a11 a12 a13
//a21 a22 a23
//a31 a32 a33
//≥+£
//b11 b12 b13
//b21 b22 b23
//b31 b32 b33
//≥=£
//a11+b11 a12+b12 a13+b13
//a21+b21 a22+b22 a23+b23
//a31+b31 a32+b32 a33+b33
//≥
//  Write a test program that prompts the user to enter two 3*3 matrices and dis
//plays their sum. Here is a sample run:
//Enter matrix1: 1 2 3 4 5 6 7 8 9   
//Enter matrix2: 0 2 4 1 4.5 2.2 1.1 4.3 5.2   
//The matrices are added as follows
// 1.0 2.0 3.0      0.0 2.0 4.0      1.0 4.0 7.0
// 4.0 5.0 6.0  +   1.0 4.5 2.2  =   5.0 9.5 8.2
// 7.0 8.0 9.0      1.1 4.3 5.2      8.1 12.3 14.2
// 
//  Scanner input = new Scanner(System.in);
//
//double[][] matrix1 = new double[3][3];
//double[][] matrix2 = new double[3][3];
//
//System.out.print("Enter matrix1: ");
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        matrix1[i][j] = input.nextDouble();
//    }
//}
//
//System.out.print("Enter matrix2: ");
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        matrix2[i][j] = input.nextDouble();
//    }
//}
//
//double[][] sum = addMatrix(matrix1, matrix2);
//
//System.out.println("The matrices are added as follows");
//
//for (int i = 0; i < 3; i++) {
//    for (int j = 0; j < 3; j++) {
//        System.out.printf("%6.1f", matrix1[i][j]);
//    }
//
//    if (i == 1)
//        System.out.print("  +  ");
//    else
//        System.out.print("     ");
//
//    for (int j = 0; j < 3; j++) {
//        System.out.printf("%6.1f", matrix2[i][j]);
//    }
//
//    if (i == 1)
//        System.out.print("  =  ");
//    else
//        System.out.print("     ");
//
//    for (int j = 0; j < 3; j++) {
//        System.out.printf("%6.1f", sum[i][j]);
//    }
//
//    System.out.println();
//}
//
//public static double[][] addMatrix(double[][] a, double[][] b) {
//    double[][] c = new double[a.length][a[0].length];
//
//    for (int i = 0; i < a.length; i++) {
//        for (int j = 0; j < a[i].length; j++) {
//            c[i][j] = a[i][j] + b[i][j];
//        }
//    }
//
//    return c;
//}


   //   8.8
   
//   All closest pairs of points) Revise Listing 8.3, FindNearestPoints.java, to display 
//all closest pairs of points with the same minimum distance. Here is a sample run:
// 
//Enter the number of points: 8 
//Enter 8 points: 0 0 1 1 −1 −1 2 2 −2 −2 −3 −3 −4 −4 5 5 
//The closest two points are (0.0, 0.0) and (1.0, 1.0)
//The closest two points are (0.0, 0.0) and (−1.0, −1.0)
//The closest two points are (1.0, 1.0) and (2.0, 2.0)
//The closest two points are (−1.0, −1.0) and (−2.0, −2.0)
//The closest two points are (−2.0, −2.0) and (−3.0, −3.0)
//The closest two points are (−3.0, −3.0) and (−4.0, −4.0)
//Their distance is 1.4142135623730951
//
//  Scanner input = new Scanner(System.in);
//
//System.out.print("Enter the number of points: ");
//int numberOfPoints = input.nextInt();
//
//double[][] points = new double[numberOfPoints][2];
//
//System.out.print("Enter " + numberOfPoints + " points: ");
//
//for (int i = 0; i < numberOfPoints; i++) {
//    points[i][0] = input.nextDouble();
//    points[i][1] = input.nextDouble();
//}
//
//double minDistance = distance(
//        points[0][0], points[0][1],
//        points[1][0], points[1][1]);
//
//for (int i = 0; i < points.length; i++) {
//    for (int j = i + 1; j < points.length; j++) {
//        double d = distance(
//                points[i][0], points[i][1],
//                points[j][0], points[j][1]);
//
//        if (d < minDistance) {
//            minDistance = d;
//        }
//    }
//}
//
//for (int i = 0; i < points.length; i++) {
//    for (int j = i + 1; j < points.length; j++) {
//        double d = distance(
//                points[i][0], points[i][1],
//                points[j][0], points[j][1]);
//
//        if (Math.abs(d - minDistance) < 1E-10) {
//            System.out.println(
//                    "The closest two points are (" +
//                    points[i][0] + ", " + points[i][1] +
//                    ") and (" +
//                    points[j][0] + ", " + points[j][1] + ")");
//        }
//    }
//}
//
//System.out.println("Their distance is " + minDistance);
//
// public static double distance(
//        double x1, double y1,
//        double x2, double y2) {
//
//    return Math.sqrt(
//            Math.pow(x2 - x1, 2) +
//            Math.pow(y2 - y1, 2));
//}
   

 // 8.9
 
// Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns 
//marking an available cell in a 3 * 3 grid with their respective tokens (either X 
//or O). When one player has placed three tokens in a horizontal, vertical, or diago
//nal row on the grid, the game is over and that player has won. A draw (no winner) 
//occurs when all the cells on the grid have been filled with tokens and neither 
//player has achieved a win. Create a program for playing a tic-tac-toe game.
//The program prompts two players to alternately enter an X token and O token. 
//Whenever a token is entered, the program redisplays the board on the console and 
//determines the status of the game (win, draw, or continue). Here is a sample run:
//
//
//   Scanner input = new Scanner(System.in);
//
//char[][] board = {
//        {' ', ' ', ' '},
//        {' ', ' ', ' '},
//        {' ', ' ', ' '}
//};
//
//char currentPlayer = 'X';
//
//while (true) {
//
//    for (int i = 0; i < 3; i++) {
//        System.out.println("| " + board[i][0] + " | "
//                + board[i][1] + " | "
//                + board[i][2] + " |");
//    }
//
//    System.out.print("Enter a row (0, 1, or 2) for player "
//            + currentPlayer + ": ");
//    int row = input.nextInt();
//
//    System.out.print("Enter a column (0, 1, or 2) for player "
//            + currentPlayer + ": ");
//    int column = input.nextInt();
//
//    if (board[row][column] != ' ') {
//        System.out.println("This cell is already occupied.");
//        continue;
//    }
//
//    board[row][column] = currentPlayer;
//
//    if (isWon(board, currentPlayer)) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("| " + board[i][0] + " | "
//                    + board[i][1] + " | "
//                    + board[i][2] + " |");
//        }
//
//        System.out.println("Player " + currentPlayer + " won");
//        break;
//    }
//
//    if (isFull(board)) {
//        for (int i = 0; i < 3; i++) {
//            System.out.println("| " + board[i][0] + " | "
//                    + board[i][1] + " | "
//                    + board[i][2] + " |");
//        }
//
//        System.out.println("It is a draw");
//        break;
//    }
//
//    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
//}
//
// public static boolean isWon(char[][] board, char player) {
//
//    for (int i = 0; i < 3; i++) {
//        if (board[i][0] == player &&
//            board[i][1] == player &&
//            board[i][2] == player) {
//            return true;
//        }
//    }
//
//    for (int i = 0; i < 3; i++) {
//        if (board[0][i] == player &&
//            board[1][i] == player &&
//            board[2][i] == player) {
//            return true;
//        }
//    }
//
//    if (board[0][0] == player &&
//        board[1][1] == player &&
//        board[2][2] == player) {
//        return true;
//    }
//
//    if (board[0][2] == player &&
//        board[1][1] == player &&
//        board[2][0] == player) {
//        return true;
//    }
//
//    return false;
//}
// 
// public static boolean isFull(char[][] board) {
//    for (int i = 0; i < 3; i++) {
//        for (int j = 0; j < 3; j++) {
//            if (board[i][j] == ' ') {
//                return false;
//            }
//        }
//    }
//
//    return true;
//}


   //    8.10
   
//   Largest row and column) Write a program that randomly fills in 0s and 1s into 
//a 4-by-4 matrix, prints the matrix, and finds the first row and column with the 
//most 1s. Here is a sample run of the program:
//Enter a row (0, 1, or 2) for player X:
//
//        
//        int[][] matrix = new int[4][4];
//
//for (int i = 0; i < 4; i++) {
//    for (int j = 0; j < 4; j++) {
//        matrix[i][j] = (int)(Math.random() * 2);
//        System.out.print(matrix[i][j]);
//    }
//    System.out.println();
//}
//
//int largestRowIndex = 0;
//int maxRowCount = 0;
//
//for (int i = 0; i < 4; i++) {
//    int count = 0;
//
//    for (int j = 0; j < 4; j++) {
//        if (matrix[i][j] == 1) {
//            count++;
//        }
//    }
//
//    if (count > maxRowCount) {
//        maxRowCount = count;
//        largestRowIndex = i;
//    }
//}
//
//int largestColumnIndex = 0;
//int maxColumnCount = 0;
//
//for (int j = 0; j < 4; j++) {
//    int count = 0;
//
//    for (int i = 0; i < 4; i++) {
//        if (matrix[i][j] == 1) {
//            count++;
//        }
//    }
//
//    if (count > maxColumnCount) {
//        maxColumnCount = count;
//        largestColumnIndex = j;
//    }
//}
//
//System.out.println("The largest row index: " + largestRowIndex);
//System.out.println("The largest column index: " + largestColumnIndex);


  //  8.11
  
//  Game: nine heads and tails) Nine coins are placed in a 3-by-3 matrix with some 
//face up and some face down. You can represent the state of the coins using a 
//3-by-3 matrix with values 0 (heads) and 1 (tails). Here are some examples:
//0 0 0    1 0 1    1 1 0    1 0 1    1 0 0
//0 1 0    0 0 1    1 0 0    1 1 0    1 1 1
//0 0 0    1 0 0    0 0 1    1 0 0    1 1 0
//  Each state can also be represented using a binary number. For example, the pre
//ceding matrices correspond to the numbers
//000010000 101001100 110100001 101110100 100111110
//  There are a total of 512 possibilities, so you can use decimal numbers 0, 1, 2, 3, . . . , 
//and 511 to represent all states of the matrix. Write a program that prompts the 
//user to enter a number between 0 and 511 and displays the corresponding matrix 
//with the characters H and T. In the following sample run, the user entered 7, which 
//corresponds to 000000111. Since 0 stands for H and 1 for T, the output is correct. 
//        
//        
//        Scanner input = new Scanner(System.in);
//
//System.out.print("Enter a number between 0 and 511: ");
//int number = input.nextInt();
//
//String binary = Integer.toBinaryString(number);
//
//while (binary.length() < 9) {
//    binary = "0" + binary;
//}
//
//for (int i = 0; i < 9; i++) {
//    if (binary.charAt(i) == '0') {
//        System.out.print("H ");
//    } else {
//        System.out.print("T ");
//    }
//
//    if ((i + 1) % 3 == 0) {
//        System.out.println();
//    }
//}


//  8.13

//   Locate the largest element) Write the following method that returns the location 
//of the largest element in a two-dimensional array:
//public static int[] locateLargest(double[][] a)
//The return value is a one-dimensional array that contains two elements. These 
//two elements indicate the row and column indices of the largest element in the 
//two-dimensional array. If there are more than one largest element, return the 
//smallest row index and then the smallest column index.
//Write a test program that prompts the user to enter a two-dimensional array and 
//displays the location of the largest element in the array. Here is a sample run:
//Enter the number of rows and columns of the array: 3 4 
//Enter the array:
//23.5 35 2 10 
//4.5 3 45 3.5 
//35 44 5.5 9.6 
//The location of the largest element is at (1, 2)
//
//
// Scanner input = new Scanner(System.in);
//
//System.out.print("Enter the number of rows and columns of the array: ");
//int rows = input.nextInt();
//int columns = input.nextInt();
//
//double[][] array = new double[rows][columns];
//
//System.out.println("Enter the array:");
//
//for (int i = 0; i < rows; i++) {
//    for (int j = 0; j < columns; j++) {
//        array[i][j] = input.nextDouble();
//    }
//}
//
//int[] location = locateLargest(array);
//
//System.out.println("The location of the largest element is at ("
//        + location[0] + ", " + location[1] + ")");
    


   //  8.14

   
//    Explore matrix) Write a program that prompts the user to enter the length of a 
//square matrix, randomly fills in 0s and 1s into the matrix, prints the matrix, and 
//finds the rows, columns, and diagonals with all 0s or 1s. Here is a sample run of 
//the program:
//Programming Exercises  313
//Enter the size for the matrix: 4 
//0111
//0000
//0100
//1111
//All 0s on row 2
//All 1s on row 4
//No same numbers on a column
//No same numbers on the major diagonal
//No same numbers on the sub−diagonal
//        
//        
//        Scanner input = new Scanner(System.in);
//
//System.out.print("Enter the size for the matrix: ");
//int size = input.nextInt();
//
//int[][] matrix = new int[size][size];
//
//for (int i = 0; i < size; i++) {
//    for (int j = 0; j < size; j++) {
//        matrix[i][j] = (int)(Math.random() * 2);
//        System.out.print(matrix[i][j]);
//    }
//    System.out.println();
//}
//
//boolean foundRow = false;
//
//for (int i = 0; i < size; i++) {
//    boolean all0 = true;
//    boolean all1 = true;
//
//    for (int j = 0; j < size; j++) {
//        if (matrix[i][j] != 0)
//            all0 = false;
//        if (matrix[i][j] != 1)
//            all1 = false;
//    }
//
//    if (all0) {
//        System.out.println("All 0s on row " + (i + 1));
//        foundRow = true;
//    }
//
//    if (all1) {
//        System.out.println("All 1s on row " + (i + 1));
//        foundRow = true;
//    }
//}
//
//if (!foundRow)
//    System.out.println("No same numbers on a row");
//
//boolean foundColumn = false;
//
//for (int j = 0; j < size; j++) {
//    boolean all0 = true;
//    boolean all1 = true;
//
//    for (int i = 0; i < size; i++) {
//        if (matrix[i][j] != 0)
//            all0 = false;
//        if (matrix[i][j] != 1)
//            all1 = false;
//    }
//
//    if (all0) {
//        System.out.println("All 0s on column " + (j + 1));
//        foundColumn = true;
//    }
//
//    if (all1) {
//        System.out.println("All 1s on column " + (j + 1));
//        foundColumn = true;
//    }
//}
//
//if (!foundColumn)
//    System.out.println("No same numbers on a column");
//
//boolean major0 = true;
//boolean major1 = true;
//
//for (int i = 0; i < size; i++) {
//    if (matrix[i][i] != 0)
//        major0 = false;
//    if (matrix[i][i] != 1)
//        major1 = false;
//}
//
//if (major0)
//    System.out.println("All 0s on the major diagonal");
//else if (major1)
//    System.out.println("All 1s on the major diagonal");
//else
//    System.out.println("No same numbers on the major diagonal");
//
//boolean sub0 = true;
//boolean sub1 = true;
//
//for (int i = 0; i < size; i++) {
//    if (matrix[i][size - 1 - i] != 0)
//        sub0 = false;
//    if (matrix[i][size - 1 - i] != 1)
//        sub1 = false;
//}
//
//if (sub0)
//    System.out.println("All 0s on the sub-diagonal");
//else if (sub1)
//    System.out.println("All 1s on the sub-diagonal");
//else
//    System.out.println("No same numbers on the sub-diagonal");



             
        
        
   
    }
    
}

