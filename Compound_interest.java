import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p,r,t;
        double x;
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        x=(1+r/100);
        double c=p*(Math.pow(x,t));
        System.out.printf("%.2f",c);
        
    }
}