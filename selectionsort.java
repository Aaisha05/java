import java.util.*;
public class selectionsort{
    public static void main(String[] args){
        int[] array={20,12,10,15,2};
        long start=System.currentTimeMillis();
        selection(array);
        System.out.println("Sorted array");
        for(int i:array){
            System.out.print(i+" ");
        }  
        long end=System.currentTimeMillis();
        System.out.println(end-start);

    }
    static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
}
