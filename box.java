import java.util.*;
public class box{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] b=new int[n];

        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int min=b[0];
        int max=b[0];
        for(int i=0;i<n;i++){
            if (b[i]<min){
                 min=b[i];

            }
              
            if (b[i]>max){==.               max=b[i]; 
            }    
        } 
        int effort= 2*(b[k-1])*min +(min*max);
        System.out.println(effort);

    }
}
