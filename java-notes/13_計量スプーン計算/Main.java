import java.util.Scanner;

class Main {
    public static void main(String[] arg){
        final int oSaji = 15; // 大さじ(15ml)
        final int koSaji = 5; // 小さじ(5ml)
        int total = 0;        // 合計

        // 標準入力
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();

        total = oSaji * Integer.valueOf(str1) + koSaji * Integer.valueOf(str2);

        // 標準出力
        System.out.println(total);
    }
}
