import java.util.Scanner;

public class Homework3_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name, lastname;
        String bonus1 = new String();
        float salary, bonus = 0, Sum = 0;
        System.out.print("Enter Name Emplyee : ");
        name = scan.next();
        System.out.print("Enter Lastname Emplyee : ");
        lastname = scan.next();
        System.out.print("Enter Salary Emplyee : ");
        salary = scan.nextFloat();
        if (salary <= 15000) {
            bonus1 = "0%";
            bonus = 0;
        } else if (salary <= 20000) {
            bonus = (salary * 7) / 100;
            bonus1 = "7%";
        } else if (salary <= 30000) {
            bonus = (salary * 10) / 100;
            bonus1 = "10%";
        } else if (salary <= 40000) {
            bonus = (salary * 12) / 100;
            bonus1 = "12%";
        } else if (salary <= 60000) {
            bonus = (salary * 13) / 100;
            bonus1 = "13%";
        } else if (salary <= 70000) {
            bonus = (salary * 14) / 100;
            bonus1 = "14%";
        } else if (salary > 70000) {
            bonus = (salary * 15) / 100;
            bonus1 = "15%";
        }
        Sum = (salary * 12) + bonus;
        System.out.print("Name : " + name + "\n " + " Lastname : " + lastname + " \n" + "salary:" + salary + " \n"
                + "bonus%:" + bonus1 + "\n" + "bonus(baht):" + bonus + "\n" + "salary all :" + Sum);
    }
}