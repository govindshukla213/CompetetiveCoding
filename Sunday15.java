import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sunday15 {

    static int maximize(int a1, int a2, int k1, int k2, int n) {
        int count = 0;
        if (k1 < k2) {
            int comp = a1 * k1;
            if (n > comp) {
                n = n - comp;
                count = a1;
                count += (int) (n / k2);
                return (count);
            } else {
                return (n / k1);
            }

        } else {
            int comp = a2 * k2;
            if (n > comp) {
                n = n - comp;
                count = a2;
                count += (int) (n / k1);
                return (count);
            } else {
                return (n / k2);
            }
        }

    }

    static int minimize(int a1, int a2, int k1, int k2, int n) {
        int comp = a1 * (k1 - 1) + a2 * (k2 - 1);
        if (n > comp) {
            return (n - comp);
        } else {
            return (0);
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a1 = Integer.parseInt(br.readLine());
        int a2 = Integer.parseInt(br.readLine());
        int k1 = Integer.parseInt(br.readLine());
        int k2 = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = minimize(a1, a2, k1, k2, n);
        int max = maximize(a1, a2, k1, k2, n);
        System.out.println(min + " " + max);
    }

}
