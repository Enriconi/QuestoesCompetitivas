import java.util.Scanner;

public class U1002 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double area = scan.nextDouble();
        double formula = 3.14159 * (area * area);

        System.out.printf("A=%.4f\n", formula);
    }

}
