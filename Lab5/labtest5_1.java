package Lab5;
import javax.swing.JOptionPane;

public class labtest5_1 {
    public static void main(String [] args) {
        int num ;
        String numstr;
        numstr = JOptionPane.showInputDialog("Enter number of score :" );
        num = Integer.parseInt(numstr);
        int sum = getScore(num);
        String output = "Average score is "+ sum;
        JOptionPane.showMessageDialog( null, output,"Result", JOptionPane.INFORMATION_MESSAGE );
        System.exit(0);
    }
    public static int getScore(int num){
        int score = 0;
        String scorestr ;
        int total = 0 ;
        for(int i = 1 ; i <= num ; i++){
            scorestr = JOptionPane.showInputDialog("Enter score "+ i +" :" );
            score = Integer.parseInt(scorestr);
            total += score ;
        }
        int result = average(num,total);
        return (result);
    }
    public static int average(int num, int total){
        int avg = 0 ;
        avg = total / num ;
        return (avg) ;
    }
}
