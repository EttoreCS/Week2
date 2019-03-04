package Week2.IfStatements;

import java.util.Scanner;

public class ChooseYourOwnShortAdventure {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to Ettore's Adventure!");
        System.out.println("You are in a dungeon!  Would you like to go to the \"right\" or to the \"left\"?");
        System.out.print("> ");
        String ans = keyboard.next();
        System.out.println(" ");
        if(ans.equals("right")){
            System.out.println("There is a long hall of dwarf architecture with dead dwarf corpses everywhere. Off to one side there is a lever. You may \"pull\" the lever or \"leave\" it away.");
            System.out.print("> ");
            ans=keyboard.next();
            if(ans.equals("pull")){
                System.out.println(" ");
                System.out.println("When you pull the lever you see a hidden passage opening. It's very dark. Would you like to enter the passage? (\"yes\" or \"no\")");
                System.out.print("> ");
                ans=keyboard.next();
                if(ans.equals("yes")){
                    System.out.println();
                    System.out.println("After you enter the passage closes and the torches light up. You can see the old dwarf king skeleton on his throne holding the mighty Barakkar hammer, you take the hammer for your self, but realizes that's no way out, you are stuck like the old kingleft");
                }
                else if(ans.equals("no")){
                    System.out.println(" ");
                    System.out.println("You hear an horde of goblins approaching, when you turn around to look at the noise you are hit with an arrow in the forehead and die.");
                }
            }
            else if(ans.equals("leave")){
                System.out.println(" ");
                System.out.println("You walk away from the lever going deeper into the dungeon, you hear a noise behind you, do you want to check what it is?");
                System.out.print("> ");
                ans=keyboard.next();
                if(ans.equals("yes")){
                    System.out.println();
                    System.out.println("When you turn around to look at the noise you are hit with an arrow in the forehead and die.");
                }
                else if(ans.equals("no")){
                    System.out.println(" ");
                    System.out.println("You ignore the noise, you are hit with a sword in the back and die.");
                }
            }
        }
        else if(ans.equals("left")){
            System.out.println("You see an old door with some runes around it. You try to \"remember\" the rune lessons you had with Sir Balduir. But you realize that you can \"kick\" the door and it would probably open also. What would you like to do?");
            System.out.print("> ");
            ans=keyboard.next();
            if(ans.equals("remember")){
                System.out.println(" ");
                System.out.println("You focus on Sir Balduir lessons you learn when you were young, after some time you try to speak some words in dwarf language. The door start to crumble. You did it, now there's a room in front of you that you can enter. Would you like to enter? (\"yes\" or \"no\")");
                System.out.print("> ");
                ans=keyboard.next();
                if(ans.equals("yes")){
                    System.out.println(" ");
                    System.out.println("After entering the room you start to see shine gold pieces everywhere, crowns, gold coins, gold bars, precious stone. You have found the old treasure of Harak-Baldur!");
                }else if(ans.equals("no")){
                    System.out.println(" ");
                    System.out.println("After all your effort of remembering the lessons you realize you should go back to the kingdom to learn more.");
                }
            }
            else if(ans.equals("kick")){
                System.out.println(" ");
                System.out.println("You kick the door with all your strength, but nothing happens. Would you like to kick it again? (\"yes\" or \"no\")");
                System.out.print("> ");
                ans=keyboard.next();
                if(ans.equals("yes")){
                    System.out.println(" ");
                    System.out.println("You kick the door again, but this time you see an red light coming from the door, a magic fire ball comes to your direction, you burn and die in agony.");
                }
                else if(ans.equals("no")){
                    System.out.println(" ");
                    System.out.println("You think that if you can't open and old door with your strongest kick then you need to go back to the kingdom gym, and that is what you do.right");
                }
            }
        }
    }
}