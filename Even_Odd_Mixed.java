import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,a=0,b=0,r;
        n=sc.nextInt();
        while(n>0)
        {
            r=n%10;
            if(r%2==0)
            {
                a++;
                
            }
            else
            {
                b++;
                
            }
            n=n/10;
        }
        if(a>0 && b==0)
        {
            System.out.println("Even");
            
        }
        else
        if(a==0 && b>0)
        {
            System.out.println("Odd");
            
        }
        else
        {
            System.out.println("Mixed");
            
        }
        
    }
    
}