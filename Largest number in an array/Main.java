import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int size=s.nextInt();
      int arr[]=new int[size];
      for(int i=0;i<size;i++)
      {
        arr[i]=s.nextInt();
      }
      int max=arr[0];
      for(int i=0;i<size-1;i++)
      {
        if(max<arr[i+1])
        {
          max=arr[i+1];
        }
      }
      System.out.println(max);
    }
}