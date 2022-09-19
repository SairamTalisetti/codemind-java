import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r,sum=0;      
        n=sc.nextInt();     
      
        while(n>0)  
        {
            r=n%10;       
            System.out.print(r);     
            n=n/10;   
        
    }
    }
}