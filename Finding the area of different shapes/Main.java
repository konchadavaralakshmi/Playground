import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        //Try your code here
      Scanner s=new Scanner(System.in);
      int ch=s.nextInt();
      switch(ch)
      {
        case 1:
          int side=s.nextInt();
          System.out.print(side*side);
          break;
        case 2:
          int len=s.nextInt();
          int b=s.nextInt();
          System.out.print(len*b);
          break;
        case 3:
          int br=s.nextInt();
          int h=s.nextInt();
          System.out.print((br*h)/2);
          break;
        case 4:
          int r=s.nextInt();
          System.out.print(3.14*r*r);
          break;
      }
         
          
    }
}