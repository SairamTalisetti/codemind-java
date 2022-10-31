import java.util.*;
class main
{ 
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n,x[],sum=0;
        double d;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
                d=Math.sqrt(x[i]);
                if(d==(int)d)
                sum=sum+x[i];
        } 
        System.out.println(sum);
    }
    
}