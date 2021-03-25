import java.util.Scanner;
public class Homework1_3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        String num ;
        String n1,n2,n3,n4;
        System.out.print("Enter String : ");
        num = scan.nextLine();
        n1 = num.substring(0,1);
        n2 = num.substring(1,2);
        n3 = num.substring(2,3);
        n4 = num.substring(3,4);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    } 
}
