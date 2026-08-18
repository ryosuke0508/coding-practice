import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine(); // 改行

        Set<Integer> hash = new HashSet<>();

        // 配列Aの読み込み
        for (int i = 0; i < n; i++) {
            hash.add(sc.nextInt());
        }

        //　配列Kの読み込み
        for (int i = 0; i < q; i++) {
            if (hash.contains(sc.nextInt())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
