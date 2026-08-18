import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] pointsStr = sc.nextLine().split(" ");
		int[] points = new int[pointsStr.length];
		int N,H,W;

		for(int i = 0; i < points.length; ++i) {
		    points[i] = Integer.parseInt(pointsStr[i]);
		}
		N = points[0];
		H = points[1];
		W = points[2];

		String[] pointsStr2 = sc.nextLine().split(" ");
		int[] points2 = new int[pointsStr2.length];
		int sy,sx;

		for(int i = 0; i < points2.length; ++i) {
		    points2[i] = Integer.parseInt(pointsStr2[i]);
		}
		sy = points2[0] - 1;
		sx = points2[1] - 1;

		String S = sc.nextLine();

		int[][] seki = new int[H][];

		for (int i = 0; i < H ; i++) {
		    seki[i] = new int[W];
		}

		for (int i = 0; i < H ; i++) {
		    String[] line = sc.nextLine().split(" ");
		    for (int j = 0; j < W; j++) {
                seki[i][j] = Integer.parseInt(line[j]);
		    }
		}

		for (int i = 0; i < N; i++) {

		    switch (S.charAt(i)){
		        case 'F':
		            sy = sy - 1;
		            break;
		        case 'B':
		            sy = sy + 1;
		            break;
		      	case 'R':
		      	    sx = sx + 1;
		            break;
		        case 'L':
		            sx = sx - 1;
		            break;
		        default:
		            break;
		    }

		    System.out.println(seki[sy][sx]);
		}
    }
}
