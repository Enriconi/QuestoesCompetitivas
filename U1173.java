import java.util.Scanner;

public class U1173 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int v[] = new int[10];
        
        v[0] = scan.nextInt();
        System.out.println("N[0] = " + v[0]);
        for(int j = 1; j < 10; j++) {
            v[j] = v[j - 1] * 2;
            System.out.println("N[" + j + "] = " + v[j]);
        }
    }
}
