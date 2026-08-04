import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 標準入力
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();		// nextLine()：改行までの一行
		String str2 = sc.next();			// next():空白までの文字列
		int num1 = sc.nextInt();			// nextInt():空白までの数字　【Integer.parseInt(sc.next())でも可】

		// 空白入りの文字列の分割方法
		String[] wordArray = sc.nextLine().split(" ");		// 例えば「abc def ghi」という文字列の場合、配列で設定可能

		// 標準出力
		System.out.println(str);
	}
}
