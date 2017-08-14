import java.io.*;
import java.util.*;
class Binary
{
	public static void main(String args[]) throws IOException
	{
	
	FileOutputStream fo=new FileOutputStream("input.txt");
	Scanner sc=new Scanner(System.in);

	System.out.println("enter data into file");
	String str=sc.nextLine();

	byte b[]=str.getBytes();

	fo.write(b);
	fo.close();

	File input=new File("input.txt");
	Scanner scan=new Scanner(input);
	scan.useDelimiter(" ");

	ArrayList<String> values = new ArrayList<String>();
	
	while(scan.hasNext())
	{
		String data=scan.next();
		values.add(data);	
	}
	
	String[] name=new String[values.size()];
	System.out.print(values.size());	
	name=values.toArray(name);
	

	for(int l=0;l<name.length;l++)
	{
		System.out.print(" "+name[l]);	
	}
	
	Arrays.sort(name);

	for(int l1=0;l1<name.length;l1++)
	{
		System.out.println(" "+name[l1]);	
	}
	
	System.out.println("enter data you want to search");
	Scanner scan1=new Scanner(System.in);
	String check=scan1.next();
	int index_value=Arrays.binarySearch(name,check);	
	System.out.println("the index of"+check+"is"+index_value);
	}
}
