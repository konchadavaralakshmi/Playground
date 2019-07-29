import java.util.Scanner;
import java.lang.Math; 
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
      Scanner s=new Scanner(System.in);
      int base=s.nextInt();
      int exp=s.nextInt();
      int res=1;
      while(exp!=0)
      {
        res=res*base;
        exp=exp-1;
      }
      System.out.print(res);
    }
}