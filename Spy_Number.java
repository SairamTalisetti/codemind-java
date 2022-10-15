import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,sum=0,pro=1,i,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro)
        System.out.println("Spy Number");
        else
        System.out.println("Not Spy Number");
    }
}