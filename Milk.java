import java.util.*;
public class Milk{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int quo=n/10;
        int count=0;
        int rem=n%10;
        if((n%10)==0){
            count+=quo;
        }else{
            if((rem%7)==0){
                count+=(quo)+(rem/7);
            }else{
                if((rem%5)==0){
                    count+=(quo)+(rem/7)+(rem/5);
                }else{
                    if((rem%1)==0){
                        count+=(quo)+(rem/7)+(rem/5)+(rem/1);
                    }
                }
            }
        }
        System.out.println(count);
    }
}
