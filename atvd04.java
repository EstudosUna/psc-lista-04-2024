import java.util.Scanner;

public class atvd04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double paisA, paisB, taxaA, taxaB;
        int anos;
        
        paisA = 80000;
        paisB = 200000;
        taxaA = 3.0 / 100;
        taxaB = 1.5 / 100;
        anos = 0;

        for (int i = 0; i < 1000; i++) {
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
