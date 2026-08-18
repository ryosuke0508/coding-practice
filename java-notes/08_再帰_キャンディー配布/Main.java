import java.util.*;
public class Main {

    static int N, M, K;
    static int[] A;
    static int ans = 0;

    static void dfs(int idx, int count, int sum) {

        if (count == K) {
            if (sum % N == 0) {
                ans++;
            }
            return;
        }

        if (idx == M) {
            return;
        }

        // 選ぶ
        dfs(idx + 1, count + 1, sum + A[idx]);

        // 選ばない
        dfs(idx + 1, count, sum);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // お客さん数
        M = sc.nextInt(); // セット種類数
        K = sc.nextInt(); // 購入セット数

        A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }

        dfs(0, 0, 0);

        System.out.println(ans);
    }
}
