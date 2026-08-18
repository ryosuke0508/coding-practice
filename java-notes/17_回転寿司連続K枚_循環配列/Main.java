import java.util.*;

public class Main {

    public static void main(String... args) {
        var sc = new Scanner(System.in);

        var N = sc.nextInt();
        var K = sc.nextInt();

        var ans = 0;
        var P = new int[N];

        for (var i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }

        for (var i = 0; i < N; i++) {
            var sum = 0;
            for (var j = 0; j < K; j++) {
                sum += P[(i + j) % N];
            }
            ans = Math.max(ans, sum);
        }

        System.out.println(ans);
    }
}
