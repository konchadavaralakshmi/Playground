import java.util.Scanner;
class Main
{
  public static int greatest_number(int a,int b,int c)
{
    int largest=0;
    if(a>b && a>c)
    {
      largest=a;
    }
    else if(b>a && b>c)
    {
      largest=b;
    }
    else
    {
      largest=c;
    }
    return largest;
  }
  
	public static void main (String[] args){
      Scanner s=new Scanner(System.in);
	    // Type your code here
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      int res=greatest_number(a,b,c);
      System.out.println(res);
	}
}