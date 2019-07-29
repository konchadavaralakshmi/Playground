import java.util.Scanner;
class Main
{
  public static int square(int n){
    int sq=n*n;
    return sq;
  }
	public static void main (String[] args)
    {
	 // Type your code here   
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int sod=square(n);
      System.out.print(sod);
	} 
}