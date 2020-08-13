import java.util.Scanner;

public class U1005 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double a = scan.nextDouble();
        double b = scan.nextDouble();

        double x = ((a * 3.5) + (b * 7.5)) / 11;

        System.out.printf("MEDIA = %.5f\n", x);
    }

}
