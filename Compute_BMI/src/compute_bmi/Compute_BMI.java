package compute_bmi;

import java.util.Scanner;

public class Compute_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weigth in pounds: ");
        double weigth = input.nextDouble();
        System.out.print("Enter heigth in inches: ");
        double height = input.nextDouble();
        final double pound_per_kilogram = 0.45359237;
        final double inche_per_meter = 0.0254;
        
        double weight_in_kilogram = weigth * pound_per_kilogram;
        double height_in_meter =  height * inche_per_meter;
        double Bmi = weight_in_kilogram / (height_in_meter * height_in_meter);
        System.out.println("Bmi = " + Bmi);
        if (Bmi < 18.5)
            System.out.println("underweight");
        else if (Bmi < 25)
            System.out.println("Normal");
        else if (Bmi < 30)
            System.out.println("overweight");
        else 
            System.out.println("obese");
    }
    
}
