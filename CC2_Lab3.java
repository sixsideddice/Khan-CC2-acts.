public class CC2_Lab3{
  public static void main(String[]args){
    char h='H';
    char a='A';
    char r='R';
    char i='I';
    char s='S';
    char w='!';
    
    long z=h;
    long x=a;
    long c=r;
    long v=i;
    long b=s;
    long n=w;
    long sum=z+x+c+v+b+n;
    long prod= z*x*c*v*b*n;
    double ave= sum/6;
    long rem=sum%6;
    System.out.print(h+" - "+z+"\n"+
                     a+" - "+x+"\n"+
                     r+" - "+c+"\n"+
                     i+" - "+v+"\n"+
                     s+" - "+b+"\n"+
                     w+" - "+n+"\n"+
                     h+a+r+i+s+w+"\n"+
                     "Sum: "+sum+"\n"+
                     "Product: "+prod+"\n"+
                     "Average: "+ave+"\n"+
                     "Remainder: "+rem);
                  
    
   }
  }