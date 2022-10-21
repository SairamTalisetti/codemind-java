import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0,count=0,avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            if(x[i]%2==1)
            System.out.print(x[i]+" ");
        }
         for(int i=0; i<n; i++)
        {
            if(x[i]%2==0)
            System.out.print(x[i]+" ");
        }
    }
}