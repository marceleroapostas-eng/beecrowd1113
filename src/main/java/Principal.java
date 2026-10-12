
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        while (true) {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            if (x == y) {
                break;
            }

            if (x < y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }

        }
        leitor.close();
    }
}
