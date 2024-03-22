import java.util.Scanner;
public class atvd03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        do {
            System.out.println("Digite um nome (maior que 3 caracteres): ");
            nome = scanner.nextLine();
        } while (nome.length() <= 3);
        
        int idade;
        do {
            System.out.println("Digite uma idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);

        double salario;
        do {
            System.out.println("Digite um salário (maior que zero): ");
            salario = scanner.nextDouble();
        } while (salario <= 0);

        char sexo;
        do {
            System.out.println("Digite um sexo ('f' ou 'm'): ");
            sexo = scanner.next().charAt(0);
        } while (sexo != 'f' && sexo != 'm');

        char eC;
        do{
            System.out.println("Digite um Estado Civil ('s', 'c', 'v', 'd'): ");
            eC = scanner.next().charAt(0);
        } while (eC != 's' && eC != 'c' && eC != 'v' && eC != 'd');

        System.out.println("\nInformacoes válidas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + eC);
        
        scanner.close();
    }
}

