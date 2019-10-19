import java.util.*;
public class CC2_Lab7_2{
  public static void main(String ahey[]){
    
    Scanner sc=new Scanner(System.in);
    int q=0;
    int b=0;
    int a=0;
    int n=1;
    String op=" ";
    
    System.out.print("Enter # of operations: ");
      q=sc.nextInt();
    if(q>0&&q<101){
      
      System.out.print("Enter all operations in one line: ");
      
      while(n<=q){
        op=sc.next();
        a=sc.nextInt();
        if(op.equals("negate"))
          System.out.print(-1*a+"\n");
        else if(op.equals("add")){
          b=sc.nextInt();
          System.out.print(a+b+"\n");
        }else if(op.equals("max")){
          b=sc.nextInt();
          if(a>b)
            System.out.println(a);
          else if(b==a)
            System.out.println(a);
          else
            System.out.print(b+"\n");
       }else{
        System.out.print("Invalid input");
       }
       n++;
      }
    } 
  }  
}        
      
          
    