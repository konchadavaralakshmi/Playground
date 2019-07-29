import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
      {
        a[i]=s.nextInt();
      }
      int count=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
        {
          count=count+1;
        }
        else
        {
          System.out.print(count);
          break;
        }
        }
    }
}