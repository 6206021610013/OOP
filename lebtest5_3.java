import java.util.Scanner;
public class lebtest5_3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Guess char : ");
        char ans = scan.next().charAt(0);
        char randomLetter = (char) ('a' + Math.random() * ('z'-'a' + 1));
        System.out.println(randomLetter);
        if(randomLetter == ans){
            System.out.print("You win! => random char is" +randomLetter);
        }
        else {
            System.out.print("You lose! => random char is " +randomLetter);
        }
    }
}
