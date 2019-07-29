import java.util.Scanner;
class Main
{
  public static int power(int base,int exponent)
  {
    int result=1;
    while(exponent !=0)
    {
      result=result*base;
      --exponent;
    }
    return result;
  }
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int b=s.nextInt();
    int e=s.nextInt();
    int sod=power(b,e);
    System.out.println(sod);
  }
}