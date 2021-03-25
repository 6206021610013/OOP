import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length, time, fare = 0, sumfare = 0, sumtime = 0, sum;
        System.out.print("Enter length : ");
        length = scan.nextDouble();
        System.out.print("Enter time : ");
        time = scan.nextDouble();
        if (length <= 1) {
            fare = 35;
        } else if (length <= 12) {
            fare = 5;
        } else if (length <= 20) {
            fare = 5.5;
        } else if (length <= 40) {
            fare = 6;
        } else if (length <= 60) {
            fare = 6.5;
        } else if (length < 80) {
            fare = 7.5;
        } else if (length >= 80) {
            fare = 8.5;
        }
        // System.out.print(fare);
        sumtime = time * 2;
        sum = fare * length;
        sumfare = sum + sumtime;
        System.out.print("TIME : " + sumtime + "\n" + time + "\n" + sum + "+" + sumtime + "=" + sumfare + "\n" + "SUM"
                + "=" + sumfare);
    }
}