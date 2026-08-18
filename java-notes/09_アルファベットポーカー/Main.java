import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split("");

        Map<String, Integer> map = new HashMap<>();

        // mapにアルファベットを格納してく
        for (int i = 0; i < 4; i++) {
            int count = 0;
            if (map.containsKey(s[i])) {
                count = map.get(s[i]);
            }
            map.put(s[i], count + 1);
        }

        String result = "";

        // フォーカードの場合
        if (map.containsValue(4) || (map.containsValue(3) && map.containsKey("*"))) {
            result = "FourCard";
        } else if (map.containsValue(3) || (map.containsValue(2) && map.containsKey("*"))) {
        // スリーカードの場合
            result = "ThreeCard";
        } else if (map.size() == 2 || (map.containsValue(2) && map.containsKey("*"))) {
        // ツーペアの場合
            result = "TwoPair";
        } else if (map.containsValue(2) || map.containsKey("*")) {
        // ワンペアの場合
            result = "OnePair";
        } else {
            result = "NoPair";
        }

        System.out.println(result);
    }
}
