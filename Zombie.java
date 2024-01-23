import java.util.*;
public class Zombie{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        int n=sc.nextInt();
        int s=0;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            s+=(arr[i]%2 +arr[i]/2);
        }
        if(e>s){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }

}
