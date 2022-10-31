import java.util.*;
class main
{
   public static void main(String args[])
   { 
       Scanner sc=new Scanner(System.in);
       int n,c=0,k=0,max=0;
       n=sc.nextInt();
       int a[]=new int[n];
       for(int i=0;i<n;i++)
       { 
           a[i]=sc.nextInt();
       } 
       for(int i=0;i<n;i++)
       { 
           c=0;
           for(int j=0;j<n;j++)
       { 
           if(a[i]==a[j])
           {
               c++;
           } 
           if(c>max) 
       {
           max=c;
           k=a[i];
           
       } 
       else
       if(c==max)
       {
           if(a[i]<k)
        { k=a[i];
            
        }
    }
       }
        }
        System.out.println(k); }

}