import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0,c=0;
        float avg=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
            
        }
        for(int i=0; i<n; i++)
        {
            sum=sum+x[i];
            avg=(float)sum/n;
            
        }
        for(int i=0; i<n; i++)
        {
            if(x[i]==avg)
            {
                c++;
                
            }
            
        }
        if(c>0)
        {
            System.out.println("True");
            
        }
        else{System.out.println("False");
            
        }
        
    }
    
}