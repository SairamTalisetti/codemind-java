import java.util.*;
class main
{
    public static int pal(int n)
    {
        int sum=0,r;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,res;
        n=sc.nextInt();
        if(n<0)
        {
            n=Math.abs(n);
        }
        res=pal(n);
        if(n==res)
        System.out.println(2);
        else
        System.out.println(1);
    }
}