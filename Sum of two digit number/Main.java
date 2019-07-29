import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int f=n/10;
      int se=n%10;
      int sum=f+se;
      System.out.println(sum);
	}
}