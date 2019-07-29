import java.util.Scanner;
class Main{
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int size = s.nextInt();
	int a[] = new int[size];
	for(int i = 0; i < size; i++)
	{
		a[i] = s.nextInt();
    }
	perfect_batch(a, size);
}

public static void perfect_batch(int a[], int size)
{
	boolean perfectbatch = true;
	int batchsum = a[0] + a[1] + a[2];
	for(int i = 3; i< size ; i = i+ 3) {
	int currbatchsum = a[i] + a[i+ 1] +a[i+ 2];
	if(currbatchsum != batchsum)
	{
		perfectbatch = false;
	}
}
	if(perfectbatch == true)
	{
		System.out.println("Perfect Batch");
	}
	else
	{
		System.out.println("Not a Perfect Batch");
	}
}
}