import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class Start {
    public static void main(String[] args) {
       PanelView pl=new PanelView();
       pl.jf.setVisible(true);
    }
}
class PanelView {
    JFrame jf;
    JPanel jp;
    JLabel idLabel,nameLabel,gradeLabel,CreditLabel;
    JTextField idField,nameField,gradeField,CreditField;
    JButton submit;
    JTextArea outputArea;
    PanelView(){
    jf=new JFrame("Student Information");
    jf.setSize(800,500);
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jp=new JPanel();
    jp.setLayout(null);
    //id----student
    idLabel=new JLabel("ID:");
    idLabel.setBounds(50,30,80,30);
    jp.add(idLabel);
    idField=new JTextField();
    idField.setBounds(135,30,200,30);
    jp.add(idField);
    //name----student
    nameLabel=new JLabel("Name:");
    nameLabel.setBounds(50,70,80,30);
    jp.add(nameLabel);
    nameField=new JTextField();
    nameField.setBounds(135,70,200,30);
    jp.add(nameField);
    //grade----student
    gradeLabel=new JLabel("Grade:");
    gradeLabel.setBounds(50,110,80,30);
    jp.add(gradeLabel);
    gradeField=new JTextField();
    gradeField.setBounds(135,110,80,30);
    jp.add(gradeField);
//-------------------------------
    CreditLabel = new JLabel("Credit:");
    CreditLabel.setBounds(230,110,80,30);
    jp.add(CreditLabel);
    CreditField=new JTextField();
    CreditField.setBounds(300,110,80,30);
    jp.add(CreditField);
    //----------------------
    submit=new JButton("Submit");
    submit.setBounds(135,160,160,30);
    jp.add(submit);
    jf.add(jp);
    submit.addActionListener(new SubmitAction(idField,nameField,gradeField,CreditField,jf));
    }
}
class SubmitAction implements ActionListener{
    JTextField idField,nameField,gradeField,CreditField;
    JFrame jf;
   SubmitAction(JTextField idField,JTextField nameField,JTextField gradeField,JTextField CreditField,JFrame jf){
       this.idField= idField;
       this.nameField=nameField;
       this.gradeField=gradeField;
       this.CreditField=CreditField;
       this.jf=jf;
    }public void actionPerformed(ActionEvent ae){
        System.out.println("id button Clicked"+idField.getText());
        System.out.println("name button Clicked"+nameField.getText());
        System.out.println("grade button Clicked"+gradeField.getText());
        System.out.println("credit button Clicked"+CreditField.getText());
        File f=new File("super.txt");
        FileWriter fw = null;
        try {
            fw=new FileWriter(f,true);
            fw.write(idField.getText() + "," + nameField.getText()+ "," + gradeField.getText() +  "," + CreditField.getText()+"\n");
             Cgpa cg = new Cgpa();
            jf.setVisible(false);
            cg.jf.setVisible(true);
        }catch(IOException ioe) {
            System.out.println("Error while creating a new file");
        } finally {
            try {
                fw.close();
            } catch(Exception ex) {
                System.out.println("Error while closing the file");
            }
        }
   }
}
class Cgpa{
    JFrame jf;
    JPanel jp;
    JTextArea area;
    JButton backBtn;
    Cgpa(){
        jf = new JFrame("List of Student Information");
        jf.setSize(800, 500);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jp = new JPanel();
        jp.setLayout(null);

        File f = new File("super.txt");

        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(f);
            br = new BufferedReader(fr);

            String line;
            String data = "";
            while((line = br.readLine()) != null) {
                data += line + "\n";
            }

            area = new JTextArea(data);
            area.setBounds(50, 50, 700, 400);

            jp.add(area);

        } catch(IOException ioe) {
            System.out.println("Error while reading the file");
        }
        backBtn =new JButton("back");
        backBtn.setBounds(50,410,100,30);
        jp.add(backBtn);
        jf.add(jp);
    }
}
