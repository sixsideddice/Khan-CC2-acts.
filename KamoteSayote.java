import java.util.*;
public class KamoteSayote{
  public static void main(String []ave){
    Scanner hmm=new Scanner(System.in);
    int n;
    int m;
    int s;
    System.out.print("Enter Input:");
    n=hmm.nextInt();
    m=hmm.nextInt();
    s=hmm.nextInt();
    int x=n/m;
    int y=n%m*s;
    if(1<=n&&n<=1000&&m<=1000&&s<=1000&&m<=n){
      System.out.print(x+" kamotes\n"
                       +y+" sayotes");
    }else{
      System.out.print("Invalid Input.");
    }
   }
  }