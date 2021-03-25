package Lab5;
import javax.swing.JOptionPane;

public class lab5_3 {
    public static void main(String[] args) {
        int value;
        String output = "";
        int number1, number2 ;
        String s1, s2 ;
        s1 = JOptionPane.showInputDialog(
        "Enter start number :" );
        s2 = JOptionPane.showInputDialog(
        "Enter end number :" );
        number1 = Integer.parseInt( s1 );
        number2 = Integer.parseInt( s2 );
        for ( int counter = 1; counter <= 20; counter++ ) {
            value = number1 + ( int ) ( Math.random() * (number2-number1)+1 );
            output += value + " ";
            if ( counter % 5 == 0 )
            output += "\n";
        } 
        JOptionPane.showMessageDialog( null, output,"20 Random Numbers from 1 to 6",JOptionPane.INFORMATION_MESSAGE );
        System.exit( 0 );
    }
}
