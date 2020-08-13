import java.util.Scanner;

public class U1174 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double v[] = new double[100];
        
        for(int i = 0; i < 100; i++) {
            v[i] = scan.nextDouble(); 
        }

        for(int j = 0; j < 100; j++) {
            if (v[j] <= 10) {
                System.out.println("A[" + j + "] = " + v[j]);
            }
        }
    }
}
