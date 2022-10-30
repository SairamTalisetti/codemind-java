import java.util.*;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer arr[] = new Integer[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            
        }
        Arrays.sort(arr,Collections.reverseOrder());
        for(int j=0;j<n-1;j=j+2)
        {
            int temp1=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp1;
            
        }
        for(int k=0;k<n;k++) 
        { 
            System.out.print(arr[k]+" "); 
            
        } 
        
    }
    
}
