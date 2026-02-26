import java.util.Arrays;
import java.util.Scanner;
public class sixth{
public static void main(String [] args)
{
Scanner scanner=new Scanner(System.in);
System.out.println("enter the nuberof string:\n");
int n = scanner.nextInt();
String[]strings=new String[n];
System.out.println("enter the string:");
for (int i=0; i<n; i++)
{
strings[i]=scanner.next();
}
Arrays.sort(strings);
System.out.println("\nSorted string");
for(String str : strings)
{
System.out.println(str);
}
scanner.close();
}
}
