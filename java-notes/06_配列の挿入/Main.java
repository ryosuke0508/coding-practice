//整数 N, K, Q と、 長さ N の配列 A_1, A_2, ..., A_N が与えられるので、
//A_K の後ろに Q を挿入した後の長さ N+1 の配列について、
//先頭から改行区切りで出力してください。
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();

        int[] que = new int[n];
        for (int i = 0; i < n ; i++) {
            que[i] = sc.nextInt();
        }

        int[] newQue = new int[que.length + 1];

        for (int i = 0, j = 0; i < newQue.length; i++) {
            if (i == k) {
                newQue[i] = q;
            } else {
                newQue[i] = que[j];
                j++;
            }
        }

        for (int i = 0; i < n+1 ; i++) {
            System.out.println(newQue[i]);
        }

    }
}
