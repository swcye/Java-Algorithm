import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class boj_21316 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<List<Integer>> list = new ArrayList<>();
        int n = 12;
        int ans=0;

        for (int i = 0; i <= 12; i++)
            list.add(new ArrayList<>());

        while (n-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            list.get(a).add(b);
            list.get(b).add(a);
        }
        //ex. 1 2 => 1리스트에 2를 넣음
        //2 3 => 2리스트에 3을 넣음

        //스피카는 연결된 별들 3개의 각각 연결된 별들이 1개, 2개,3개여야 한다.
        for(int i = 0; i < list.size(); i++) {
            boolean first = false, second = false, third = false;
            if(list.get(i).size() == 3) {
                for(int j = 0; j < 3; j++) {
                    int side = list.get(list.get(i).get(j)).size();
                    if(side == 3) third = true;
                    if(side == 2) second = true;
                    if(side == 1) first = true;
                }
            }
            if(third && second && first) {
                ans=i;
                System.out.println(ans);
            }
        }


    }
}
