import java.util.*;

public class Tv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int tvroomprice = sc.nextInt();
        int normalroomprice = sc.nextInt();
        int revenueTarget = sc.nextInt();
        int patients, tvroomcount, nontvroomcount;
        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int revenue = 0;
        for (int i=0;i<=rooms;i++){
            tvroomcount=i;
            nontvroomcount=rooms-i;
            revenue=0;
            for (int m=1;m<=12;m++){
                for (int d=1;d<=months[m];d++){
                    patients = (int)Math.pow(6-m, 2)+Math.abs(d-15);
                    if (patients>nontvroomcount){
                        revenue+=nontvroomcount*normalroomprice;
                        patients-=nontvroomcount;
                        if (patients>tvroomcount){
                            revenue+=tvroomcount*tvroomprice;
                        }
                        else{
                            revenue+=patients*tvroomprice;
                        }
                    }
                    else{
                        revenue+=patients*normalroomprice;
                    }
                }
            }
            if (revenue>=revenueTarget){
                System.out.println(tvroomcount);
                break;
            }
        }
        if (revenueTarget>revenue){
            System.out.println(rooms);
        }
        sc.close();
    }
}
