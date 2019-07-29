import java.util.Scanner;
public class Main
{ 
	public static int[] CountArray(String str) 
	{ 
	    int count[] = new int[256]; 
	    for (int i = 0; i<str.length(); i++) 
	    {
		    count[str.charAt(i)]++; 
	    }
	    return count; 
	} 
	public static String removeChars(String str, String substr) 
	{ 
	int count[] = CountArray(substr); 
	int ipind = 0, resind = 0; 
		
	char arr[] = str.toCharArray(); 
		
	while (ipind != arr.length) 
	{ 
		char temp = arr[ipind]; 
		if(count[temp] == 0) 
		{ 
			arr[resind] = arr[ipind]; 
			resind ++; 
		} 
			ipind++; 
		
	}	 

	str = new String(arr); 
	return str.substring(0, resind); 
	} 

	public static void main(String[] args) 
	{ 
	    Scanner s = new Scanner(System.in);
		String str = s.nextLine(); 
		String substr = s.nextLine(); 
		System.out.println(removeChars(str, substr)); 
	} 
}