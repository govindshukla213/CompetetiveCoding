import java.util.Scanner;
import java.lang.Exception;

class Weirdmodulo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int res = arr[0];
            for (int k = 1; k < n; k++) {
                if (res % arr[k] > arr[k] % res) {
                    res = res % arr[k];
                } else {
                    res = arr[k] % res;
                }
            }

            System.out.println(res);

        }
    }
}