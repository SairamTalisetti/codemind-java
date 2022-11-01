import java.util.*;
class main 
{
    public static boolean prime(int n)
    {
       
        int count=0;
        for(int i=2; i<=Math.sqrt(n); i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         int n,f=0;
         n=sc.nextInt();
         for(int i=2; i<=Math.sqrt(n); i++)
         {
             if((n%i==0)&&prime(i)&&(prime(n/i)&&i!=n/i))
             {
                 System.out.print(i+" "+n/i);
                 f=1;
                 break;
             }
         }
         if(f==0)
         {
             System.out.println(-1);
         }
        
    }
        
}