import java.io.*;
import java.util.*;
/*monday,tuesday,wednesday,thursday,friday,saturday->true
   sunday->false
*/
class CK_Working_day
{
public static void main(String[] args)
{
String s;
Scanner in=new Scanner(System.in);
System.out.println("Enter the day");
s=in.nextLine();
String p=s.toLowerCase();
if(p.equals("monday")||p.equals("tuesday")||p.equals("wednesday")||p.equals("thursday")||p.equals("friday")||p.equals("saturday"))
{
System.out.println("True");
}
else if(p.equals("sunday"))
{
System.out.println("False");
}
else
{
System.out.println("Invalid");
}
}
}