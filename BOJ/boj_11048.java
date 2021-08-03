import java.util.Scanner;

public class boj_11048 {
    public static int N;
    public static int M;
    public static int map[][];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N+1][M+1];

        for(int i=1;i<=N;i++)
            for(int j=1;j<=M;j++)
                map[i][j]=sc.nextInt();
        dfs();
        System.out.println(map[N][M]);


    }
    static void dfs(){
        for(int i=1;i<=N;i++)
            for(int j=1;j<=M;j++)
                map[i][j] += Math.max(map[i][j-1],Math.max(map[i-1][j], map[i-1][j-1]));

    }

}
