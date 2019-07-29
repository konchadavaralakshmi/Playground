import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int temp=n;
      int num=n;
      for(int i=1;i<=n;i++)
      {
        for(int j=n;j>=i;j--)
        {
          System.out.print(num);
          num=num-1;
        }
        System.out.println("");
        temp=temp-1;
        num=temp;
      }
	}
}