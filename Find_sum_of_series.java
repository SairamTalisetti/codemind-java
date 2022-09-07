import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float sum=0;
        int n=sc.nextInt();
        for(int i=1; i<=n; i++)
        {
            sum=sum+(float)(1.0f/i);
            
        }
        System.out.format("%.2f",sum);
    }
}