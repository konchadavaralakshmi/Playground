import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int a[] = new int[size];
        for(int i = 0; i<size; i++){
            a[i] = s.nextInt();
        }
        int mi_val = 0;
        for(int val = 1; val <= size; val++)
        {
            boolean found = false;
            for(int i = 0; i < size; i++){
                if(a[i] == val)
                {
                    found = true;
                    break;
                }
            }
            if(found == false){
                mi_val = val;
                break;
            }
        }
        System.out.print(mi_val);
    }
}