import java.util.Scanner;
import java.util.Arrays;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int a[]=new int[size];
      int b[]=new int[size];
      for(int i=0;i<size;i++)
      {
        a[i]=s.nextInt();
      }
      int j=size-1;
      for(int i=0;i<size;i++)
      {
        	b[j]=a[i];
        	j=j-1;
       }
      if(Arrays.equals(a,b))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");
      }
    }
}