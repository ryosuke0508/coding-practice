import java.util.*;


public class MyAnswer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pointsStr = sc.nextLine().split(" ");
        int H = Integer.parseInt(pointsStr[0]);
        int W = Integer.parseInt(pointsStr[1]);

        String[][] banmen = new String[H][];

        for (int i = 0; i < H; i++) {
            String line = sc.nextLine();
            String[] lineArray = line.split("");
            banmen[i] = new String[W];
            for (int j = 0; j < W; j++) {
                banmen[i][j] = lineArray[j];
            }
        }

        String[] start = sc.nextLine().split(" ");

        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (i == Integer.parseInt(start[0]) && j == Integer.parseInt(start[1])) {
                    if (banmen[i][j].equals(".")) {
                        banmen[i][j] = "#";
                    } else if (banmen[i][j].equals("#")) {
                        banmen[i][j] = ".";
                    }
                }

                System.out.print(banmen[i][j]);
            }
            System.out.println("");
        }
    }
}
