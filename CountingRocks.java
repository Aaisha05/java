import java.util.Scanner;
 class CountingRocks {
 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int[] a = new int[1000];
        int s,i,j,t,l1=0,l2=0,c=0;
        
        System.out.println("Enter the no of sample");
        s = sc.nextInt();
        
        System.out.println("Enter the no of range");
        t = sc.nextInt();
        
        System.out.println("Enter the numbers");
        for (i = 0; i < s; i++) {
            a[i] = sc.nextInt();
        }
        int[] arr = new int[t];
        int counter =0;
        
        for (i = 0; i< t; i++) {
            System.out.println("Enter the max and min range");
                l1 = sc.nextInt();
                l2 = sc.nextInt();
                for (j = 0; j < s; j++) { if((a[j]>=l1)&&(a[j]<=l2))
                        c++;            
                }
                arr[counter] = c;
                c=0;
                counter++;
                // System.out.println(c);
                // c=0;
        }
        for (int ii:arr)
        {
            System.out.print(ii+" ");
        }
        
        
    }
 }
