import java.util.Scanner;
public class lebtest4_3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num, i=2 ;
        System.out.print("Enter positive number : ");
        num = scan.nextInt();
        while(true){
            if (i >= num) break ;
            if((num % i)== 0) break ;
            i++ ;
        }
        if(i != num){
            System.out.println("Number " +num+ " is not prime number.");
        }
        else System.out.println("Number " +num+ " is prime number.");
    }   
}
