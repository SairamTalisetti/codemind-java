import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t,n1,n2,sum;
        t=sc.nextInt();
        while(t>0)
        {
             
             n1=sc.nextInt();
             n2=sc.nextInt();
             sum=n1+n2;
             System.out.println(sum);
             t--;
        }
    }
}