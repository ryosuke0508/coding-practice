import java.util.Scanner;

class Main {
    public static void main(String[] arg){
        // 標準入力
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();

        int siharai = Integer.valueOf(str1); // 支払金額

        // 500円の枚数と余りの金額
        int count_500 = siharai / 500;
        siharai = siharai % 500;

        // 100円の枚数
        int count_100 = siharai / 100;
        siharai = siharai % 100;

        if (siharai != 0) {
            // 余りが発生する場合（ちょうど支払ができなかった場合）
            System.out.print(-1);
        } else {
            // 500円の枚数＋100円の枚数を出力
            System.out.print(count_500 + count_100);
        }
    }
}
