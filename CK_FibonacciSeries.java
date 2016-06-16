import java.util.Scanner;
class CK_FibonacciSeries
{
    public static void main(String[] args)
    {
        System.out.println("ENTER THE LENGTH:");
        Scanner s=new Scanner(System.in);
        int l=s.nextInt();
        int[] Arr=new int[l];
        Arr[0]=0;
        Arr[1]=1;
        System.out.println("<<< FIBONACCI SERIES >>>\n"+Arr[0]+"\n"+Arr[1]);
        for(int i=2;i<=l;i++)
        {
            Arr[i]=Arr[i-1]+Arr[i-2];
            System.out.println(Arr[i]);
        }
    }
}