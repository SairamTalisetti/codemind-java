import java.util.*;
class main
{
    public static boolean ispalindrome(int n)
    {
        int sum=0,r,temp=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        
        }
        if(temp==sum)
        return true;
        else
        return false;
    }
        public static void main(String args[])
        {
        Scanner sc=new Scanner(System.in);
        int x,i,y;
        x=sc.nextInt();
        y=sc.nextInt();
        for(i=x; i<y;i++)
        {
            if(ispalindrome(i))
            {
                System.out.print(i+" ");
            }
        }
        }
}

     
