import java.util.*;
class main
{
    public static int hcf(int a,int b)
    {
        int h=0,s=0,x=0;
        if(a>b)
        {
            h=a;
            s=b;
        }
        else
        {
            h=b;
            s=a;
        }
        for(int i=h; i>=0; i--)
        {
            if(h%i==0 && s%i==0)
            {
                x=i;
                break;
            }
        }
        return x;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,b=0,x[];
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            b=hcf(x[i],b);
        }
        System.out.println(b);
    }
}

                
                
            