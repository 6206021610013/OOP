package lab6;
import javax.swing.JOptionPane;

public class lab6_2 {
    public static void main(String[] args) {
        int score[] = new int[10];
        String output = "";
        for(int n = 0 ; n < score.length ; n++)
        score[n] = rnd(100,500);
        for(int n = 0; n < score.length ; n++)
        output += "Score " + (n+1) + " : " +score[n] + "\n";
        output += "Minimum value is " + getMin(score) + "\n";
        output += "Maximum value is " + getMax(score) + "\n";
        output += "Average value is " + getAverage(score) + "\n";
        JOptionPane.showMessageDialog( null, output ,
        "Display Score in Array", JOptionPane.INFORMATION_MESSAGE );
    }
    public static int getMin(int data[]) {
        int min = 1000 ;
        for(int i=0 ; i < data.length ; i++){
            if(min > data[i]){
                min = data[i];
            }
        }
        return (min);
    }
    public static int getMax(int data[]) {
        int max = 0 ;
        for(int i=0 ; i < data.length ; i++){
            if(max < data[i]){
                max = data[i];
            }
        }
        return (max);
    }
    public static int getAverage(int data[]) {
        int avg = 0 ;
        for(int i=0 ; i < data.length ; i++){
            avg += data[i] ;
        }
        avg = (avg / data.length) ;
        return (avg);
    }
    public static int rnd(int st, int ed) {
    int offset = ed - st +1;
    return (st + (int) (Math.random() * offset));
    }
}