import java.util.Scanner;
public class Main{
  public static int gcdn(int n1,int n2,int n3)
  {
    int gcdnumber=0,min,gcd=0;
    if(n1<n2)
    {
      min=n1;
    }
    else
    {
      min=n2;
    }
    while(min>=1)
    {
      if((n1%min == 0) && (n2%min == 0))
      {
        gcd=min;
        break;
      }
      min--;
    }
    if(gcd<n3)
    {
      min=gcd;
    }
    else
    {
      min=n3;
    }
    while(min>=1)
    {
      if((gcd%min==0)&&(n3%min==0))
      {
        gcdnumber=min;
        break;
      }
      min--;
    }
    return min;
          
  }
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n1=s.nextInt();
      int n2=s.nextInt();
      int n3=s.nextInt();
      int res=gcdn(n1,n2,n3);
      System.out.println(res);
	}
}