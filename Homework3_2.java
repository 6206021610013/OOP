import java.util.Scanner;

public class Homework3_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int date;
        System.out.print("Enter DATE : ");
        date = scan.nextInt();
        if (date == 28 || date == 29) {
            System.out.print("February");
        } else if (date == 30) {
            System.out.print("April" + "\n" + "June" + "\n" + "September" + "\n" + "November");
        } else if (date == 31) {
            System.out.print(
                    "January" + "\n" + "March" + "\n" + "May" + "\n" + "July" + "\n" + "August" + "\n" + "December");
        } else {
            System.out.print("ไม่สามารถเเสดงผลได้ ระบุข้อมูลไม่ถูกต้อง");
        }
    }
}
