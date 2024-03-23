import java.util.Scanner;
public class atvd09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Apenas números ímpares(entre 1 e 50):");
        for (int numero = 1; numero <= 50; numero++) {
            if (numero % 2 != 0) {
                System.out.println(numero);  
            }
        }
        scanner.close();
    }
}

