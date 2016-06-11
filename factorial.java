import java.util.Scanner;
import java.io.*;

public class factorial
{
 public static void main(String[] args) 
 {
 int n;
 int fact=1;
 System.out.println("ENTER THE NUMBER:");
 Scanner s=new Scanner(System.in);
 n=s.nextInt();
 
 for(int i=1;i<=n;i++) 
 {
  fact=fact*i;
 }
System.out.println("FACTORIAL OF N IS:"+fact);
}
}