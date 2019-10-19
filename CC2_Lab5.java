 import java.lang.Math.*;
  public class CC2_Lab5{
    public static void main(String[]args){
      double rand=Math.random()*1000;
      int messageCount=(int)rand;
      float charges=0.5f;
      double limit=200;
      if(messageCount>200){
        System.out.print("You have sent "+messageCount+" messages."+"\n"+
        "You have incurred "+(messageCount-limit)*charges+" PHP in charges.");
      }else{
        System.out.print("You have sent "+messageCount+" messages.");
      }
    
   }
  }