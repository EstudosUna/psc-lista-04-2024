import java.util.Scanner;

public class atvd05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paisA, paisB, taxaA, taxaB;
        int anos;
        
        System.out.println("Digite o número de habitantes do país A: ");
        paisA = scanner.nextDouble();
        System.out.println("Digite o número de habitantes do país B: ");
        paisB = scanner.nextDouble();
        System.out.println("Digite a taxa de crescimento do país A: ");
        taxaA = scanner.nextDouble() / 100;
        System.out.println("Digite a taxa de crescimento do país B: ");
        taxaB = scanner.nextDouble() / 100;
        anos = 0;

        for (int i = 0; i < ++i; i++) {
            if (paisA >= paisB)
            {
                break;
            }
            
            paisA += (paisA * taxaA);
            paisB += (paisB * taxaB);
            anos++;
            System.out.println("Anos necessários: " + anos);
        }
        scanner.close();
    }
}
