package Lab5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class labtest5_3 {
    public static void main(String [] args) {
        JTextArea outputArea = new JTextArea();
        int num ;
        String numstr, output = "";
        do{
            numstr = JOptionPane.showInputDialog("Enter number :" );
            num = Integer.parseInt(numstr);
            if(num != -1){
                output += num + " : " ;
                output += printChar(num);
                output += "\n" ;
                outputArea.setText(output);
            }
        }while(num != -1);
        JOptionPane.showMessageDialog( null, outputArea,"Histrogram", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static String printChar(int n){
        String output = "";
        for(int i = 0 ; i < n ; i++){
            output += "*" ;
        }
        return output ;
    }

}
