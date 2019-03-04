package Week2.IfStatements;

import java.util.Scanner;

public class BMICategories{

        public static void main(String[] args){
            Scanner keyboard = new Scanner(System.in);
            System.out.print("Your height: ");
            double height = keyboard.nextDouble();
            String category="";

            System.out.print("Your weight: ");
            int weight = keyboard.nextInt();
            System.out.println();

            double bmi=(weight/(height*height))*703;
            double roundOff = Math.round(bmi*100.0)/100.0;
            System.out.print("Your BMI is "+roundOff);
            System.out.println();

            if(bmi<=18.4){
                category="underweight";
            }
            else if(bmi>=18.5 && bmi<=24.9){
                category="normal weight";
            }
            else if(bmi>=25.0 && bmi<=29.9){
                category="overweight";
            }
            else if(bmi>=30){
                category="obese";
            }

            System.out.print("BMI Category: "+category);
        }
}
