package inheritance;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;
public final class Grades extends JFrame implements ActionListener {
  Student std[];
  Subject sub[];
  String[] studentStr, subjectStr;
  Container container;
  JComboBox<String> stdCombo, subCombo;
  JLabel stdLabel, subLabel;
  JButton addstdBtn, addsubBtn, saveBtn, clearBtn, cancleBtn;
  JTextField stdText;
  JTextArea subTextArea, subTextArea2 ;
  JScrollPane subScroll , subScroll2;
  Register reg ;
  int count = 0;

  public Grades() {
    super("Program Student Register");
    initStudent();
    initSubject();
    initGui();
    reg = new Register(new Student(), 50);
  }

  public void initStudent() {
    std = new Student[3];
    studentStr = new String[3];
    std[0] = new Student("5066260010","AAAAA","BBBBBBBBBBB");
    std[1] = new Student("5066260024","DDDDD","GGGGGGGGGG");
    std[2] = new Student("5066260035","HHHHH","KKKKKKKKKKK");
    studentStr[0] = std[0].toString();
    studentStr[1] = std[1].toString();
    studentStr[2] = std[2].toString();
  }
  public void initSubject() {
    sub = new Subject[5];
    subjectStr = new String[5];
    sub[0] = new Subject("      662305 ","                IT Laboratory II                            ",1  );
    sub[1] = new Subject("      662309 ","                Data Structure                              ",3  );
    sub[2] = new Subject("      662310 ","                Database System                             ",3  );
    sub[3] = new Subject("      662317 ","                Data Communication                          ",3  );
    sub[4] = new Subject("      662327 ","                Advanced Computer Programming             ",3  );
    subjectStr[0] = sub[0].toString();
    subjectStr[1] = sub[1].toString();
    subjectStr[2] = sub[2].toString();
    subjectStr[3] = sub[3].toString();
    subjectStr[4] = sub[4].toString();
  }

  public void initGui() {
    container = getContentPane();
    container.setLayout(new FlowLayout());
    stdLabel = new JLabel("Select Student : ");
    container.add(stdLabel);
    stdCombo = new JComboBox<String>( studentStr );
    stdCombo.setMaximumRowCount(3);
    container.add(stdCombo);
    addstdBtn = new JButton("Add Student");
    addstdBtn.addActionListener(this);
    container.add(addstdBtn);
    stdText = new JTextField(40);
    stdText.setEditable(false);
    container.add(stdText);
    subLabel = new JLabel("Select Subject : ");
    container.add(subLabel);
    subCombo = new JComboBox<String>( subjectStr );
    subCombo.setMaximumRowCount(5);
    container.add(subCombo);
    addsubBtn = new JButton("Add Subject");
    addsubBtn.setEnabled(false);
    addsubBtn.addActionListener(this);
    container.add(addsubBtn);
    subTextArea = new JTextArea(35,80);
    subTextArea.setEditable(false);
    subTextArea.setText("|   CodeStudent   |                  SubjectName                     |   Credits   |    Mind    |    Homework   |       Subtest     |        Midterm     |          Final        |         All Score      |        Grade     |\n");
    subScroll = new JScrollPane(subTextArea);
    container.add(subScroll);
    saveBtn = new JButton(" Save ");
    saveBtn.setEnabled(false);
    saveBtn.addActionListener(this);
    container.add(saveBtn);

    cancleBtn = new JButton(" Cancle ");
    cancleBtn.setEnabled(false);
    cancleBtn.addActionListener(this);
    container.add(cancleBtn);
    //setSize(550,350);
    setBounds(400, 20, 1000, 800);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent event) {
    String output2 ="";
    int m = 0 ;
    int h = 0;
    int s = 0;
    int mid = 0;
    int fin  = 0;
    String Grade;
    Random rand = new Random();
    m =  rand.nextInt(5) + 0;
    h =  rand.nextInt(15) + 0;
    s =  rand.nextInt(10) + 0;
    mid = rand.nextInt(35) + 0;
    fin = rand.nextInt(35) + 0;
  
    if((m+h+s+mid+fin) >= 0 && (m+h+s+mid+fin) <= 100){
      if((m+h+s+mid+fin)>= 80 ) Grade = "A";
      else if((m+h+s+mid+fin) >= 75 ) Grade = "B+";
      else if((m+h+s+mid+fin) >= 70 ) Grade = "B";
      else if((m+h+s+mid+fin) >= 65 ) Grade = "C+";
      else if((m+h+s+mid+fin) >= 60 ) Grade = "C";
      else if((m+h+s+mid+fin) >= 55 ) Grade = "D+";
      else if((m+h+s+mid+fin) >= 50 ) Grade = "D";
      else Grade = "F";
      output2 += ( "\t                          " + m + "\t" + h + "\t" + s + "\t" + mid + "\t" + fin  + "\t" + (m+h+s+mid+fin) + "\t" + Grade +"\t\n");
    }
    else {
      output2 +=  ("");
    }
    
    if (event.getSource() == addstdBtn) {
      int n = stdCombo.getSelectedIndex();
      stdText.setText(std[n].toString());
      reg.setStudent(std[n]);
      addstdBtn.setEnabled(false);
      addsubBtn.setEnabled(true);
      saveBtn.setEnabled(true);
      cancleBtn.setEnabled(true);
    }
    else if (event.getSource() == addsubBtn) {
      int n = subCombo.getSelectedIndex();
      //Set Grade

      subTextArea.append(sub[n].toString()+ output2 +"\n");
      reg.setSubject(sub[n], count);
      count++;
      if (count == 5 ) addsubBtn.setEnabled(false);
    }
    else if (event.getSource() == saveBtn) {
      String output="";
      output = "Student :" + reg.getStudent();
      output += "\nSubject:\n";
      for(int n = 0 ; n < count; n++)
      output += reg.getSubject(n) + "\n";
      JOptionPane.showMessageDialog(this, output,
      "Registration Data",JOptionPane.INFORMATION_MESSAGE);
      resetBtn();
    }
    else if (event.getSource() == cancleBtn) {
      stdText.setText("");
      subTextArea.setText("");
      count = 0;
      resetBtn();
    }
  }
  public void resetBtn() {
    addstdBtn.setEnabled(true);
    addsubBtn.setEnabled(false);
    saveBtn.setEnabled(false);
    cancleBtn.setEnabled(false);
    stdText.setText("");
    subTextArea.setText("");
  }
  public static void main(String[] args) {
    Grades lab9_1 = new Grades();
  }
}