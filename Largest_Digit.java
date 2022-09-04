import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,max;    
        n=sc.nextInt();  
        max=n%10;       
        while(n>0)   
        {
            if(n%10>max)   
        {
            max=n%10;    
        }
        n=n/10;   
        }
        System.out.println(max);
    }
}
        



           
   