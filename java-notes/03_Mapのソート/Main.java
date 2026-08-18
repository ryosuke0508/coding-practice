import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 文字個数
        sc.nextLine();  // 1行読み飛ばし
        Map<Integer, String> map = new HashMap<Integer, String>();
        String moji = "";
        int x = 0;


        for (int i = 0; i < n; i++) {
            String input[] = sc.nextLine().split(" ");
            //moji = sc.next();
            //x = sc.nextInt();

            map.put(Integer.parseInt(input[1]), input[0]);

        }

        Object[] mapkey = map.keySet().toArray();
        Arrays.sort(mapkey);

        for (Object nKey : mapkey)
        {
            System.out.println(map.get(nKey));
        }
    }
}
