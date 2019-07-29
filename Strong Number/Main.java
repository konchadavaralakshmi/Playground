import java.util.Scanner;
 class Main {
	public static void main(String[] args) 
	{
		int  Temp, Rem, Sum = 0, i, Factorial;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
		Temp = n;
		while( Temp > 0)
		{
			Factorial = 1; 
			i = 1; 
		    Rem = Temp % 10;
		    while (i <= Rem)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		   Sum = Sum + Factorial;
		     Temp = Temp /10;
        }
		if ( n == Sum )
		{
			System.out.println("Yes");
        }
      else
        System.out.println("No");
    }
 }