import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=1; i<n-1; i++)
        {
            if(x[i-1]%2==1 && x[i]%2==1 && x[i+1]%2==1)
            {
            count++;
            }
        }
        System.out.println(count);
    }
        

}