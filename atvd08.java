import java.util.Scanner;
public class atvd08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n1, n2, n3, n4, n5, soma, media;
        
        System.out.println("Digite o primeiro número: ");
        n1 = scanner.nextDouble();
        System.out.println("Digite o segundo número: ");
        n2 = scanner.nextDouble();
        System.out.println("Digite o terceiro número: ");
        n3 = scanner.nextDouble();
        System.out.println("Digite o quarto número: ");
        n4 = scanner.nextDouble();
        System.out.println("Digite o quinto número: ");
        n5 = scanner.nextDouble();

        soma = n1 + n2 + n3 + n4 + n5;
        media = soma / 5;
        
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
        scanner.close();
    }
}
