import java.util.Scanner;

public class Homework1_1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double celcius, f;
        System.out.print("Enter celcius : ");
        celcius = scan.nextDouble();
        f = (1.8 * celcius) + 32 ;
        System.out.println("Fahrenheit = " +f);
    }
}
