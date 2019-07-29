import java.util.Scanner;
class Main{
  public static int sum_of_numbers(int m)
  {
    int sum=0;
    for(int i=1;i<=m;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int res =sum_of_numbers(n);
      System.out.println(res);
      
	}
}