import java.util.Scanner;
public class atvd06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Números um abaixo do outro:");
        for (int numero = 1; numero <= 20; numero++) {
            System.out.println(numero);
        }
        
        System.out.println("\nNúmeros um do lado do outro:");
        for (int numero = 1; numero <= 20; numero++) {
            System.out.print(numero + " ");
        }
        scanner.close();
    }
}

