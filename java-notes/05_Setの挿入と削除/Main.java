import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        //int[][] map = new int[n][n];
        //int[] result = new int[n];
        Set<Integer> result = new HashSet<>();

        for (int i=0; i < n; i++) {
            result.add(Integer.valueOf(i+1));
        }

        for (int i=0; i < n; i++) {
            for(int j=0; j < n; j++){
                int rain = sc.nextInt();
                if (rain >= m) {
                    result.remove(j+1);
                }
            }
        }

        if(result.isEmpty()) {
            System.out.println("wait");
        } else {
            StringBuilder  sb = new StringBuilder();
            for (Integer x : result) {
                sb.append(x).append(" ");
            }
            sb.setLength(sb.length() - 1);
            System.out.print(sb);
        }
    }
}
