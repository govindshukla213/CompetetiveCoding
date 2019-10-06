import java.io.*;

public class Multiplication {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[][] = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 1; j <= n; j++) {
                a[i][j] = Integer.parseInt(s[j - 1]);
            }
        }
        int res[] = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            double result = 0.0;
            int j, k;
            if (n == 3) {

                res[1] = (int) Math.sqrt((a[1][2] / a[2][3]) * a[1][3]);

                res[2] = (int) Math.sqrt((a[1][2] / a[1][3]) * a[2][3]);

                res[3] = (int) Math.sqrt((a[1][3] / a[2][1]) * a[2][3]);
                break;
            }
            if (i <= n - 2) {
                j = i + 1;
                k = i + 2;
            } else {
                j = i - 1;
                k = i - 2;

            }
            result = ((a[i][j] / a[k][j]) * a[i][k]);
            res[i] = (int) Math.sqrt(result);
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(res[i] + " ");
        }

    }

}
