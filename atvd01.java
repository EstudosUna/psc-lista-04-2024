import java.util.Scanner;

public class atvd01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        if (nota >= 0 && nota <= 10) {
            System.out.println("Nota válida. " + nota);
        } else {
            System.out.println("Nota inválida , por favor digite uma nota entre 0 e 10.");
        }

        
        scanner.close();
    }
    
}