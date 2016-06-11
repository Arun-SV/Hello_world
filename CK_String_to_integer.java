import java.util.*;
public class CK_String_to_integer
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
System.out.println(p);
int n=Integer.parseInt(p);
System.out.println("String to integer conversion:"+n);
}
}