import java.io.*;
import java.text.DecimalFormat;
public class Room{
  public static void main(String[]args)throws IOException{
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    DecimalFormat r= new DecimalFormat("0.00");
    double l=0;
    double w=0;
    System.out.print("Enter length:");
    l=Double.parseDouble(br.readLine());
    System.out.print("Enter width:");
    w=Double.parseDouble(br.readLine());
    System.out.println("The floor space of the room is "+r.format(l*w)+" square units.");
   }
  }