import java.util.*;
class main
{
    public static boolean ispalindrome(int x)
    {
        int sum=0,r,temp=x;
        while(x>0)
        {
            r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0;
        n=sc.nextInt();
        x=new int[n];
        for (int i=0;i<n;i++)
          x[i]=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            if(ispalindrome(x[i]))
               count++;
        }
        System.out.println(count);
    }
}