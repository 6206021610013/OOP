import java.util.Scanner;

public class caltriangle {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int key ;
        double ans;
        System.out.print("Select 1.(Rectangle) or 2.(Triangle) : ");
        key = scan.nextInt();
        switch(key){
            case 1 :
                float w, l ;
                System.out.print("Enter width : ");
                w = scan.nextFloat();
                System.out.print("Enter length : ");
                l = scan.nextFloat();
                ans = w * l ;
                System.out.println("Rectangle Area = "+ans);
                break;  
            case 2 :
                float b, h ;
                System.out.print("Enter base : ");
                b = scan.nextFloat();
                System.out.print("Enter height : ");
                h = scan.nextFloat();
                ans = 0.5 * b * h ;
                System.out.println("Triangle Area = "+ans);
                break;
            default :
                System.out.println("No option");
        }
    }
}