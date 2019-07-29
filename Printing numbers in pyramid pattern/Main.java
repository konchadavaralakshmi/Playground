import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	// Type your code here
     Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int num=1;
      for(int i=1;i<=n;i++)
      {
        for(int j=(n-1);j>=i;j--)
          System.out.print(" ");
        for(int k=1;k<=i;k++)
        {
          System.out.print(num+" ");
          num=num+1;
        }
        System.out.println("");
      }
    }
}