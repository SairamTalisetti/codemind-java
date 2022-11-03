import java.util.*;
class mail
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],i;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(x[i]>0)
            System.out.print(x[i]+" ");
        }
        for(i=0;i<n;i++)
        {
            if(x[i]==0)
            System.out.print(x[i]+" ");
        }
    }
}