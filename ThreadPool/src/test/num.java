package test;

import java.util.Scanner;

/**
 * @ClassName: num
 * @Description: TODO
 * @author: immorts
 * @date: 2022/3/27  3:43 下午
 */
public class num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] map = new int[m][n];
        int[][] res = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                map[m][n] = sc.nextInt();
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 && j == 0){
                    res[i][j] = 0;
                } else if(i == 0){
                    res[i][j] = res[i][j-1] + (map[i][j] == map[i][j-1] ? 1 : 2);
                } else if(j == 0){
                    res[i][j] = res[i-1][j] + (map[i][j] == map[i-1][j] ? 1 : 2);
                } else {
                    res[i][j] = Math.min(res[i][j-1] + (map[i][j] == map[i][j-1] ? 1 : 2),res[i-1][j] + (map[i][j] == map[i-1][j] ? 1 : 2));
                }
            }
        }
        System.out.println(res[m-1][n-1]);
    }
}
