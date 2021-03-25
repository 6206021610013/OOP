import java.util.Scanner;
public class labtest5_1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num, i=1 ;
        int ans=1 ;
        System.out.print("Enter factorial number : ");
        num = scan.nextInt();
        while(i <= num){
            System.out.print(i) ;
            ans *= i ;
            i++;
            System.out.print("*");
        }
        System.out.print(" = " +ans);
    }
}
