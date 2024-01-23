import java.util.*;
public class fibosum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextLong();
        int sum=fibonacci(n);     
        int unit=sum%10;
        System.out.println("Unit digit: "+unit);
    }
    static int fibonacci(long n){
        if(n<=0){
            return 1;
        }
        int a=0, b=1, sum=1;
        for(int i=2;i<=n;i++){
            int next=(a+b)%10;
            sum=(next+sum)%10;
            a=b;
            b=next;
        }
        return sum;
    }
}
