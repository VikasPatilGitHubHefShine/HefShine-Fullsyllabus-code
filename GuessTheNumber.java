import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import org.w3c.dom.ranges.Range;
public class GuessTheNumber 
{
    public static void main(String[] args) 
    {
        
        int number = ThreadLocalRandom.current().nextInt(1,10);
        System.out.println("WELCOME" + number + "...");
        Scanner input = new Scanner(System.in);
        int num = 0;
        for(int i = 0; i < 3; i++)
        {
            System.out.print("Enter the number :- ");
            int guessNum = input.nextInt();
            num = guessNum;
                if(number == guessNum)
            {
                System.out.println("Congratulations.." + "\n" + "You are the winner");
                break;
            }
            
            System.out.println("You have only :- " + (2 - i) + " try");
        }
        if(number != num)
        {
            System.out.println("Better luck next time");
            System.out.println("The number was :- " + number);

        }


    }
}
