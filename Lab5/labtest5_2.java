package Lab5;
import javax.swing.JOptionPane;

public class labtest5_2 {
    public static void main(String [] args) {
        long num ;
        String numstr;
        numstr = JOptionPane.showInputDialog("Enter number :" );
        num = Integer.parseInt(numstr);
        
        String output = "Number digit of "+ num +" is "+ countDigit(num) +" digits.";
        JOptionPane.showMessageDialog( null, output,"Result", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static long countDigit(long n){
        int count = 0;
        while (n != 0){
            n = n / 10;
            ++count;
        }
        return count;
    }
}
