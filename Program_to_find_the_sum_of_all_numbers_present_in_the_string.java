import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int sum=0,x=0;
        String s=sc.nextLine();
        for(int i=0; i<s.length(); i++)
        {
            char ch=s.charAt(i);
            if(ch>=48 && ch<=57)
            {
                x=ch-'0';
                sum=sum+x;
            }
        }
        System.out.println(sum);
    }
}