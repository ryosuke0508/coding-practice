import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 地図情報配列（2次元配列）の初期化
        int[][] map = new int[n][n];

        // 地図情報の取得
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }


        int left,right,up,down;
        List<Integer> result = new ArrayList<>();

        // 与えられた地図の上下左右の中から最大値(山頂)候補を取得
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // 上下左右の標高と比較。（地図外は0と判定）
                left  = j - 1 >= 0 ? map[i][j-1] : 0;
                right = j + 1 >= n ? 0           : map[i][j+1];
                up    = i - 1 >= 0 ? map[i-1][j] : 0;
                down  = i + 1 >= n ? 0           : map[i+1][j];

                // 走査対象の値が上下左右の値より大きい場合、山頂と判定
                if (map[i][j] > left && map[i][j] > right && map[i][j] > up && map[i][j] > down) {
                    result.add(map[i][j]);
                }
            }
        }

        // ソート
        Collections.sort(result, Collections.reverseOrder());

        // 結果出力
        for (int output : result) {
            System.out.println(output);
        }
    }
}
