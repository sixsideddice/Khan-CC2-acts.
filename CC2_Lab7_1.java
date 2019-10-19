import java.util.*;
public class CC2_Lab7_1{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
          int grade=0;
          System.out.print("Enter grade:");
          grade=sc.nextInt();
             if(91<grade&&grade<101)
              System.out.print("A");
             else if(86<grade&&grade<92)
              System.out.print("B+");
             else if(82<grade&&grade<87)
              System.out.print("B");
             else if(78<grade&&grade<83)
              System.out.print("C+");
             else if(74<grade&&grade<79)
              System.out.print("C");
             else if(69<grade&&grade<75)
              System.out.print("D");
             else if(grade<70)
              System.out.print("F");
             else
              System.out.print("Invalid grade");
    }
}