import java.util.Scanner;
class Main{
  public static void prime(int n)
  {
    int count=0;
    for(int i=1;i<=n;i++)
    {
      count=0;
      for(int j=1;j<=i;j++)
      {
        if(i%j == 0)
        {
          count=count+1;
        }
      }
      if(count==2)
    	 System.out.println(i);
    }
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
      prime(m);
   
	}
}