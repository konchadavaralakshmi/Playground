import java.util.Scanner; 
class Main 
{ 
	static int mostFrequent(int a[], int n, int freq[]) 
	{ 
	    int max_count_i = 0; 
		int curr_count = 1; 
		
	    for(int i = 0; i < n; i++)
	    {
		    for (int j = i+1; j < n; j++) 
		    { 
	            if(a[i] == a[j])
	            curr_count ++;
		    }
		    freq[i] = curr_count;
		    curr_count = 1;
	    } 
	    for( int i = 0; i < n; i++)
	    {
            if(freq[i]>freq[max_count_i])
            max_count_i = i;
	    }
	    return a[max_count_i];
	}
	public static void main (String[] args) 
	{ 
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        int freq[] = new int[n];
		System.out.println(mostFrequent(a,n,freq)); 
	} 
}