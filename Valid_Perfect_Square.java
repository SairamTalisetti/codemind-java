import java.util.*;
class Vpsq
{
    public static boolean vps(int n)  
    {
        int b=0;
        for(int i=1; i<=n; i++)  
        {
            if(i*i==n)    
            {
                b=1;  
                break;
            }
        }
        if(b==1)
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
        int n,a;
        n=sc.nextInt();
        for(int i=0; i<n; i++)
        {
             a=sc.nextInt();
            if(vps(a))
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
            
      }
    }
}