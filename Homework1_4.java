import java.util.Scanner;
public class Homework1_4{
    double salary ;

    public Homework1_4(double h, double r){
        salary = (h <= 40) ? (h*r) : (r * (1.5f * h - 20));
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hours=0, rate=0 ;
        System.out.print("Enter hours work : ");
        hours = scan.nextDouble();
        System.out.print("Enter hourly rate : ");
        rate = scan.nextDouble();
        Homework1_4 test = new Homework1_4(hours, rate);
        System.out.println("Employee get salary : " + test.salary);
    }
}
