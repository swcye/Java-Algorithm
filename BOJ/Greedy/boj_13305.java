import java.util.Scanner;

public class boj_13305 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        //long타입으로 선언해야 100점 받음
        long edge[]=new long[N-1];
        long node[]=new long[N];
        for(int i=0;i<N-1;i++)
            edge[i]=sc.nextInt();
        for(int i=0;i<N;i++)
            node[i]=sc.nextInt();
        long point=node[0];
        long ans=edge[0]*point;
        for(int i=1;i<N-1;i++) {
            if (node[i] < point)
                point = node[i];
            ans += edge[i]*point;
        }
        System.out.println(ans);


    }
}
