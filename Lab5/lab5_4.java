package Lab5;
import javax.swing.JOptionPane;

public class lab5_4 {
    public static void main(String[] args) {
        int num1, num2;
        String s1, s2;
        s1 = JOptionPane.showInputDialog("Enter first number :" );
        num1 = Integer.parseInt(s1);
        s2 = JOptionPane.showInputDialog("Enter last number :" );
        num2 = Integer.parseInt(s2);
        int sum = Sumation(num1, num2);
        String output = " Sum of "+ num1 +" to " + num2 + " is " + sum;
        JOptionPane.showMessageDialog( null, output,
        "Sumation", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }

    public static int Sumation(int startn, int endn){
        int total = 0 ;
        if (startn < endn){
            total += ( endn + Sumation(startn, endn-1));
            return total ;
        }
        else return (startn);
    }
}
