import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int r=n%10;
    int r1=(n/10)%10;
    int r2=n/100;
    int rev=(r*100)+(r1*10)+(r2*1);
    System.out.println(rev);
  }
}