import java.util.Scanner;

public class U1180 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        int indice = 0, menor = 100000;
    
        int n = scan.nextInt();
        int v[] = new int[n];

        for(int j = 0; j < n; j++) {
            v[j] = scan.nextInt();
            if (v[j] < menor) {
                menor = v[j];
                indice = j;
            }
        }
        System.out.println("Menor valor: " + menor);
        System.out.println("Posicao: " + indice);
    }
}
