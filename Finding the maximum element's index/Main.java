import java.util.Scanner;
class Main{
public static void main(String[] args) {
Scanner s = new Scanner(System.in);
int size = s.nextInt();
int a[] = new int[size];
int max_idx;
for(int i = 0; i < size; i++)
{
a[i] = s.nextInt();
}
if(a[0] > a[1])
{
max_idx = 0;
}
else
{
max_idx = 1; 
}
for(int i = 2; i <size ; i++) {
if(a[max_idx] < a[i])
{
max_idx = i;
}

}
System.out.println(max_idx);

}
}