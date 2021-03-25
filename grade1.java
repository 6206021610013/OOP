import java.util.Random;

public class grade1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] student = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 };
        System.out.println("Student" + " " + "Mind" + " " + "Homework" + " " + "Subtest" + " " + "Mindterm" + " "
                + "Final" + " " + "  " + "sum" + "  " + "grade");
        for (int i = 0; i < 40; ++i) {
            Random rn = new Random();
            int mind = rn.nextInt(5) + 0;
            int mid = rn.nextInt(35) + 0;
            int fin = rn.nextInt(35) + 0;
            int homework = rn.nextInt(15) + 0;
            int subtest = rn.nextInt(10) + 0;
            sum = (mind + mid + fin + homework + subtest);
            System.out.println(student[i] + "\t" + mind + "\t" + homework + "\t" + subtest + "\t" + mid + "\t" + fin + "\t" + sum + "\t" + grade(sum));
        }
    }
    public static char grade(int sum) {
        char grade = ' ';
        if (sum >= 80) {
            grade = 'A';
        } else if (sum >= 70) {
            grade = 'B';
        } else if (sum >= 60) {
            grade = 'C';
        } else if (sum >= 50) {
            grade = 'D';
        } else if (sum < 50) {
            grade = 'F';
        }
        return grade;
    }
}
