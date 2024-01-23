import java.util.Scanner;
/*
 18

* . * # * * * # * * * # * * * . * .
* . * # * . * # . * . # * * * * * *
* * * # * * * # * * * # * * * * . *

 */

public class Constellation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;
        char[][] grid = new char[3][n];
        for (int i=0;i<3;i++) {
            for (int j=0; j<n; j++){
                grid[i][j] = sc.next().charAt(0);
            }
        }
        while(k<n){
            if(grid[0][k]=='#'){
                System.out.print('#');
                k++;
                continue;
            } else if(grid[0][k]=='.' && grid[1][k]=='.' && grid[2][k]=='.'){
                k++;
                continue;
            }
            if(grid[0][k+1]=='.' && grid[1][k+1]=='.') 
                System.out.print('U');
            else if(grid[1][k+1]=='.') 
                System.out.print('O');
            else if(grid[1][k]=='.' && grid[1][k+2]=='.') 
                System.out.print('I');
            else if(grid[0][k]=='.' && grid[0][k+2]=='.' && grid[2][k+1]=='.') 
                System. out.print('A');
            else 
                System.out.print('E');
            k+=3;
        }
        // System.out.println("The constellations are:");
        sc.close();
    }
}
