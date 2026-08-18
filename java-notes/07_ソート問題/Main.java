import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> line = new ArrayList<>();

        // リストを取得
        for (int i = 0; i < N; i++) {
            line.add(sc.nextInt());
        }

        // ソート用にリストを複製
        ArrayList<String> copy = (ArrayList<String>) line.clone();

        // 降順でソート
        Collections.sort(copy, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            int index = copy.indexOf(line.get(i));
            System.out.println(index+1);
        }

    }
}
