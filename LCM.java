import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,lcm,max,i;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>=b)
        max=a;
        else
        max=b;
        for(i=1;;i++)
        {
            if(i%a==0 && i%b==0)
            {
            lcm=i;
            break;
            }
        }
        System.out.println(lcm);
    }
}