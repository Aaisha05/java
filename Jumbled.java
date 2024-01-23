import java.util.*;
public class Jumbled {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int m;
        if(sc.hasNextInt()){
            m=sc.nextInt();
        }else{
            System.out.println("Invalid");
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>();   
        int i = 1;
        while (true) {
            int temp = i * (2 * i - 1);
            if (temp >= t1 && temp <= t2) {
                arr.add(temp);
            } else if(temp>t2) {
               // System.out.println("No number found");
                break; 
            }
            i++;
        }
        //System.out.println(arr.get(m - 1));
        if(m<= arr.size()){
            System.out.println(arr.get(m-1));
        }else{
            System.out.println("No number found"+m);
        }
    
    }
}






















/*import java.util.*;
public class Jumbled{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t1=sc.nextInt();
        int t2=sc.nextInt();
        int m=sc.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=1;i<10000;i++){
            int temp=(i*(2*i-1));
            if(temp>=t1 && temp<=t2){
                arr.add(temp);
            }
        }      

        System.out.println(arr.get(m-1));
    }
}*/
