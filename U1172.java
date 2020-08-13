import java.util.Scanner;

public class U1172 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int v[] = new int[10];
        
        for(int i = 0; i < 10; i++) {
            v[i] = scan.nextInt(); 
            if (v[i] <= 0) {
                v[i] = 1;
            }
        }

        for(int j = 0; j < 10; j++) {
         System.out.println("X[" + j + "] = " + v[j]);
        }
    }
}
