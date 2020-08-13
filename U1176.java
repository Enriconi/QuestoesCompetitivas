import java.util.Scanner;

public class U1176 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a;
        long v[] = new long[61];

        v[0] = 0;
        v[1] = 1;

        for (int j = 2; j <= 60; j++) {
            v[j] = v[j - 1] + v[j - 2];
        }

        for (int i = 0; i < n; i++) {
            a = scan.nextInt();
            System.out.println("Fib(" + a + ") = " + v[a]);
        }
    }
}
