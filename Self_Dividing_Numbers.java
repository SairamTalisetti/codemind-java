import java.util.*;
class main
{
     public static boolean self(int x)
     {
         int r,temp=x;  
         while(x>0)   
         {
             r=x%10;  
             if(r==0)   
             return false;  
             if(temp%r!=0)   
             return false;
             x=x/10;
         }
         return true;
     }
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n1,n2;
         n1=sc.nextInt();   
         n2=sc.nextInt();   
         for(int i=n1; i<=n2; i++)  
         {
             if(self(i))     
             System.out.print(i+" ");
         }
         
     }
    
}