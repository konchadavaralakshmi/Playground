import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i <= n - 1; i++){
            a[i] = s.nextInt();
        }
        int freq[] = new int[k];
        for(int i = 0; i <= k - 1; i++)
        {
            freq[i] = 0;
        }
        for(int i = 0; i < n ; i++){
           freq[a[i] - 1]++;
        }
        for(int i = 0; i <k ; i++){
           System.out.println((i + 1) + " " + freq[i]);
        }
    }
}