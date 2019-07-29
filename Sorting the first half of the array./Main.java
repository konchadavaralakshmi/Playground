import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0;i< n; i++)
        {
            a[i] = s.nextInt();   
        }
        insertionsort(n,a);
    }    
    public static void insertionsort(int n,int a[])
    {
        for (int i1 = 1; i1 < n/2; i1++) 
        {
            int key = a[i1];
            int i2 = i1 - 1;
            while((i2 >= 0) && (a[i2] > key)) 
            {
                a[i2 + 1] = a[i2];
                i2--;
            }
            a[i2 + 1] = key;
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
        
    }
}