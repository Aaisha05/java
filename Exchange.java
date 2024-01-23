import java.util.*;
import java.util.Arrays;

public class Exchange{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int result=findnum(a,b);
        System.out.println(result);

    }
    private static int findnum(int a,int b){
        char[] achars=Integer.toString(a).toCharArray();
        
        for(int i=0;i<achars.length-1;i++){
            for(int j=i+1;j<achars.length;j++){
                char temp=achars[i];
                achars[i]=achars[j];
                achars[j]=temp;
            
                int newnum=Integer.parseInt(new String (achars));
                if(newnum>b){
                    return newnum;
                }
                temp=achars[i];
                achars[i]=achars[j];
                achars[j]=temp;
            }
        }
        return -1;
    }
}
