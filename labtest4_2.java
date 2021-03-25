import java.util.Scanner;

public class labtest4_2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        long num, checknum ;
        int even=0, odd=0, zero=0 ;
        System.out.print("Enter positive number : ");
        num = scan.nextLong();

        while(num > 0){
            checknum = num % 10 ;
            if(checknum % 2 == 0 && checknum > 0){
                even += 1 ;
            }
            else if(checknum % 2 != 0 && checknum > 0){
                odd += 1 ;
            }
            else if(checknum == 0){
                zero += 1 ;
            }
            num /= 10 ;
        }
        System.out.println("Odd digit : " +odd);
        System.out.println("Even digit : " +even);
        System.out.println("Zero digit : " +zero);
    }
}
