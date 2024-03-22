import java.util.Scanner;
public class atvd07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador, maior, numero;
        contador = 0;
        maior = Integer.MIN_VALUE;

        while (contador < 5) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
            contador++;
        }
     System.out.println("O maior número é: " + maior);
        scanner.close();
    }
    
}
