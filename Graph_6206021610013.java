import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
public class Graph_6206021610013 {
    String yearstr ;
    int year = 0 ;
    boolean c = true ;
    public static void main(String [] args){
        Graph_6206021610013 test = new Graph_6206021610013();
        test.start();
    }
    public void start(){
        Graph_6206021610013 test = new Graph_6206021610013();
        String numstr ;
        int num ;
        
        do{
            numstr = JOptionPane.showInputDialog("Main Menu\n===============\n1.Input num years\n2.Show graph\n3.Exit\nInput choice :\n");
            num = Integer.parseInt(numstr);
            if(num == 1){
                test.inputYear();
            }
            else if(num == 2){
                test.showHistogram();
            }
            else if(num == 3){
                test.exitProgram();
            }
            else{
                String output = "";
                output += "Fail! Please select another choice.";
                JOptionPane.showMessageDialog(null, output, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }while(c != false);
    }
    public void inputYear(){
        yearstr = JOptionPane.showInputDialog("Year number (1-9) : ");
        year = Integer.parseInt(yearstr);
    }
    public void showHistogram(){
        int yearnow = 2563 ;
        String output = "";
        JTextArea outputArea = new JTextArea();
        output += "Student histrogram "+year+" years\n";
        output += "------------------------------------------\n" ;
        for(int i = 0 ; i < year ; i++){
            output += yearnow + " : ";
            int showt = rnd(10,100);
            for(int j=0 ; j < showt ; j++){
                output += "*" ;
            }
            yearnow-- ;
            output += "("+showt+")";
            output += "\n" ; 
        }
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea, "Histrogram", JOptionPane.INFORMATION_MESSAGE);
    }
    public void exitProgram(){
        String output = "";
        output += "Exit Program" ;
        JOptionPane.showMessageDialog(null, output, "End Program", JOptionPane.WARNING_MESSAGE);
        System.exit(0);
    }

    public static int rnd(int st, int ed){
        int offset = ed - st +1;
        return (st + (int) (Math.random() * offset));
    }
}
