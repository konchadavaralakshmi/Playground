import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int arr_size=s.nextInt();
      int arr[]=new int[arr_size];
      for(int i=0;i<arr_size;i++)
      {
        arr[i]=s.nextInt();
      }
      int search1=s.nextInt();
      int search2=s.nextInt();
      int index=-1;
      int index2=-1;
      for(int i=0;i<arr_size;i++)
      {
      	if(search1==arr[i])
      	{
        	index=i;
      	}
      	if(search2==arr[i])
        {
          index2=i;
        }
      }
      System.out.println(index);
      System.out.println(index2);
        
    }
}