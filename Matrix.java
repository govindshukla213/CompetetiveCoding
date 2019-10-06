import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Matrix {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int m = Integer.parseInt(s[1]);

        int a[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            String ss[] = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                a[i][j] = Integer.parseInt(ss[j]);
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = m - 2; j >= 0; j--) {
                if (a[i][j] == 0) {
                    a[i][j] = Math.min(a[i + 1][j], a[i][j + 1]) - 1;
                }
            }
        }
        int sum = 0;
        boolean increasing = false;
        for (int i = 0; i < n; i++) {
            int hdiff, vdiff, prevx = 0, prevy = 0;

            for (int j = 0; j < m; j++) {
                if (i > 0) {
                    prevy = a[i - 1][j];
                } else {
                    prevy = 0;
                }
                if (j > 0) {
                    prevx = a[i][j - 1];
                } else {
                    prevx = 0;
                }

                hdiff = a[i][j] - prevx;
                vdiff = a[i][j] - prevy;
                if (hdiff > 0 && vdiff > 0) {
                    increasing = true;

                    sum += a[i][j];

                } else {
                    increasing = false;
                    break;
                }
            }
            if (!increasing)
                break;

        }
        int res = increasing ? sum : -1;
        System.out.println(res);

    }

}