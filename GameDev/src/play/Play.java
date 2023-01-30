package play;

import java.util.Scanner;

public class Play {

    private int target;

    public Play(){
        target = (int)(Math.random() * 100) + 1;
    }

    public void play(){
        Scanner in = new Scanner(System.in);
        int guess;
        do{
            System.out.print("Guess the number(1-100): ");
            guess = in.nextInt();
            if(guess < target){
                System.out.println("Too low.");
            }else if (guess > target) {
                System.out.println("Too High.");
            }
        }while (guess != target);
        System.out.println("Correct! The target was " + target);
    }

}
