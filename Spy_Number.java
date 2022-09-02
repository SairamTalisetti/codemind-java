import java.util.*;
    class Spy{
        public static int prod(int n){
            int pro=1,rem;
            while(n>0){
                rem = n%10;
                pro= pro*rem;
                n=n/10;
            }
            return pro;
        }
        public static int sum(int x){
            int sum=0,r;
            while(x>0){
                r=x%10;
                sum=sum+r;
                x=x/10;
            }
            return sum;
        }
        public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int res,res1;
            res = prod(n);
            res1 = sum(n);
            if(res==res1)
            System.out.println("Spy Number");
            else
            System.out.println("Not Spy Number");
        }
    }