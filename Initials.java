import javax.swing.*;
public class Initials{
  public static void main(String[] ayaya){
    String fI=" ";
    String mI=" ";
    String lI=" ";
    fI=JOptionPane.showInputDialog("Enter your first name's initial:");
    mI=JOptionPane.showInputDialog("Enter your middle name's initial:");
    lI=JOptionPane.showInputDialog("Enter your last name's initial:");
    char f=fI.charAt(0);
    char m=mI.charAt(0);
    char l=lI.charAt(0);
    JOptionPane.showMessageDialog(null,f+"."+m+"."+l);
   }
  }