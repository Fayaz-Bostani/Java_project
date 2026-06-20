package grade_exam;
public class Grade_Exam {
    public static void main(String[] args) {
     char [][] answers =              {
         {'A',   'B',   'A',   'C',   'C',    'D',   'E',   'E',   'A',   'D'},
         {'D',   'B',   'A',   'B',   'C',    'A',   'E',   'E',    'A',   'D'},
         {'E',    'D',   'D',   'A',   'C',   'B',   'E',   'E',    'A',    'D'},
         {'B',     'B',   'E',   'A',   'D',   'D',   'A',   'C',   'C',    'C'},
         {'C',    'D',    'A',   'A',   'E',   'C',   'B',   'D',   'D',    'E'},
         {'D',     'B',   'D',   'C',   'C',   'D',   'A',   'E',   'A',    'D'}, 
         {'C',   'C',   'D',   'D',   'B',   'A',   'A',   'E',   'A',   'B'},
         {'A',   'D',   'D',   'D',   'C',   'C',   'D',   'A',   'E',   'A'}
                                                  };
     
     
         char [] keys =  {'C',   'C',   'D',   'D',   'B',   'A',   'A',   'E',   'A',   'B'};
         
         
        for (int i = 0 ; i < answers.length ; i++){
            int correct_count = 0;
            for (int j = 0 ; j< answers[i].length ; j++){
                if (answers[i][j] == keys[j])
                    correct_count++;
            }
            System.out.println("correct counts for student" + i + " is: " + correct_count);
        }
     
    }
    
}
