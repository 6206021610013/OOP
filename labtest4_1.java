import java.util.Scanner;
public class labtest4_1 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int snum, endnum ;
        System.out.print("Enter start number : ");
        snum = scan.nextInt();
        System.out.print("Enter end number : ");
        endnum = scan.nextInt();
        int count = 0 ;
        while (snum < endnum){
            snum++ ;
            if(snum % 3 == 0 && snum % 5 == 0){
                System.out.print(snum+ "\t");
                count++ ;
                if (count % 5 == 0){
                    System.out.println("");
                    count = 0 ;
                }
            }
        }
    }
}
