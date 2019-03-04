package Week2.IfStatements;

import java.util.Scanner;

public class SpaceBoxing {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter current earth weight:");
        double Weight = keyboard.nextDouble();

        System.out.println("I have the information for the following planets:");
        System.out.println("1. Venus 2. Mars 3. Jupiter");
        System.out.println("4. Saturn 5. Uranus 6. Neptune");

        System.out.println("Wich planet are you visiting? ");
        int Choice = keyboard.nextInt();

        if (Choice == 1){
            Weight = Weight * 0.78;
        }

        else if (Choice == 2){
            Weight = Weight * 0.39;
        }

        else if (Choice == 3){
            Weight = Weight * 2.65;
        }

        else if (Choice == 4){
            Weight = Weight * 1.17;
        }

        else if (Choice == 5){
            Weight = Weight * 1.05;
        }

        else if (Choice == 6){
            Weight = Weight * 1.23;
        }

        System.out.println("Your weight would be " + Weight + " pounds on that Planet." );
    }
}
