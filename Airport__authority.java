import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,k,x[],c=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        k=sc.nextInt();
        for(int i=0; i<n; i++)
        {
            if(x[i]>k)
            {
            c++;
            }
        }
        System.out.println(n+c);
    }
}
