import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int min_st=1;
      int space=n-1;
      for(int i=1;i<=n;i++)
      {
        for(int j=space;j>=i;j--)
        {
          System.out.print(" ");
        }
        for(int k=1;k<=min_st;k++)
        {
          System.out.print("*");
        }
        min_st=min_st+2;
        System.out.println("");
      }
	}
}