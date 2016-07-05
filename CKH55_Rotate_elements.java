import java.util.*;
public class CKH55_Rotate_elements
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int n,k; 
    n=s.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    a[i]=s.nextInt();
    System.out.println("INDEX TO ROTATE");  
    k=s.nextInt();
    System.out.println("ROTATED ELEMENTS");
    for(int i=k;i<n;i++) 
       System.out.println(a[i]);
    for(int i=0;i<k;i++)
       System.out.println(a[i]);
}
}