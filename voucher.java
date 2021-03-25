import java.util.Scanner;

public class voucher {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num ;
        float fp;
        double dc=0, total=0 ;
        System.out.print("Num of customer : ");
        num = scan.nextInt();
        System.out.print("Food Price : ");
        fp = scan.nextFloat();
        System.out.println("***************************************");
        System.out.println("Num of customer = " +num);
        System.out.println("Food Price = " +fp);
        if(num >= 23){
            System.out.println("You get discount 40% ");
            dc = (40*fp)/100  ;
        }
        else if(num >= 21){
            System.out.println("You get discount 35% ");
            dc = (35*fp)/100 ;
        }
        else if(num >= 18){
            System.out.println("You get discount 30% ");
            dc = (30*fp)/100 ;
        }
        else if(num >= 15){
            System.out.println("You get discount 20% ");
            dc = (20*fp)/100 ;
        }
        else if(num >= 11){
            System.out.println("You get discount 13% ");
            dc = (13*fp)/100 ;
        }
        else if(num >= 6){
            System.out.println("You get discount 12% ");
            dc = (12*fp)/100 ;
        }
        else if(num >= 3){
            System.out.println("You get discount 5% ");
            dc = (5*fp)/100 ;
        }
        else{
            System.out.println("You din't get a discount");
            dc = 0 ;
        }
        System.out.println("The discount you get " +dc+ "฿");
        total = fp - dc;
        System.out.println("Food Price + discount = " +total+ "฿");
        System.out.println("Amount + (VAT7%) = " +(total+(total*7)/100)+ "฿");
        System.out.println("***************************************");
    }
}
