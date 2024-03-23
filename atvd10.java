import java.util.Random;
import java.util.Scanner;

public class atvd10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        System.out.println("Digite o primeiro número");
        n1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextInt();

        System.out.println("Primeiro número aleatório: " + random.nextInt(n1, n2));
        System.out.println("Segundo número aleatório: " + random.nextInt(n1, n2));

        scanner.close();
        random.getClass();
    }
}
