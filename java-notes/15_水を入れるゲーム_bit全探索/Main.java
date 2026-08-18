import java.util.*;

public class Main {

    public static void main(String... args) {
        var sc = new Scanner(System.in);

        var n = sc.nextInt();
        var X = sc.nextInt();

        var ans = 0;
        var w = new int[n];

        for (var i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }

        for (var i = 0; i < Math.pow(2, n); i++) {
            var sum = 0;
            var tmp = i;

            for (var j = 0; j < n; j++) {
                if (tmp % 2 == 1) {
                    sum += w[j];
                }
                tmp /= 2;
            }

            if (sum <= X) {
                ans = Math.max(ans, sum);
            }
        }

        System.out.println(ans);
    }
}
