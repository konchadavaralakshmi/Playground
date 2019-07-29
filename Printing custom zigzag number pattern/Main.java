import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=n;j++)
        {
          if((j<n)&&(i%2 == 1))
            System.out.print(i);
          else if((j==n)&&(i%2 == 1))
            System.out.print(i+1);
          else if((j==1)&&(i%2 == 0))
            System.out.print(i+1);
          else if((j>1)&&(i%2 == 0))
            System.out.print(i);
           }
   		 System.out.println("");
      }
  }
}