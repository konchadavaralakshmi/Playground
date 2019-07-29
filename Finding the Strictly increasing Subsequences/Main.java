import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i = 0; i < size; i++)
        {
            a[i] = s.nextInt();
        }
        int suma[] = new int[3 * size];
        increasingsubarray(size, a, suma);
    }
    public static void increasingsubarray(int size, int a[], int suma[])
    {
        for(int i1 = 0; i1 <= size - 1; i1++)
        {
            int key =  a[i1];
            int flag = 1;
            for(int i2 = i1+1; i2<=size-1;i2++)
            {
                if(a[i2]>key)
                {
                    for(int i3 = i1; i3 <= i2; i3++)
                    {
                        if(a[i3]>a[i2])
                        flag = 0;
                    }
                    if(flag == 1)
                    System.out.println(key+","+a[i2]+" ");
                }
                flag = 1;
            }
        }
    }
}