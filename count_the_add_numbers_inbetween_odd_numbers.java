import java.util.Scanner;
class odd
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        int n,c=0;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=1;i<n-1;i++)
        { 
            if(a[i-1]%2==1 && a[i]%2==1 && a[i+1]%2==1)
            { 
                c++;
            }
        } 
        System.out.println(c);
    }
}