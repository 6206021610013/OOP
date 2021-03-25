import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("วัน = ");
        int d = kb.nextInt();
        System.out.print("เดือน = ");
        int m = kb.nextInt();
        System.out.print("ปี(ค.ศ.) = ");
        int y = kb.nextInt();
        if (m < 3) {
            m = m + 12;
            y = y - 1;
        }
        int c = y / 100, k = y % 100;
        int w = (d + 26 * (m + 1) / 10 + k + k / 4 + c / 4 - 2 * c) % 7;
        if (w < 0) {
            w = w + 7;
        }
        if (w == 0) {
            System.out.println("วันเสาร์");
        }
        if (w == 1) {
            System.out.println("วันอาทิตย์");
        }
        if (w == 2) {
            System.out.println("วันจันทร์");
        }
        if (w == 3) {
            System.out.println("วันอังคาร");
        }
        if (w == 4) {
            System.out.println("วันพุธ");
        }
        if (w == 5) {
            System.out.println("วันพฤหัสบดี");
        }
        if (w == 6) {
            System.out.println("วันศุกร์");
        }
    }
}
