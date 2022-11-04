import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            n=n/10;
            if(sum>9&&n==0)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
        
    }
}