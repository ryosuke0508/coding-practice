import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();
        sc.nextLine(); //改行

        char[][] picture = new char[h][w];

        // 地上絵の取得
        for (int i = 0; i < h; i++) {
            picture[i] = sc.nextLine().toCharArray();
        }

        //ドーナツの個数カウント
        int count = 0;

        // 最初と最後の行は走査対象外
        for (int i = 1; i < h-1; i++) {
            // 一番左と一番右の列は走査対象外
            for (int j = 1; j < w-1; j++) {
                if (picture[i][j]=='.'
                 && picture[i-1][j-1]=='#' && picture[i-1][j]=='#' && picture[i-1][j+1]=='#'
                 && picture[i][j-1]=='#' && picture[i][j+1]=='#'
                 && picture[i+1][j-1]=='#' && picture[i+1][j]=='#' && picture[i+1][j+1]=='#') {
                     count++;
                }
            }
        }


        System.out.println(count);
    }
}
