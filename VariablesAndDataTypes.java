public class VariablesAndDataTypes{
  public static void main(String[]args){
    String topic="The temperature in Baguio City has warmed throughout the years.";
    char ch='A';
    float degree1=16.0f;
    double degree2=23.5;
    byte hours=24;
    short days=7;
    int weeks=4;
    long months=12;
    boolean number=false;
    if (number==true){
    System.out.print(topic+"\n"+
                     "\t"+ch+" recent news article stated that the City has been averaging "+degree1+" degrees celsius at dawn and "+degree2+" at noon.\n"+
                     "\t\t"+"Regardless,lowlanders still feel cold "+hours+" hours a day, "+days+" days a week, "+weeks+" weeks per month and "+months+" months each year.");
    }else{
    System.out.print("The boolean was changed to a false value");
      }
   }
  }