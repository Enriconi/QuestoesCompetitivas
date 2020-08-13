import java.util.Scanner;

public class U1181 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        float matriz[][] = new float[12][12];

        int linha = scan.nextInt();
        String calculo = scan.next();
        float aux = 0;

        for(int m = 0; m < 12; m++) {
            for(int n = 0; n < 12; n++) {
                matriz[m][n] = scan.nextFloat();
                if(m == linha) {
                    aux += matriz[m][n];
                }
            }
        }
        if (calculo.equals("S")) {
            System.out.printf("%.1f\n", aux);
        } 

        if (calculo.equals("M")) {
            System.out.printf("%.1f\n", (aux/12));
        }
    }
}
