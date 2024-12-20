import java.util.*;
public class Number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100)+1;
        
        boolean x = true;
        while(x){
            int guess = sc.nextInt();
            if(guess == num){
                System.out.println("You guessed it!");
                x = false;
        } else if(guess < num){
            System.out.println("Too low!");
        } else{
            System.out.println("Too high!");
        }
    }
    sc.close();
}
}