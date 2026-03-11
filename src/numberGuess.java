import java.util.Random;
import java.util.Scanner;

public class numberGuess {
    static void main() {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100)+1;
        int guess = 0;
        int chances =5;
        System.out.println("WELCOME!!");
        while(guess!=number){

            System.out.println("you have got "+chances+" left");
            chances--;
            System.out.println("please enter the number:");
            guess = scan.nextInt();
            if(guess < number)
                System.out.println("Too Low!");
            else if(guess>number)
                System.out.println("Too High!");
            else
                System.out.println("Yip! you got the number!!");
        }
    }
}
