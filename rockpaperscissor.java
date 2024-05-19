import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOOSE ROCK(1) PAPER(2) OR SCISSOR(3)");
        int num = sc.nextInt();
        if (num==1){
            System.out.println("YOU Have choosen rock");
        }
        if (num==2){
            System.out.println("you have choosen paper");
        }
        if (num==3){
            System.out.println("you have choosen scissor");
        }

        Random ran = new Random();
        int b = ran.nextInt(1,4);
        if(b==1){
            System.out.print("PC has picked stone.");
        }
        else if(b==2){
            System.out.print("PC has picked Paper.");
        }
        else if(b==3){
            System.out.print("PC has picked scissor.");
        }
        if(num==1 & b==1){
            System.out.print("The game is draw");
        }
        else if(num==1 & b==2){
            System.out.print("PC is the winner");
        }
        else if(num==1 & b==3){
            System.out.print("You are the winner");
        }
        else if(num==2 & b==1){
            System.out.print("PC the winner");
        }
        else if(num==2 & b==2){
            System.out.print("The game is draw");
        }
        else if(num==2 & b==3){
            System.out.print("PC is the winner");
        }
        else if(num==3 & b==1){
            System.out.print("PC is the winner");
        }
        else if(num==3 & b==2){
            System.out.print("You are the winner");
        }
        else if(num==3 & b==3){
            System.out.print("The game is draw");
        }
    }
}
