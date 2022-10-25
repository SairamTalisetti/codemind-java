import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,rev=0;
        n=sc.nextInt();
        int t=n;
        while(n>0)
        {
            r=n%10;
            rev=rev*10+r;
            n=n/10;
            
        }
        if(t==rev)
        System.out.println("True");
        else
        System.out.println("False");
    }
}
        
  