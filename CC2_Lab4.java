public class CC2_Lab4{
  public static void main(String[]args){
    String name="Joy";
    int age=18;
    
     if(name=="Jhim"||name=="Ethan"){
      if(age>4&&age<11){
        System.out.print("Hamster,dog");
      }else if(age>10&&age<16){
        System.out.print("Spider,dog");
      
      }else if(age>15&&age<21){
        System.out.print("Dog,snake");
      
      }else if(age==21){
        System.out.print("None");
        }
       }
      
     else if(name=="Sally"||name=="Joy"){
      if(age>4&&age<11){
        System.out.print("Hamster,cat");
        
      }else if(age>10&&age<21){
        System.out.print("Cat,rabbit");
       
      }else if(age>15&&age<21){
        System.out.print("Cat,None");
        
      }else if(age>=21){
        System.out.print("None");
        }
   
   }
  }
 }