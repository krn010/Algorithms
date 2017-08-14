import java.util.*;
import java.lang.*;

class Anagrams 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string :");
		String str1 = sc.next();
		
		System.out.println("Enter the second string :");
		String str2 = sc.next();
		
		char[] str1_sort=str1.toCharArray();
		Arrays.sort(str1_sort);
		char[] str2_sort=str2.toCharArray();
		Arrays.sort(str2_sort);
		
		String s1=String.valueOf(str1_sort);
		String s2=String.valueOf(str2_sort);
		
		if(s1.equals(s2)==true) 
		{
			System.out.println("Strings are anagram");
		}
		else 
		{
			System.out.println("Strings are not anagram");
		}
	}
}