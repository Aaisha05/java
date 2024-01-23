import java.util.*;
public class Bottle{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] bottles=new int[n];
        int[] counts=new int[(n+1)];
        for(int i=0;i<n;i++){
            bottles[i]=sc.nextInt();
            counts[bottles[i]]++; //mode formula
        }
        int max=-1;
        for(int i=0;i<(n+1);i++){
            if(counts[i]>max){
                max=counts[i];
            }

        }
        System.out.println(max);
        

    }
}
