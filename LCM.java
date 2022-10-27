import java.util.*;
class mina
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,lcm,min;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        min=a;
        else
        min=b;
        for(int i=min;;i++)
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