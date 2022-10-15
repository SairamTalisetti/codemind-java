import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,x[],count=0,found=0;
        n=sc.nextInt();
        x=new int[n];
        for(int i=0; i<n; i++)
        {
            x[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(x[i]==x[j])
                System.out.print(x[i]);
                 found=0;
            }
        {
        if(found==1)
        break;
        }
        }
    }
}
