import java.util.Scanner;

public class Homework1_2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        float i, total, avg=0 ;
        final int p;
        int j;
        System.out.print("Enter Principal : ");
        p = scan.nextInt();
        System.out.print("Enter Interate : ");
        i = scan.nextFloat();
        
        for( j=1 ; j<=5 ; j++){
            avg += p+p*(i/100);
            System.out.println("Savings " +j+ " years : " +avg);
        }
        
    }
    
}
