package var_args_demo;
public class Var_Args_Demo {
    public static void main(String[] args) {
        printMax(4 , 84.5 , 86.4 , 10);
        printMax(new double []{56 , 42 , 11.7});
    }
    public static void printMax(double ... numbers){
        if (numbers.length == 0){
            System.out.println("No argument is passed!");
        return ;        // از میتود خارج میشود         
    }
    double result = numbers[0];
    for (int i = 1 ; i < numbers.length ; i++){
        if (numbers[i] > result )
            result = numbers[i];
    }
        System.out.println("Maximum number is:  " + result);
    }
}
