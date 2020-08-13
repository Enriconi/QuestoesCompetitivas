import java.util.Scanner;

public class U1179 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int par[] = new int[5];
        int impar[] = new int[5];
        int k = 0, l = 0;
        for(int j = 0; j < 15; j++) {

            int n = scan.nextInt();

            if (n % 2 == 0) {
                par[k] = n;
                k++;
                if (k == 5) {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("par[" + i + "] = " + par[i]);
                    }
                    k = 0;
                }
            } else {
                impar[l] = n;
                l++;
                if (l == 5) {
                    for (int z = 0; z < 5; z++) {
                        System.out.println("impar[" + z + "] = " + impar[z]);
                    }
                    l = 0;
                }
            }
        }
        for (int i = 0; i < l; i++) {
            System.out.println("impar[" + i + "] = " + impar[i]);
        }
        for (int m = 0; m < k; m++) {
            System.out.println("par[" + m + "] = " + par[m]);
        }
    }
}
